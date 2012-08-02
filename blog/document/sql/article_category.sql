delimiter $$

CREATE TABLE `article_category` (
  `id` int(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `article_id` int(20) DEFAULT NULL COMMENT '文章ID',
  `category_id` int(20) DEFAULT NULL COMMENT '类别ID',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8$$

