SELECT
    fh.FLAVOR
FROM
    FIRST_HALF fh
LEFT JOIN
    JULY j USING (FLAVOR)
GROUP BY
    FLAVOR
ORDER BY
    fh.TOTAL_ORDER + SUM(j.TOTAL_ORDER) DESC
LIMIT 3;