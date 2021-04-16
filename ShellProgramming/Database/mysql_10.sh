#!/bin/bash
mysql -u root -proot <<MY_QUERY
use RVCE;

Drop database RVCE;

MY_QUERY
