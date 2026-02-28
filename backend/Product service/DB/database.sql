/*
SQLyog - Free MySQL GUI v5.13
Host - 5.0.22-community-nt : Database - fakeproduct
*********************************************************************
Server version : 5.0.22-community-nt
*/

SET NAMES utf8;

SET SQL_MODE='';

create database if not exists `fakeproduct`;

USE `fakeproduct`;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO';

/*Table structure for table `admin` */

DROP TABLE IF EXISTS `admin`;

CREATE TABLE `admin` (
  `username` varchar(20) default NULL,
  `password` varchar(20) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `admin` */

insert into `admin` (`username`,`password`) values ('admin','admin');

/*Table structure for table `approval` */

DROP TABLE IF EXISTS `approval`;

CREATE TABLE `approval` (
  `qrvalue` varchar(500) default NULL,
  `username` varchar(50) default NULL,
  `currentdate` date default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `approval` */

insert into `approval` (`qrvalue`,`username`,`currentdate`) values ('velvrelvel','pan','2021-03-15');
insert into `approval` (`qrvalue`,`username`,`currentdate`) values ('velvrelvel','vel','2021-03-15');
insert into `approval` (`qrvalue`,`username`,`currentdate`) values ('velvrelvel','vel','2021-03-25');
insert into `approval` (`qrvalue`,`username`,`currentdate`) values ('http://www.geeksforgeeks.org','haarish','2021-03-26');
insert into `approval` (`qrvalue`,`username`,`currentdate`) values ('http://www.geeksforgeeks.org','gobi','2021-03-26');
insert into `approval` (`qrvalue`,`username`,`currentdate`) values ('one plus 8t8 gb ram','gobi','2021-03-26');
insert into `approval` (`qrvalue`,`username`,`currentdate`) values ('POCOX2Good`','pan','2021-04-01');

/*Table structure for table `dist` */

DROP TABLE IF EXISTS `dist`;

CREATE TABLE `dist` (
  `username` varchar(200) default NULL,
  `password` varchar(200) default NULL,
  `email` varchar(200) default NULL,
  `phonenumber` varchar(200) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `dist` */

insert into `dist` (`username`,`password`,`email`,`phonenumber`) values ('vel','vel','9566888724','msvel360@gmail.com');
insert into `dist` (`username`,`password`,`email`,`phonenumber`) values ('gobi','gobi','8903654881','gobinath1640@gmail.com');

/*Table structure for table `manufacturer` */

DROP TABLE IF EXISTS `manufacturer`;

CREATE TABLE `manufacturer` (
  `username` varchar(20) default NULL,
  `password` varchar(60) default NULL,
  `email` varchar(50) default NULL,
  `location` varchar(40) default NULL,
  `mobile` varchar(20) default NULL,
  `otp` varchar(20) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `manufacturer` */

insert into `manufacturer` (`username`,`password`,`email`,`location`,`mobile`,`otp`) values ('vel','vel','prabu.mk@pantechmail.com','porur','7339300411','266417');
insert into `manufacturer` (`username`,`password`,`email`,`location`,`mobile`,`otp`) values ('velmurugan','vel','prabu.mk@pantechmail.com','porur','7339300411','945464');

/*Table structure for table `product` */

DROP TABLE IF EXISTS `product`;

CREATE TABLE `product` (
  `name` varchar(200) default NULL,
  `model` varchar(200) default NULL,
  `description` varchar(200) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `product` */

insert into `product` (`name`,`model`,`description`) values ('vel','vel','vel');
insert into `product` (`name`,`model`,`description`) values ('vel','vrel','vel');
insert into `product` (`name`,`model`,`description`) values ('one plus ','8t','8 gb ram');
insert into `product` (`name`,`model`,`description`) values ('POCO','X2','Good`');

/*Table structure for table `retailor` */

DROP TABLE IF EXISTS `retailor`;

CREATE TABLE `retailor` (
  `username` varchar(200) default NULL,
  `password` varchar(200) default NULL,
  `email` varchar(200) default NULL,
  `phonenumber` varchar(200) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `retailor` */

insert into `retailor` (`username`,`password`,`email`,`phonenumber`) values ('pan','pan','8925533481','msvel360@gmail.com');
insert into `retailor` (`username`,`password`,`email`,`phonenumber`) values ('haarish','kumar','haarish999@gmail.com','9500176597');

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `username` varchar(200) default NULL,
  `password` varchar(200) default NULL,
  `email` varchar(200) default NULL,
  `phonenumber` varchar(200) default NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `user` */

insert into `user` (`username`,`password`,`email`,`phonenumber`) values ('a','s','a','a');
insert into `user` (`username`,`password`,`email`,`phonenumber`) values ('vel','vel','msvel360@gmail.com','7339300411');

SET SQL_MODE=@OLD_SQL_MODE;