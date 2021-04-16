#!/bin/bash
mysql -u root -proot <<MY_QUERY

CREATE USER 'user1'@'localhost' IDENTIFIED BY 'root';
GRANT ALL ON RVCE.* TO 'user1'@'localhost';
select user from mysql.user1;

MY_QUERY