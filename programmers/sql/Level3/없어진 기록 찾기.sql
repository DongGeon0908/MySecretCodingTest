-- LEFT OUTER JOIN ~ ON <- 원하는 테이블이 = B
SELECT A.ANIMAL_ID, A.NAME
FROM ANIMAL_OUTS A 
LEFT OUTER JOIN
ANIMAL_INS B
ON A.ANIMAL_ID = B.ANIMAL_ID
WHERE B.ANIMAL_ID IS NULL;