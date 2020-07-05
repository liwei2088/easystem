/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 80020
Source Host           : localhost:3306
Source Database       : easystem

Target Server Type    : MYSQL
Target Server Version : 80020
File Encoding         : 65001

Date: 2020-07-05 22:03:21
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for rz_sys_group
-- ----------------------------
DROP TABLE IF EXISTS `rz_sys_group`;
CREATE TABLE `rz_sys_group` (
  `id` varchar(32) NOT NULL,
  `pid` varchar(32) DEFAULT NULL,
  `name` varchar(250) DEFAULT NULL,
  `open` int DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `userid` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL,
  `status` int DEFAULT NULL,
  `ordernum` int DEFAULT NULL,
  `createtime` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of rz_sys_group
-- ----------------------------

-- ----------------------------
-- Table structure for rz_sys_permission
-- ----------------------------
DROP TABLE IF EXISTS `rz_sys_permission`;
CREATE TABLE `rz_sys_permission` (
  `permissionid` varchar(32) NOT NULL,
  `pid` varchar(32) DEFAULT NULL,
  `type` varchar(255) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `percode` varchar(255) DEFAULT NULL,
  `icon` varchar(255) DEFAULT NULL,
  `href` varchar(255) DEFAULT NULL,
  `target` varchar(255) DEFAULT NULL,
  `open` int DEFAULT '0',
  `ordernum` int NOT NULL,
  `status` int NOT NULL DEFAULT '1',
  PRIMARY KEY (`permissionid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of rz_sys_permission
-- ----------------------------
INSERT INTO `rz_sys_permission` VALUES ('11111111111111111111111111111111', '0', 'menu', '工程认证管理系统', null, '&#xe68e', null, null, '1', '1', '1');
INSERT INTO `rz_sys_permission` VALUES ('2736fa38e33f45a6aad0a8fde693927c', '5c9d422284a84c48bc3f576edb53d951', 'menu', '权限管理', null, '&#xe857', '/sys/toPermissionManager', null, '0', '5', '1');
INSERT INTO `rz_sys_permission` VALUES ('41728fb43cf94161873d4ef857cf258b', '5c9d422284a84c48bc3f576edb53d951', 'menu', '用户管理', null, '&#xe612', '/sys/toUserManager', null, '0', '3', '1');
INSERT INTO `rz_sys_permission` VALUES ('5c9d422284a84c48bc3f576edb53d951', '11111111111111111111111111111111', 'menu', '系统管理', null, '&#xe614', null, null, '1', '2', '1');
INSERT INTO `rz_sys_permission` VALUES ('6c3f0f4786d94bb2b79539fe79d77237', '5c9d422284a84c48bc3f576edb53d951', 'menu', '结构管理', null, '&#xe770', '/sys/toOrgManager', null, '0', '7', '1');
INSERT INTO `rz_sys_permission` VALUES ('90f6a88e86aa4ed9a21713b2abcebc6f', '5c9d422284a84c48bc3f576edb53d951', 'menu', '角色管理', null, '&#xe650', '/sys/toRoleManager', null, '0', '4', '1');
INSERT INTO `rz_sys_permission` VALUES ('da16dd8652c143459432895cbc10fab2', '5c9d422284a84c48bc3f576edb53d951', 'menu', '菜单管理', null, '&#xe663', '/sys/toMenuManager', null, '0', '6', '1');

-- ----------------------------
-- Table structure for rz_sys_role
-- ----------------------------
DROP TABLE IF EXISTS `rz_sys_role`;
CREATE TABLE `rz_sys_role` (
  `roleid` varchar(32) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `name` varchar(200) DEFAULT NULL,
  `remark` varchar(255) DEFAULT NULL,
  `status` char(1) DEFAULT NULL,
  `createtime` datetime DEFAULT NULL,
  PRIMARY KEY (`roleid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of rz_sys_role
-- ----------------------------
INSERT INTO `rz_sys_role` VALUES ('0cb46e7620384e869ccdd17ccd62a62a', '普通教师', '拥有教师的基本权限', '1', '2020-07-05 20:55:36');
INSERT INTO `rz_sys_role` VALUES ('4f54712931be49eca0d1277fdfca3d48', '超级管理员', '拥有所有权限', '1', '2020-07-05 20:53:46');
INSERT INTO `rz_sys_role` VALUES ('d6a21b38f659408dbddc84d28f02d327', '系统管理员', '管理所有的系统设置', '1', '2020-07-05 20:54:40');

-- ----------------------------
-- Table structure for rz_sys_role_permission
-- ----------------------------
DROP TABLE IF EXISTS `rz_sys_role_permission`;
CREATE TABLE `rz_sys_role_permission` (
  `roleid` varchar(32) NOT NULL,
  `permissionid` varchar(32) NOT NULL,
  PRIMARY KEY (`roleid`,`permissionid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of rz_sys_role_permission
-- ----------------------------
INSERT INTO `rz_sys_role_permission` VALUES ('0cb46e7620384e869ccdd17ccd62a62a', '5c9d422284a84c48bc3f576edb53d951');
INSERT INTO `rz_sys_role_permission` VALUES ('0cb46e7620384e869ccdd17ccd62a62a', '6c3f0f4786d94bb2b79539fe79d77237');
INSERT INTO `rz_sys_role_permission` VALUES ('0cb46e7620384e869ccdd17ccd62a62a', 'db554b49d52c453ba35194a58207c854');
INSERT INTO `rz_sys_role_permission` VALUES ('4f54712931be49eca0d1277fdfca3d48', '2736fa38e33f45a6aad0a8fde693927c');
INSERT INTO `rz_sys_role_permission` VALUES ('4f54712931be49eca0d1277fdfca3d48', '41728fb43cf94161873d4ef857cf258b');
INSERT INTO `rz_sys_role_permission` VALUES ('4f54712931be49eca0d1277fdfca3d48', '5c9d422284a84c48bc3f576edb53d951');
INSERT INTO `rz_sys_role_permission` VALUES ('4f54712931be49eca0d1277fdfca3d48', '6c3f0f4786d94bb2b79539fe79d77237');
INSERT INTO `rz_sys_role_permission` VALUES ('4f54712931be49eca0d1277fdfca3d48', '90f6a88e86aa4ed9a21713b2abcebc6f');
INSERT INTO `rz_sys_role_permission` VALUES ('4f54712931be49eca0d1277fdfca3d48', 'da16dd8652c143459432895cbc10fab2');
INSERT INTO `rz_sys_role_permission` VALUES ('4f54712931be49eca0d1277fdfca3d48', 'db554b49d52c453ba35194a58207c854');

-- ----------------------------
-- Table structure for rz_sys_user
-- ----------------------------
DROP TABLE IF EXISTS `rz_sys_user`;
CREATE TABLE `rz_sys_user` (
  `userid` varchar(32) NOT NULL,
  `username` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `status` int DEFAULT '1',
  `type` int DEFAULT '1',
  `salt` varchar(8) DEFAULT NULL,
  `createtime` datetime DEFAULT NULL,
  `lastlogintime` datetime DEFAULT NULL,
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of rz_sys_user
-- ----------------------------
INSERT INTO `rz_sys_user` VALUES ('11111111111111111111111111111111', 'admin', 'e663c9d0e861e346188ad7477a9456aa', '1', '0', 'hfuu', '2020-06-28 09:23:23', '2020-06-28 09:23:26');

-- ----------------------------
-- Table structure for rz_sys_user_role
-- ----------------------------
DROP TABLE IF EXISTS `rz_sys_user_role`;
CREATE TABLE `rz_sys_user_role` (
  `userid` varchar(32) NOT NULL,
  `roleid` varchar(32) NOT NULL,
  PRIMARY KEY (`userid`,`roleid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of rz_sys_user_role
-- ----------------------------
INSERT INTO `rz_sys_user_role` VALUES ('11111111111111111111111111111111', '0cb46e7620384e869ccdd17ccd62a62a');
INSERT INTO `rz_sys_user_role` VALUES ('11111111111111111111111111111111', '4f54712931be49eca0d1277fdfca3d48');
