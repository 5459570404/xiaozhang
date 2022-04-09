/*
 Navicat MySQL Data Transfer

 Source Server         : mysqldb
 Source Server Type    : MySQL
 Source Server Version : 80022
 Source Host           : localhost:3306
 Source Schema         : shopsystem

 Target Server Type    : MySQL
 Target Server Version : 80022
 File Encoding         : 65001

 Date: 09/04/2022 08:38:58
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for goods
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods`  (
  `goods_id` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_unicode_ci NOT NULL,
  `goods_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `goods_kind` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  `goods_value` decimal(10, 2) NULL DEFAULT NULL,
  `goods_count` int NULL DEFAULT NULL,
  `goods_total` decimal(10, 2) NULL DEFAULT NULL,
  `goods_sell` decimal(10, 2) NULL DEFAULT NULL,
  `goods_profit` decimal(10, 2) NULL DEFAULT NULL,
  PRIMARY KEY (`goods_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1000 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of goods
-- ----------------------------
INSERT INTO `goods` VALUES ('11f59887384e4bce87f6067742ada9ed', '珍珍薯片', '零食', 5.00, 100, 500.00, 6.00, 100.00);
INSERT INTO `goods` VALUES ('21f59887384e4bce87f6067742ada9ed', '可乐', '饮品', 2.00, 200, 400.00, 3.00, 200.00);
INSERT INTO `goods` VALUES ('31f59887384e4bce87f6067742ada9ed', '雪碧', '饮品', 2.00, 200, 400.00, 3.00, 200.00);
INSERT INTO `goods` VALUES ('41f59887384e4bce87f6067742ada9ed', '糖果', '零食', 1.00, 1000, 1000.00, 1.50, 500.00);
INSERT INTO `goods` VALUES ('51f59887384e4bce87f6067742ada9ed', '肉干', '零食', 10.00, 200, 2000.00, 15.00, 1000.00);
INSERT INTO `goods` VALUES ('61f59887384e4bce87f6067742ada9ed', '牛奶', '饮品', 3.00, 1000, 3000.00, 4.00, 1000.00);

SET FOREIGN_KEY_CHECKS = 1;
