delimiter $$

CREATE TABLE `article_label` (
  `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `article_id` int(20) DEFAULT NULL COMMENT '文章ID',
  `label_id` int(20) DEFAULT NULL COMMENT '标签ID',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8$$

