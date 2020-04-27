/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80019
 Source Host           : localhost:3306
 Source Schema         : authDB

 Target Server Type    : MySQL
 Target Server Version : 80019
 File Encoding         : 65001

 Date: 27/04/2020 19:38:18
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for sys_permission
-- ----------------------------
DROP TABLE IF EXISTS `sys_permission`;
CREATE TABLE `sys_permission` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '权限ID',
  `resource_id` int NOT NULL COMMENT '资源ID',
  `role_id` int NOT NULL COMMENT '角色ID',
  `permission_status` int NOT NULL COMMENT '权限状态',
  `create_date` date DEFAULT NULL COMMENT '记录创建时间',
  `order_by` int DEFAULT NULL COMMENT '排序号',
  PRIMARY KEY (`id`),
  KEY `resourceId` (`resource_id`),
  KEY `roleId` (`role_id`),
  CONSTRAINT `sys_permission_ibfk_1` FOREIGN KEY (`resource_id`) REFERENCES `sys_resource` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `sys_permission_ibfk_2` FOREIGN KEY (`role_id`) REFERENCES `sys_role` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_permission
-- ----------------------------
BEGIN;
INSERT INTO `sys_permission` VALUES (12, 12, 12, 1, '2020-04-17', 1);
INSERT INTO `sys_permission` VALUES (13, 13, 12, 1, '2020-04-17', 2);
INSERT INTO `sys_permission` VALUES (14, 14, 12, 1, '2020-04-17', 3);
INSERT INTO `sys_permission` VALUES (15, 15, 12, 1, '2020-04-17', 4);
INSERT INTO `sys_permission` VALUES (16, 16, 12, 1, '2020-04-17', 5);
INSERT INTO `sys_permission` VALUES (17, 17, 12, 1, '2020-04-17', 6);
INSERT INTO `sys_permission` VALUES (19, 18, 12, 1, '2020-04-22', 7);
INSERT INTO `sys_permission` VALUES (20, 19, 12, 1, '2020-04-22', 8);
INSERT INTO `sys_permission` VALUES (21, 20, 12, 1, '2020-04-22', 9);
INSERT INTO `sys_permission` VALUES (22, 21, 12, 1, '2020-04-22', 10);
INSERT INTO `sys_permission` VALUES (23, 22, 12, 1, '2020-04-22', 11);
COMMIT;

-- ----------------------------
-- Table structure for sys_resource
-- ----------------------------
DROP TABLE IF EXISTS `sys_resource`;
CREATE TABLE `sys_resource` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '角色ID',
  `resource_name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '资源名称',
  `resource_url` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '资源路径',
  `resource_operation` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '资源操作',
  `resource_type` int NOT NULL COMMENT '资源类型',
  `create_date` date DEFAULT NULL COMMENT '记录创建时间',
  `order_by` int DEFAULT NULL COMMENT '排序号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_resource
-- ----------------------------
BEGIN;
INSERT INTO `sys_resource` VALUES (12, '添加资源', '/sys/resource/save', 'sys.resource.save', 1, '2020-04-17', 1);
INSERT INTO `sys_resource` VALUES (13, '删除资源', '/sys/resource/delete', 'sys.resource.delete', 1, '2020-04-17', 2);
INSERT INTO `sys_resource` VALUES (14, '查看资源', '/sys/resource/query', 'sys.resource.query', 1, '2020-04-17', 3);
INSERT INTO `sys_resource` VALUES (15, '添加权限', '/sys/permission/save', 'sys.permission.save', 1, '2020-04-17', 4);
INSERT INTO `sys_resource` VALUES (16, '删除权限', '/sys/permission/delete', 'sys.permission.delete', 1, '2020-04-17', 5);
INSERT INTO `sys_resource` VALUES (17, '查看权限', '/sys/permission/query', 'sys.permission.query', 1, '2020-04-17', 6);
INSERT INTO `sys_resource` VALUES (18, '添加角色', '/sys/role/insert', 'sys.role.insert', 1, '2020-04-22', 7);
INSERT INTO `sys_resource` VALUES (19, '修改角色', '/sys/role/update', 'sys.role.update', 1, '2020-04-22', 8);
INSERT INTO `sys_resource` VALUES (20, '删除角色', '/sys/role/delete', 'sys.role.delete', 1, '2020-04-22', 9);
INSERT INTO `sys_resource` VALUES (21, '查询当前角色', '/sys/role/findOne', 'sys.role.findOne', 1, '2020-04-22', 10);
INSERT INTO `sys_resource` VALUES (22, '查询角色', '/sys/role/findAll', 'sys.role.findAll', 1, '2020-04-22', 11);
COMMIT;

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '角色ID',
  `role_name` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '角色名称',
  `role_type` int NOT NULL COMMENT '角色类型',
  `create_date` date DEFAULT NULL COMMENT '记录创建时间',
  `order_by` int DEFAULT NULL COMMENT '排序号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_role
-- ----------------------------
BEGIN;
INSERT INTO `sys_role` VALUES (12, 'ADMIN', 0, '2020-04-17', 1);
INSERT INTO `sys_role` VALUES (13, 'USER', 1, '2020-04-17', 2);
COMMIT;

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `username` varchar(100) NOT NULL COMMENT '用户登陆名',
  `password` varchar(100) NOT NULL COMMENT '用户登陆密码',
  `department_id` int DEFAULT NULL COMMENT '所属部门ID',
  `post_id` int DEFAULT NULL COMMENT '职位ID',
  `last_login` date DEFAULT NULL COMMENT '最后登陆时间',
  `create_date` date DEFAULT NULL COMMENT '记录创建时间',
  `order_by` int DEFAULT NULL COMMENT '排序号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
BEGIN;
INSERT INTO `sys_user` VALUES (12, 'admin', '$2a$10$uasT4Zvy0BrcSKxPGVOdeuMohuspzDRZXqgd58n.2LpzG6t8DoW62', 0, 0, '2020-04-17', '2020-04-17', 0);
INSERT INTO `sys_user` VALUES (13, 'user', '$2a$10$fIk0t6E3izAL1ODh5YLCSe5etuTUJsv9a9ew3.lxslpVCOaBkwoI6', 0, 0, '2020-04-17', '2020-04-17', 1);
COMMIT;

-- ----------------------------
-- Table structure for sys_user_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_user_role`;
CREATE TABLE `sys_user_role` (
  `id` int NOT NULL AUTO_INCREMENT COMMENT '用户-角色关联ID',
  `user_id` int NOT NULL COMMENT '用户ID',
  `role_id` int NOT NULL COMMENT '角色ID',
  PRIMARY KEY (`id`),
  KEY `userId` (`user_id`),
  KEY `roleId` (`role_id`),
  CONSTRAINT `sys_user_role_ibfk_1` FOREIGN KEY (`user_id`) REFERENCES `sys_user` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `sys_user_role_ibfk_2` FOREIGN KEY (`role_id`) REFERENCES `sys_role` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_user_role
-- ----------------------------
BEGIN;
INSERT INTO `sys_user_role` VALUES (12, 12, 12);
INSERT INTO `sys_user_role` VALUES (13, 13, 13);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
