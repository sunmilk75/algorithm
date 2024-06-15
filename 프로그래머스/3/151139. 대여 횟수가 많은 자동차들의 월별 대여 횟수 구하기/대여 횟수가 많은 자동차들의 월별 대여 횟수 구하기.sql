SELECT MONTH(START_DATE)as MONTH,CAR_ID as CAR_ID,COUNT(*) AS RECORDS
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
WHERE month(start_date) BETWEEN 8 AND 10 AND
CAR_ID IN
(
SELECT CAR_ID
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
WHERE MONTH(START_DATE) BETWEEN 8 AND 10  
GROUP BY CAR_ID
HAVING COUNT(*) >4
)
GROUP BY CAR_ID, MONTH(START_DATE)
ORDER BY MONTH ASC, CAR_ID DESC
;