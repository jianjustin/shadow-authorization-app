DROP TABLE IF EXISTS `sys_resource`;
CREATE TABLE `sys_resource` (
  `resource_id` varchar(100) NOT NULL PRIMARY KEY,
  `resource_name` varchar(100),
  `resource_url` varchar(100),
  `resource_operation` varchar(100),
  `resource_type` int,
  `create_date` timestamp DEFAULT CURRENT_TIMESTAMP,
  `order_by` int
);

DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `role_id` varchar(100) NOT NULL PRIMARY KEY,
  `role_name` varchar(100),
  `role_type` int,
  `create_date` timestamp DEFAULT CURRENT_TIMESTAMP,
  `order_by` int
);

DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `user_id` varchar(100) NOT NULL PRIMARY KEY,
  `username` varchar(100) NOT NULL,
  `password` varchar(100) NOT NULL,
  `department_id` varchar(100),
  `post_id` varchar(100),
  `last_login` date,
  `create_date` timestamp DEFAULT CURRENT_TIMESTAMP,
  `order_by` int
);

DROP TABLE IF EXISTS `sys_user_role`;
CREATE TABLE `sys_user_role` (
  `user_role_id` varchar(100) NOT NULL PRIMARY KEY,
  `user_id` varchar(100) NOT NULL,
  `role_id` varchar(100) NOT NULL
);

DROP TABLE IF EXISTS `sys_permission`;
CREATE TABLE `sys_permission` (
  `permission_id` varchar(100) NOT NULL PRIMARY KEY,
  `resource_id` varchar(100) NOT NULL,
  `role_id` varchar(100) NOT NULL,
  `permission_status` int,
  `create_date` timestamp DEFAULT CURRENT_TIMESTAMP,
  `order_by` int
);

DROP TABLE IF EXISTS `classify`;
CREATE TABLE `classify` (
    `id` varchar(100) NOT NULL PRIMARY KEY,
    `name` varchar(100) NOT NULL,
    `book_count` int default 0,
    `monthly_count` int default 0,
    `icon` varchar(100),
    `create_date` timestamp DEFAULT CURRENT_TIMESTAMP,
    `order_by` int
);

DROP TABLE IF EXISTS `book`;
CREATE TABLE `book` (
    `id` varchar(100) NOT NULL PRIMARY KEY,
    `name` varchar(100) NOT NULL,
    `classify` varchar(100),
    `cover` varchar(100),
    `long_intro` text,
    `author` varchar(100),
    `tags` varchar(100),
    `chapters_count` int,
    `word_count` int,
    `create_date` timestamp DEFAULT CURRENT_TIMESTAMP,
    `order_by` int
);

DROP TABLE IF EXISTS `chapter`;
CREATE TABLE `chapter` (
    `id` varchar(100) NOT NULL PRIMARY KEY,
    `book_id` varchar(100) NOT NULL,
    `name` varchar(1000),
    `index` int,
    `content` text,
    `word_count` int,
    `create_date` timestamp DEFAULT CURRENT_TIMESTAMP,
    `order_by` int
);