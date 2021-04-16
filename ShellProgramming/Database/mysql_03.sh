#!/bin/bash
mysql -u root -proot <<MY_QUERY

CREATE USER 'user2'@'localhost' IDENTIFIED BY 'root';
GRANT ALL ON RVCE.* TO 'user2'@'localhost';
select user from mysql.user;

MY_QUERY
