#!/bin/bash
mysql -u root -proot <<MY_QUERY
use RVCE;

insert into Authors(name) values('william shakespeare');
insert into Authors(name) values('Charles Dickens');
insert into Authors(name) values('Jane Austen');
insert into Authors(name) values('George Orwell');
insert into Authors(name) values('Ossecan Wilde');

MY_QUERY
