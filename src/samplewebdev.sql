Create database samplewebdev;

create table user (
id int not null auto_increment,
firstname varchar(255) not null,
lastname varchar(255),
userid varchar(20),
address varchar(255),
city varchar(20),
PRIMARY KEY (id)
);