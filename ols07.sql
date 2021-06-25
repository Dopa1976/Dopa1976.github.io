# Host: localhost:3307  (Version 5.7.3-m13)
# Date: 2018-11-30 11:12:26
# Generator: MySQL-Front 6.0  (Build 2.20)


#
# Structure for table "batch"
#

CREATE TABLE `batch` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `batch_name` varchar(50) NOT NULL,
  `star_time` date NOT NULL,
  `end_time` date NOT NULL,
  `batch_score` int(11) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

#
# Data for table "batch"
#

INSERT INTO `batch` VALUES (6,'2018-2019学年上半学期','2018-09-01','2019-01-31',2),(7,'2018-2019学年下半学期','2019-02-25','2019-06-30',4);

#
# Structure for table "course"
#

CREATE TABLE `course` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `course_name` varchar(50) NOT NULL,
  `coures_number` varchar(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

#
# Data for table "course"
#

INSERT INTO `course` VALUES (1,'高等数学','01'),(2,'大学英语','02'),(3,'UML','03'),(4,'语文','04'),(5,'Java','05'),(6,'sql server','06');

#
# Structure for table "courseware"
#

CREATE TABLE `courseware` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cw_name` varchar(50) NOT NULL,
  `cw_credit` int(11) DEFAULT NULL,
  `cw_adress` varchar(50) NOT NULL,
  `cw_type` varchar(1) NOT NULL,
  `course_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK9486ED185E830EA0` (`course_id`),
  CONSTRAINT `FK9486ED185E830EA0` FOREIGN KEY (`course_id`) REFERENCES `course` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8;

#
# Data for table "courseware"
#

INSERT INTO `courseware` VALUES (24,'数学',2,'201811292007test.mp4','1',1),(25,'语文',2,'201811292011test.mp4','1',4),(26,'英语',2,'201811292022test.mp4','1',2);

#
# Structure for table "batch_courseware"
#

CREATE TABLE `batch_courseware` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `cw_id` int(11) DEFAULT NULL,
  `batch_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKF0B5833DA36E27F4` (`batch_id`),
  KEY `FKF0B5833DE05E11A4` (`cw_id`),
  CONSTRAINT `FKF0B5833DA36E27F4` FOREIGN KEY (`batch_id`) REFERENCES `batch` (`id`),
  CONSTRAINT `FKF0B5833DE05E11A4` FOREIGN KEY (`cw_id`) REFERENCES `courseware` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=utf8;

#
# Data for table "batch_courseware"
#

INSERT INTO `batch_courseware` VALUES (24,24,6),(25,25,6),(26,26,6);

#
# Structure for table "menu"
#

CREATE TABLE `menu` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `sort_no` int(11) NOT NULL,
  `menu_name` varchar(50) NOT NULL,
  `address` varchar(50) NOT NULL,
  `parent_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK33155FEF4E1675` (`parent_id`),
  CONSTRAINT `FK33155FEF4E1675` FOREIGN KEY (`parent_id`) REFERENCES `menu` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8;

#
# Data for table "menu"
#

INSERT INTO `menu` VALUES (1,1,'业务管理','xx',NULL),(2,2,'课程管理','courseQuery',1),(3,1,'我的培训','xx',NULL),(4,2,'成绩查看','queryScorce',3),(5,2,'课件学习','queryBatchByUserId',3),(6,1,'用户管理','userInfoAction',NULL),(7,1,'角色权限管理','queryUserManager',NULL),(9,1,'角色管理','queryrole',NULL),(10,1,'菜单管理','menuQueryAction',NULL),(11,1,'用户角色管理','queryUserRoleAll',NULL),(12,1,'更改密码','querypasswordById',NULL),(13,2,'课件管理','CwqueryAll',1),(14,2,'批次管理','BaqueryAll',1),(15,2,'学习记录管理','LeaqueryAll',1),(16,2,'成绩管理','scoreQueryAll',1);

#
# Structure for table "role"
#

CREATE TABLE `role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role_name` varchar(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

#
# Data for table "role"
#

INSERT INTO `role` VALUES (1,'管理员'),(2,'普通用户');

#
# Structure for table "role_control"
#

CREATE TABLE `role_control` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role_id` int(11) DEFAULT NULL,
  `menu_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK4F87B694C5FB6640` (`role_id`),
  KEY `FK4F87B694AC8CD1A0` (`menu_id`),
  CONSTRAINT `FK4F87B694AC8CD1A0` FOREIGN KEY (`menu_id`) REFERENCES `menu` (`id`),
  CONSTRAINT `FK4F87B694C5FB6640` FOREIGN KEY (`role_id`) REFERENCES `role` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=39 DEFAULT CHARSET=utf8;

#
# Data for table "role_control"
#

INSERT INTO `role_control` VALUES (1,1,1),(2,1,2),(3,1,6),(4,1,7),(5,1,9),(6,1,10),(7,1,11),(8,1,12),(9,1,13),(10,1,14),(11,1,15),(12,1,16),(27,2,3),(28,2,4),(29,2,5),(33,2,12);

#
# Structure for table "userinfo"
#

CREATE TABLE `userinfo` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_account` varchar(20) NOT NULL,
  `user_password` varchar(20) NOT NULL,
  `status` varchar(20) DEFAULT '0',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=179 DEFAULT CHARSET=utf8;

#
# Data for table "userinfo"
#

INSERT INTO `userinfo` VALUES (1,'root','123456','1'),(159,'account','123456','1'),(172,'test1','123456','1'),(173,'test2','123456','1'),(174,'test3','123456','1'),(175,'test4','123456','1'),(178,'test5','123456','1');

#
# Structure for table "user_role"
#

CREATE TABLE `user_role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` int(11) DEFAULT NULL,
  `role_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK143BF46ACC3A926E` (`user_id`),
  KEY `FK143BF46AC5FB6640` (`role_id`),
  CONSTRAINT `FK143BF46AC5FB6640` FOREIGN KEY (`role_id`) REFERENCES `role` (`id`),
  CONSTRAINT `FK143BF46ACC3A926E` FOREIGN KEY (`user_id`) REFERENCES `userinfo` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=31 DEFAULT CHARSET=utf8;

#
# Data for table "user_role"
#

INSERT INTO `user_role` VALUES (1,1,1),(2,159,2),(23,172,2),(24,173,2),(25,174,2),(26,175,2);

#
# Structure for table "score"
#

CREATE TABLE `score` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `score` int(11) DEFAULT NULL,
  `user_id` int(11) DEFAULT NULL,
  `batch_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK6833E92CC3A926E` (`user_id`),
  KEY `FK6833E92A36E27F4` (`batch_id`),
  CONSTRAINT `FK6833E92A36E27F4` FOREIGN KEY (`batch_id`) REFERENCES `batch` (`id`),
  CONSTRAINT `FK6833E92CC3A926E` FOREIGN KEY (`user_id`) REFERENCES `userinfo` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=37 DEFAULT CHARSET=utf8;

#
# Data for table "score"
#

INSERT INTO `score` VALUES (28,11,159,6),(29,20,172,6),(30,21,173,6),(31,22,174,6),(32,23,175,6),(33,0,172,7),(34,0,173,7),(35,0,174,7),(36,0,175,7);

#
# Structure for table "lea_record"
#

CREATE TABLE `lea_record` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `play_time` varchar(50) NOT NULL DEFAULT '00:00:00',
  `times` date NOT NULL,
  `total_length` varchar(50) NOT NULL DEFAULT '00:00:00',
  `finish` varchar(1) NOT NULL,
  `user_id` int(11) DEFAULT NULL,
  `batch_id` int(11) DEFAULT NULL,
  `cw_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK5403EE68CC3A926E` (`user_id`),
  KEY `FK5403EE68A36E27F4` (`batch_id`),
  KEY `FK5403EE68E05E11A4` (`cw_id`),
  CONSTRAINT `FK5403EE68A36E27F4` FOREIGN KEY (`batch_id`) REFERENCES `batch` (`id`),
  CONSTRAINT `FK5403EE68CC3A926E` FOREIGN KEY (`user_id`) REFERENCES `userinfo` (`id`),
  CONSTRAINT `FK5403EE68E05E11A4` FOREIGN KEY (`cw_id`) REFERENCES `courseware` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

#
# Data for table "lea_record"
#

