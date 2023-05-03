-- 增加
INSERT INTO tb_user ( 
username, 
PASSWORD, 
gender, 
addr 
)
VALUES( 
	'红麻子', 
	1234, 
	'男', 
	'北京' 
	);
							
-- 修改
UPDATE tb_user SET username='和平' where	id=1;		
UPDATE tb_user SET password=991021 where id=1;
							
							
-- 删除							
DELETE FROM tb_user WHERE username='红麻子';
DELETE FROM tb_user WHERE username='王麻子';								
							
SELECT * FROM tb_user

CREATE TABLE emp(
                    id INT primary KEY auto_increment ,        #主键约束自增长
                       ename VARCHAR(50) not null UNIQUE,          非空唯一约束
                       joindate DATE not null,                       非空
                       salary DOUBLE(7,2) not null,                  非空
                       bouns DOUBLE(7,2) DEFAULT 0                  默认为0,null不是0

)

SELECT * FROM emp;


INSERT into emp() VALUES
    (2,'李四','1999-10-21',6500,6000);


也可以建表以后更新约束