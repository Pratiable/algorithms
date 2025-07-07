WITH TRUCK_RENTAL_PERIOD AS (
    SELECT
        HISTORY_ID,
        ch.CAR_ID,
        DATEDIFF(END_DATE, START_DATE) + 1 AS PERIOD,
        cc.DAILY_FEE
    FROM
        CAR_RENTAL_COMPANY_RENTAL_HISTORY ch
    INNER JOIN
        CAR_RENTAL_COMPANY_CAR cc ON cc.CAR_ID = ch.CAR_ID
    WHERE
        cc.CAR_TYPE = '트럭'
),
    TRUCK_RENTAL_DISCOUNT_PLAN AS (
    SELECT
        HISTORY_ID,
        CAR_ID,
        PERIOD,
        IFNULL(DISCOUNT_RATE, 0) DISCOUNT_RATE,
        DAILY_FEE
    FROM TRUCK_RENTAL_PERIOD tp
    LEFT JOIN
        (
            SELECT *
            FROM
                CAR_RENTAL_COMPANY_DISCOUNT_PLAN
            WHERE
                CAR_TYPE = '트럭'
        ) cp ON cp.DURATION_TYPE = (
        CASE
            WHEN tp.PERIOD >= 90 THEN '90일 이상'
            WHEN tp.PERIOD >= 30 THEN '30일 이상'
            WHEN tp.PERIOD >= 7  THEN '7일 이상'
            ELSE NULL
        END
    )
)

SELECT
    HISTORY_ID,
    FLOOR((DAILY_FEE * (1 - DISCOUNT_RATE / 100)) * PERIOD) FEE
FROM
    TRUCK_RENTAL_DISCOUNT_PLAN
ORDER BY
    FEE DESC,
    HISTORY_ID DESC