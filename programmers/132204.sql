SELECT
    APNT_NO,
    p.PT_NAME,
    p.PT_NO,
    ap.MCDP_CD,
    d.DR_NAME,
    APNT_YMD
FROM
    APPOINTMENT ap
INNER JOIN
    PATIENT p USING (PT_NO)
INNER JOIN
    DOCTOR d ON d.DR_ID = ap.MDDR_ID
WHERE
    APNT_CNCL_YN = 'N'
    AND
    ap.MCDP_CD = 'CS'
    AND
    APNT_YMD >= '2022-04-13' AND APNT_YMD < '2022-04-14'
ORDER BY APNT_YMD;