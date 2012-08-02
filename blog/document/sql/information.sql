delimiter $$

CREATE TABLE `information` (
  `id` int(20) NOT NULL AUTO_INCREMENT,
  `about_me` text,
  `contact_me` text,
  `gmt_created` datetime DEFAULT NULL,
  `gmt_modified` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COMMENT='基本信息'$$

