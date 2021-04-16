#!/bin/bash
mysql -u root -proot <<MY_QUERY
use RVCE;

drop table Authors;

MY_QUERY
