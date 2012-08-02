delimiter $$

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
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='评论'$$

