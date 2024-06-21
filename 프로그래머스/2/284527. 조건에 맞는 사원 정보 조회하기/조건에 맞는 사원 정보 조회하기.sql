SELECT 
    hg.SCORE,
    he.EMP_NO,
    he.EMP_NAME,
    he.POSITION,
    he.EMAIL 
FROM HR_EMPLOYEES he
INNER JOIN (
    SELECT EMP_NO, SUM(SCORE) AS SCORE 
    FROM HR_GRADE GROUP BY EMP_NO
) hg
ON he.EMP_NO = hg.EMP_NO
ORDER BY SCORE DESC
LIMIT 1;