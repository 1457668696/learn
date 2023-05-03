         -- 查询两列
		 
SELECT name,age FROM stu;


#       去除重复distinct

SELECT DISTINCT address FROM stu;



#         别名as或者空格

SELECT name,math 数学,english 英语 FROM stu;


#          年龄大于20

SELECT * FROM stu WHERE age>20;


#            查询区间

SELECT * FROM stu WHERE age>=20 AND age<30;


#            出生区间

SELECT * FROM stu WHERE hire_date BETWEEN '1998-09-01' and '1999-9-01';

#             等于或者不等于

SELECT * FROM stu WHERE age=18 or age!=20;


#             判断是否为null

SELECT * FROM stu WHERE english is not null;



#            通配符，_占位一个，占全部
SELECT * FROM stu where name LIKE '马%';       #第一个是马
SELECT * FROM stu where name LIKE '_花%';      #第二个是花
SELECT * FROM stu where name LIKE '%德%';      #包含德的字



#             默认升序排列ase,降序desc

SELECT * FROM stu ORDER BY age;
 
SELECT * FROM stu ORDER BY age DESC;

SELECT * FROM stu ORDER BY math desc,english asc;     #先数学降序，相同就英语


#             分页查询(开始索引，查询条数)
SELECT * FROM stu LIMIT 0,3;            #从0查询3条

 SELECT * FROM stu LIMIT 3,3;               #第二页
  SELECT * FROM stu LIMIT 6,3;              #第三页


             #聚合函数
SELECT SUM(math) FROM stu;
select AVG(math) FROM stu;
SELECT MIN(math) FROM stu;
SELECT COUNT(*) FROM stu;
SELECT MIN(english) FROM stu; #null不参与计算


              #分组查询,前边不是聚合函数或者和分组无关的数据是无意义的。

SELECT sex,AVG(math) from stu group by sex;
SELECT sex,avg(math),COUNT(*) FROM stu GROUP BY sex;


 SELECT sex,AVG(math),COUNT(*) FROM stu WHERE math>70 ORDER BY sex #having   h分组后过滤（聚合函数，或者分组计算）