/*
SQLyog 企业版 - MySQL GUI v8.14 
MySQL - 5.1.40-community : Database - blog
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`blog` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `blog`;

/*Table structure for table `article` */

DROP TABLE IF EXISTS `article`;

CREATE TABLE `article` (
  `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `title` varchar(256) DEFAULT NULL COMMENT '标题',
  `content` text COMMENT '内容',
  `views` int(20) DEFAULT NULL COMMENT '浏览次数',
  `gmt_created` datetime DEFAULT NULL COMMENT '创建时间',
  `gmt_modified` datetime DEFAULT NULL COMMENT '修改时间',
  `category_id` int(20) DEFAULT NULL COMMENT '类别编号',
  `comments_number` int(20) DEFAULT NULL COMMENT '评论编号',
  `show_max_length` int(20) DEFAULT NULL COMMENT '文章显示长度',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='文章';

/*Data for the table `article` */

/*Table structure for table `article_category` */

DROP TABLE IF EXISTS `article_category`;

CREATE TABLE `article_category` (
  `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `article_id` int(20) DEFAULT NULL COMMENT '文章ID',
  `category_id` int(20) DEFAULT NULL COMMENT '类别ID',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='文章类别';

/*Data for the table `article_category` */

/*Table structure for table `article_label` */

DROP TABLE IF EXISTS `article_label`;

CREATE TABLE `article_label` (
  `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `article_id` int(20) DEFAULT NULL COMMENT '文章ID',
  `label_id` int(20) DEFAULT NULL COMMENT '标签ID',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='文章标签';

/*Data for the table `article_label` */

/*Table structure for table `category` */

DROP TABLE IF EXISTS `category`;

CREATE TABLE `category` (
  `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `name` varchar(50) DEFAULT NULL COMMENT '类别名称',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='类别表';

/*Data for the table `category` */

/*Table structure for table `comments` */

DROP TABLE IF EXISTS `comments`;

CREATE TABLE `comments` (
  `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `name` varchar(50) DEFAULT NULL COMMENT '姓名昵称',
  `email` varchar(100) DEFAULT NULL COMMENT '邮箱',
  `ip` varchar(100) DEFAULT NULL COMMENT 'IP地址',
  `content` text COMMENT '内容',
  `type` varchar(1) DEFAULT NULL COMMENT '评论类型',
  `object_id` int(20) DEFAULT NULL COMMENT '评论对象编号',
  `gmt_created` datetime DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='评论';

/*Data for the table `comments` */

/*Table structure for table `labels` */

DROP TABLE IF EXISTS `labels`;

CREATE TABLE `labels` (
  `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `name` varchar(50) DEFAULT NULL COMMENT '标签名称',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT=' 标签';

/*Data for the table `labels` */

/*Table structure for table `information` */

DROP TABLE IF EXISTS `information`;

CREATE TABLE `information` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `about_me` text COMMENT '关于我',
  `contact_me` text COMMENT '联系我',
  `gmt_created` datetime DEFAULT NULL COMMENT '创建时间',
  `gmt_modified` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='基本信息';

/*Data for the table `information` */

/*Table structure for table `message` */

DROP TABLE IF EXISTS `message`;

CREATE TABLE `message` (
  `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `name` varchar(50) DEFAULT NULL COMMENT '姓名',
  `email` varchar(100) DEFAULT NULL COMMENT '邮箱',
  `subject` varchar(100) DEFAULT NULL COMMENT '主题',
  `content` text COMMENT '内容',
  `status` char(1) DEFAULT NULL COMMENT '状态',
  `gmt_created` datetime DEFAULT NULL COMMENT '创建时间',
  `ip` varchar(100) DEFAULT NULL COMMENT 'IP地址',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='信息';

/*Data for the table `message` */

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `account` varchar(20) DEFAULT NULL COMMENT '账号',
  `password` varchar(100) DEFAULT NULL COMMENT '密码',
  `gmt_lastlogin` datetime DEFAULT NULL COMMENT '最近登录时间',
  `gmt_created` datetime DEFAULT NULL COMMENT '创建时间',
  `gmt_modified` datetime DEFAULT NULL COMMENT '修改时间',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='用户表';

/*Data for the table `user` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
