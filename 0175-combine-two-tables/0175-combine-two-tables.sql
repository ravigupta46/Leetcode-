# Write your MySQL query statement below
SELECT firstNAME,lastNAME,city,state
FROM Person
LEFT OUTER JOIN Address
on Person.personId=Address.personId;


