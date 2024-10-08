# SELECT FLOOR(PRICE/10000)*10000 AS PRICE_GROUP FROM PRODUCT;

SELECT
    CASE
        WHEN f.PRODUCT_GROUP < 1 THEN 0
        WHEN f.PRODUCT_GROUP > 0 THEN f.PRODUCT_GROUP*10000
        END AS PRODUCT_GROUP,
    COUNT(*)
FROM
(
    SELECT FLOOR(PRICE/10000) AS PRODUCT_GROUP FROM PRODUCT
)f
GROUP BY PRODUCT_GROUP
ORDER BY PRODUCT_GROUP ASC
;