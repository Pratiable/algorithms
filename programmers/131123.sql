-- CTE
WITH FAVORITES_RANK AS (
    SELECT 
        REST_ID,
        RANK() OVER (PARTITION BY FOOD_TYPE ORDER BY FAVORITES DESC) AS F_RANK
    FROM REST_INFO
)

SELECT ri.FOOD_TYPE, ri.REST_ID, ri.REST_NAME, ri.FAVORITES
FROM REST_INFO ri
INNER JOIN FAVORITES_RANK fr USING (REST_ID)
WHERE fr.F_RANK = 1
ORDER BY FOOD_TYPE DESC

-- GROUP BY SUBQUERY
SELECT FOOD_TYPE, REST_ID, REST_NAME, FAVORITES
FROM REST_INFO
WHERE (FOOD_TYPE, FAVORITES) IN (
    SELECT
        FOOD_TYPE,
        MAX(FAVORITES)
    FROM REST_INFO
    GROUP BY FOOD_TYPE
)
ORDER BY FOOD_TYPE DESC