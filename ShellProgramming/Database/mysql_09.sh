#!/bin/bash
mysql -u RVCE -proot <<MY_QUERY
use RVCE;

drop table Authors;

MY_QUERY