#!/bin/bash
mysql -u root -proot <<MY_QUERY
use RVCE;
create table Authors(Id INT PRIMARY KEY AUTO INCREMENT,Name VARCHAR(25));
MY_QUERY
