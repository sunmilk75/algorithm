SELECT
    he.EMP_NO,
    he.EMP_NAME,
    CASE
        WHEN hg.SCORE >= 96 THEN 'S'
        WHEN hg.SCORE < 96 AND hg.SCORE >= 90 THEN 'A'
        WHEN hg.SCORE < 90 AND hg.SCORE >= 80 THEN 'B'
        ELSE 'C'
    END AS GRADE,
    CASE
        WHEN hg.SCORE >= 96 THEN he.SAL * 0.2
        WHEN hg.SCORE < 96 AND hg.SCORE >= 90 THEN he.SAL * 0.15
        WHEN hg.SCORE < 90 AND hg.SCORE >= 80 THEN he.SAL * 0.1
        ELSE 0
    END AS BONUS
FROM HR_EMPLOYEES he
INNER JOIN
(
    SELECT
        EMP_NO,
        SUM(SCORE)/2 AS SCORE
    FROM HR_GRADE
    GROUP BY EMP_NO
)hg
ON he.EMP_NO = hg.EMP_NO
ORDER BY he.EMP_NO ASC;