\echo 'Все роботы:'
SELECT * 
  FROM Jaegers;

\echo 'Не уничтоженные роботы:'
SELECT * 
  FROM Jaegers 
 WHERE status = 'Active';

\echo 'Роботы из серии Mark-1 и Mark-4:'
SELECT * 
  FROM Jaegers 
 WHERE mark IN ('Mark-1', 'Mark-4');

\echo 'Роботы из всех серий кроме Mark-1 и Mark-4:'
SELECT * 
  FROM Jaegers 
 WHERE mark NOT IN ('Mark-1', 'Mark-4');

\echo 'Таблица по убыванию по столбцу mark:'
SELECT * 
  FROM Jaegers 
 ORDER BY mark DESC;

\echo 'Информация о самом старом роботе:'
SELECT * 
  FROM Jaegers 
 WHERE launch = (
                 SELECT MIN(launch) 
                   FROM Jaegers
                 );

\echo 'Роботы которые уничтожили больше всех kaiju:'
SELECT * 
  FROM Jaegers 
 WHERE kaijuKill = (
                    SELECT MAX(kaijuKill) 
                      FROM Jaegers
                    );

\echo 'Средний вес роботов:'
SELECT AVG(weight) 
  FROM Jaegers; 

\echo 'Увеличение на единицу кол-во уничтоженных kaiju  у роботов, которые до сих пор не разрушены:'
UPDATE Jaegers 
   SET kaijuKill = kaijuKill + 1 
 WHERE status = 'Active';

\echo 'Удаление уничтоженных роботов:'
DELETE 
  FROM Jaegers 
 WHERE status = 'Destroyed';