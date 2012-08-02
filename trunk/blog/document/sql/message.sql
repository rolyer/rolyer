delimiter $$

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
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COMMENT='信息'$$

