/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 80020
Source Host           : localhost:3306
Source Database       : easystem

Target Server Type    : MYSQL
Target Server Version : 80020
File Encoding         : 65001

Date: 2020-07-05 14:34:49
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for rz_sys_user
-- ----------------------------
DROP TABLE IF EXISTS `rz_sys_user`;
CREATE TABLE `rz_sys_user` (
  `userid` varchar(32) NOT NULL,
  `username` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `status` char(1) DEFAULT NULL,
  `salt` varchar(8) DEFAULT NULL,
  `createtime` datetime DEFAULT NULL,
  `lastlogintime` datetime DEFAULT NULL,
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of rz_sys_user
-- ----------------------------
INSERT INTO `rz_sys_user` VALUES ('1', 'admin', 'e663c9d0e861e346188ad7477a9456aa', '1', 'hfuu', '2020-06-28 09:23:23', '2020-06-28 09:23:26');
