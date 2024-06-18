SELECT 
    a.AUTHOR_ID,
    a.AUTHOR_NAME,
    b.CATEGORY,
    SUM(bs.SALES * b.PRICE) AS TOTAL_SALES 
FROM BOOK_SALES bs
INNER JOIN BOOK b ON bs.BOOK_ID = b.BOOK_ID
INNER JOIN AUTHOR a ON b.AUTHOR_ID = a.AUTHOR_ID
WHERE bs.SALES_DATE LIKE '2022-01%'
GROUP BY b.CATEGORY, b.AUTHOR_ID
ORDER BY a.AUTHOR_ID ASC, b.CATEGORY DESC
;