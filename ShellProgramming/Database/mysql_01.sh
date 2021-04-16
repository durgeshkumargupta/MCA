#!/bin/bash
mysql -u root -proot <<MY_QUERY
SELECT VERSION();
MY_QUERY