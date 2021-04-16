#!/bin/bash
mysql -u RVCE -proot <<MY_QUERY
use RVCE;

Drop database RVCE;

MY_QUERY