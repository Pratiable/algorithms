-- OUTER JOIN
SELECT ai.NAME, ai.DATETIME
FROM ANIMAL_INS ai
LEFT OUTER JOIN ANIMAL_OUTS ao ON ao.ANIMAL_ID = ai.ANIMAL_ID
WHERE ao.ANIMAL_ID IS NULL
ORDER BY ai.DATETIME
LIMIT 3;

-- SUBQUERY
SELECT NAME, DATETIME
FROM ANIMAL_INS ai
WHERE NOT EXISTS(
    SELECT 1
    FROM ANIMAL_OUTS ao
    WHERE ao.ANIMAL_ID = ai.ANIMAL_ID
)
ORDER BY DATETIME
LIMIT 3;