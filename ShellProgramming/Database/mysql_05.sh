#!/bin/bash
mysql -u root -proot <<MY_QUERY
use RVCE;

insert into Authors(name) values('Durgesh');
insert into Authors(name) values('Prince Kumar');
insert into Authors(name) values('Adity Kumar');
insert into Authors(name) values('Jane Austen');
insert into Authors(name) values('George Orwell');
insert into Authors(name) values('Ossecan Wilde');

MY_QUERY
