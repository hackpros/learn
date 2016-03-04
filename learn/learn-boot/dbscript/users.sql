/*
Navicat MySQL Data Transfer

Source Server         : alicloud-test
Source Server Version : 50173
Source Host           : 121.40.172.165:3306
Source Database       : user001

Target Server Type    : MYSQL
Target Server Version : 50173
File Encoding         : 65001

Date: 2016-03-04 15:18:16
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `users`
-- ----------------------------
DROP TABLE IF EXISTS `users`;
CREATE TABLE `users` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键自增',
  `userId` bigint(20) NOT NULL COMMENT '业务唯一数字ID',
  `mobile` varchar(16) NOT NULL COMMENT '手机号',
  `pwd` varchar(32) NOT NULL COMMENT '密码',
  `nickName` varchar(16) DEFAULT NULL COMMENT '昵称',
  `sex` int(1) DEFAULT NULL COMMENT '性别',
  `ctime` datetime NOT NULL COMMENT '注册时间',
  `mtime` datetime DEFAULT NULL COMMENT '修改时间',
  `status` int(2) NOT NULL COMMENT '状态@',
  `locked` tinyint(1) DEFAULT NULL COMMENT '锁定状态',
  `treamNum` varchar(32) NOT NULL COMMENT '请客号',
  `birthday` datetime DEFAULT NULL COMMENT '生日',
  `userSource` varchar(16) NOT NULL COMMENT '用户来源@',
  `crown` int(2) NOT NULL DEFAULT '1' COMMENT '皇冠@1:正常|2: 丢失',
  `pigeon` int(3) NOT NULL DEFAULT '0' COMMENT '鸽子',
  `height` int(3) DEFAULT NULL COMMENT '身高(cm)',
  `headIcon` varchar(100) DEFAULT NULL COMMENT 'ͷ��',
  `lastLoginTime` datetime DEFAULT NULL COMMENT '最后登录时间',
  `unLockTime` datetime DEFAULT NULL COMMENT '账户解锁时间',
  `loginErrorNum` int(1) DEFAULT NULL COMMENT '登录错误次数',
  `salt` varchar(6) NOT NULL COMMENT '盐值',
  `rich` decimal(9,2) DEFAULT '0.00' COMMENT '土豪',
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=22 DEFAULT CHARSET=utf8 COMMENT='用户表';

-- ----------------------------
-- Records of users
-- ----------------------------
INSERT INTO `users` VALUES ('1', '4', '13000000000', '44ce65f00c770182a2381c851036c02c', '较的确是不是么么', '1', '2016-02-01 15:44:25', '2016-02-03 20:11:10', '1', null, 'a13000000000', '1987-02-01 00:00:00', '', '1', '0', null, 'avatar/4/64F414D61655EAE1FD866337F64CB5A8', '2016-02-25 14:55:33', null, '0', '4rds', '0.00');
INSERT INTO `users` VALUES ('2', '8', '13020260003', 'a2ced9012a125fdb47d8b1fd9786c9f2', 'test03', '1', '2016-02-01 15:50:19', '2016-02-01 19:30:23', '1', null, '13020260003', '1990-02-01 00:00:00', '', '1', '0', null, 'avatar/8/AA7AC2A23EC05BE2AC0DFE9DDA610AD5', '2016-02-26 16:17:02', null, '0', 'GpDG', '0.00');
INSERT INTO `users` VALUES ('3', '12', '17722222222', '7db402859a60a23ef081039fc7e24257', '东北蔡', '1', '2016-02-01 15:52:35', '2016-02-01 15:55:31', '1', null, '17722222222222222222', '1990-01-31 00:00:00', '', '1', '0', null, 'default/m/2', '2016-02-02 17:07:46', null, '0', 'sUxu', '0.00');
INSERT INTO `users` VALUES ('4', '16', '13020260008', '8e34c3aa8e69779d9d61e21727e25381', 'test08', '2', '2016-02-01 15:55:08', '2016-03-01 10:57:35', '1', null, '13020260008', '1990-02-01 00:00:00', '', '1', '0', null, 'avatar/10/2C7E26DD2DF979BF74991C6060CF8C72', '2016-03-03 15:53:07', null, '0', 'o5sV', '0.00');
INSERT INTO `users` VALUES ('5', '20', '13503120521', '4b3762c4091ee9d18a6ccbcc6f90111e', '马克呗', '1', '2016-02-01 16:33:58', '2016-02-03 13:35:55', '1', null, '13503120521', '1988-02-01 00:00:00', '', '1', '0', null, 'avatar/14/4495A2BAF2D61EA65FC105C9BE2F5231', '2016-02-03 16:37:18', null, '1', 'fmTh', '0.00');
INSERT INTO `users` VALUES ('8', '28', '15903993058', '85df0d5f3bf4e276304fddd2fe4ec7a4', '我请客28', '1', '2016-02-01 18:56:36', null, '1', null, '', null, '', '1', '0', null, 'default/m/6', '2016-02-01 18:56:38', null, '0', 'QSUg', '0.00');
INSERT INTO `users` VALUES ('7', '24', '18367172316', '3e3a4c49adb1a8fee1088fff12c7b387', 'test2316', '2', '2016-02-01 16:55:18', '2016-02-01 17:01:02', '1', null, '18367172316', '1990-02-01 00:00:00', '', '1', '0', null, 'default/f/2', '2016-02-01 16:55:36', null, null, '8WNE', '0.00');
INSERT INTO `users` VALUES ('9', '32', '13503120524', '19a405cad3e1be2b9f9ff1f898ba6c1d', '夏舞茶', '2', '2016-02-01 20:27:01', '2016-02-03 15:41:15', '1', null, '13503120524', '1985-02-01 00:00:00', '', '1', '0', null, 'default/f/1', '2016-02-03 15:40:47', null, '0', '0Ub4', '0.00');
INSERT INTO `users` VALUES ('10', '36', '18268681208', 'a059cfcf81d93a86cfe750096bf854ee', '夏舞茶', '1', '2016-02-02 10:51:32', null, '1', null, '18268681208', '1988-12-08 00:00:00', '', '1', '0', null, 'default/m/2', '2016-02-16 19:49:58', null, '0', 'cnjn', '0.00');
INSERT INTO `users` VALUES ('11', '40', '15000000000', '98d01392e292eff711fd9e5f859848ef', '夏舞茶', '1', '2016-02-02 13:36:05', null, '1', null, '15000000000', '1990-02-01 00:00:00', '', '1', '0', null, 'default/m/5', '2016-02-02 14:15:48', null, null, 'Uc0C', '0.00');
INSERT INTO `users` VALUES ('12', '44', '13503120528', '45fbffa72c82ea71ffb40a25ecbe4a10', '流连苏', null, '2016-02-02 17:56:07', null, '2', null, '13503120528', null, '', '1', '0', null, null, '2016-02-02 17:59:54', null, '1', 'hS5S', '0.00');
INSERT INTO `users` VALUES ('13', '48', '13000000001', 'f36f15ca452cfc856d3c25bdaa20b82f', '淳牛奶', '1', '2016-02-02 20:03:42', '2016-02-03 11:58:31', '1', null, '13000000001', '2016-02-02 00:00:00', '', '1', '0', null, 'avatar/30/3084D9002031D414A9962F5BF20B830D', '2016-02-22 16:07:07', null, '0', 'YXTu', '0.00');
INSERT INTO `users` VALUES ('14', '52', '18800356370', '7de8130b1d9d334301a596f00e5c7242', '蒜火郭', '1', '2016-02-03 11:08:26', null, '1', null, '18800356370', '1989-01-01 00:00:00', '', '1', '0', null, 'default/m/1', '2016-02-03 18:06:10', null, '0', 'Qowf', '0.00');
INSERT INTO `users` VALUES ('15', '56', '15558051052', '4725f45d310901d4295b3698935a972e', 'ffffffffffffffff', '2', '2016-02-03 12:01:01', '2016-02-03 13:57:57', '1', null, '15558051052', '2010-02-03 00:00:00', '', '1', '0', null, 'avatar/38/33AD6534D90CC9A0DC6CB4247D3B2644', '2016-02-03 12:01:10', null, null, '6HRi', '0.00');
INSERT INTO `users` VALUES ('16', '60', '18268816356', '', '芒果布丁', null, '2016-02-03 15:19:38', null, '2', null, '18268816356', null, '', '1', '0', null, null, null, null, null, '', '0.00');
INSERT INTO `users` VALUES ('17', '64', '13777495730', 'c7585c79ed65450dfbfa010c7c24c4b6', '二道碗', '1', '2016-02-04 14:07:27', null, '1', null, '13777495730', '1981-02-01 00:00:00', '', '1', '0', null, 'default/m/6', '2016-02-05 07:41:10', null, '0', 'vOMx', '0.00');
INSERT INTO `users` VALUES ('18', '68', '13000000003', 'e504a98d703b9ec65d76dcf5f174642c', '麦克疯', '1', '2016-02-22 16:11:48', '2016-02-24 19:27:59', '1', null, '13000000003', '1997-02-22 00:00:00', '', '1', '0', null, 'avatar/44/90622B88F930E86122693A014AFF7687', '2016-02-22 16:12:12', null, null, 'IJZm', '0.00');
INSERT INTO `users` VALUES ('19', '72', '15558051045', '71a465123db29daf8d89ef84e205bb9a', '马克呗', '2', '2016-02-25 17:15:21', '2016-02-25 17:18:14', '1', null, '15558051045', '2003-02-25 00:00:00', '', '1', '0', null, 'avatar/48/6CF478925843BB03E33776B2ED723031', '2016-02-25 17:15:33', null, null, 'ORgO', '0.00');
INSERT INTO `users` VALUES ('20', '76', '13706522607', '3d77af6a86c9009071f17a9c58aef0bf', '鎴戣?瀹?6', '1', '2016-02-29 09:51:20', null, '1', null, '', null, '', '1', '0', null, 'default/m/6', '2016-02-29 09:51:24', null, '0', 'r7Tn', '0.00');
INSERT INTO `users` VALUES ('21', '80', '13336888362', '', '马克呗', null, '2016-03-03 13:55:26', null, '2', null, '13336888362', null, '', '1', '0', null, null, null, null, null, '', '0.00');
