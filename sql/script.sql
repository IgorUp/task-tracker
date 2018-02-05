create database tracer;

drop table roles
drop table users
drop table projects

 FOREIGN KEY (customer_id) REFERENCES customers(customer_id)

create table `roles`(
`id` int primary key AUTO_INCREMENT,
`value` varchar(100)
);

create table `users_reg`(
`id` int auto_increment primary key,
`email` varchar(100),
`password` varchar(100),
`code_active` varchar(100),
`bdate` date
);

create table `users`(
`id` int auto_increment primary key,
`email` varchar(100),
`password` varchar(100),
`name` varchar(100),
`role` varchar(100)
);

create table `projects`(
`id` int auto_increment primary key,
`name_project` varchar(100),
`bdate` date,
`edate` date,
`id_user` int,
foreign key (`id_user`) references `users`(`id`)
);


create table `tasks`(
`id` int auto_increment primary key,
`name_task` varchar(100),
`status` varchar(100),
`bdate` date,
`edate` date,
`id_user` int,
`id_project` int,
foreign key (`id_user`) references `users`(`id`),
foreign key (`id_project`) references `projects`(`id`)
);

create table `commentsusers`(
`id` int auto_increment primary key,
`comment` varchar(100),
`bdate` date,
`edate` date,
`status` varchar(100),
`id_task` int,
`id_user` int,
foreign key (`id_task`) references `tasks`(`id`),
foreign key (`id_user`) references `users`(`id`)
);