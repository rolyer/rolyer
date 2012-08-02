delimiter $$

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
) ENGINE=MyISAM AUTO_INCREMENT=129 DEFAULT CHARSET=utf8 COMMENT='文章'$$

