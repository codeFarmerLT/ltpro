-- 数据库脚本初始化

-- 创建数据库
CREATE DATABASE db_test;
-- 使用数据库
USE  db_test;
-- 创建用户表
CREATE TABLE t_user(
  user_id INT NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  user_name VARCHAR(20) NOT NULL COMMENT '用户名',
  sex CHAR(2) COMMENT '性别',
  create_time TIMESTAMP DEFAULT current_timestamp COMMENT '创建时间',
  PRIMARY KEY (user_id),
  KEY idx_create_time(create_time)
)ENGINE = InnoDB AUTO_INCREMENT= 1 DEFAULT CHARSET = utf8 COMMENT = '用户表'