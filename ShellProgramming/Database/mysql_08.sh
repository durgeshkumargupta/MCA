#!/bin/bash
mysql -u root -proot <<MY_QUERY
use RVCE;

desc Authors;
ALTER table Authors Add Address Varchar(20);
desc Authors;

MY_QUERY
