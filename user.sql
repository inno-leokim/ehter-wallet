show databases;

create database board;

# create user 'keymamo'@'localhost' identified by 'kind0314';

# grant all on `board`.* to 'keymamo'@'localhost' with grant option;

# show grants for 'keymamo'@'localhost';

CREATE USER 'brand13'@'172.17.0.1' IDENTIFIED BY 'kind0314';

grant all on `board`.* to 'brand13'@'172.17.0.1' with grant option;

select `user` from `mysql`.`user`;

show grants for 'brand13'@'172.17.0.1';

flush privileges;