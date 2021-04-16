#!/bin/bash
mysql -u root -proot <<MY_QUERY
use RVCE;

delete from Authors WHERE id=1;
select * form Authors;

MY_QUERY
