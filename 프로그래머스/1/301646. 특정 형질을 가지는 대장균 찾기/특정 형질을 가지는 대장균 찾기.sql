SELECT COUNT(*) AS 'COUNT' FROM ECOLI_DATA ed
WHERE
    (ed.GENOTYPE & 2 = 0)
AND
    ((ed.GENOTYPE & 1 != 0) OR (ed.GENOTYPE & 4 != 0))

;