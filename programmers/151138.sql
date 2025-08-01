SELECT
    HISTORY_ID,
    CAR_ID,
    DATE_FORMAT(START_DATE, "%Y-%m-%d") START_DATE,
    DATE_FORMAT(END_DATE, "%Y-%m-%d") END_DATE,
    IF(DATEDIFF(END_DATE, START_DATE) >= 29, "장기 대여", "단기 대여") RENT_TYPE
FROM
    CAR_RENTAL_COMPANY_RENTAL_HISTORY
WHERE
    START_DATE >= '2022-09-01' AND START_DATE < '2022-10-01'
ORDER BY
    HISTORY_ID DESC
    