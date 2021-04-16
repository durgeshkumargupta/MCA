#!/bin/bash
mysql -u RVCE -proot <<MY_QUERY
use RVCE;

Update Authors SET name='Mansi joshi' WHERE id=1;
select * form Authors;

MY_QUERY