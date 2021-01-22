/*
SQLyog Ultimate v12.5.0 (64 bit)
MySQL - 5.7.28-log : Database - zoology
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`zoology` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `zoology`;

/*Table structure for table `client` */

DROP TABLE IF EXISTS `client`;

CREATE TABLE `client` (
  `client_id` int(10) unsigned NOT NULL AUTO_INCREMENT COMMENT '客户号',
  `emp_name` varchar(500) DEFAULT NULL COMMENT '员工名',
  `emp_id` int(10) unsigned DEFAULT NULL COMMENT '员工号',
  `client_num` varchar(500) DEFAULT NULL COMMENT '客户编号',
  `client_name` varchar(500) DEFAULT NULL,
  `client_job` varchar(500) DEFAULT NULL COMMENT '客户职业',
  `client_telephone` varchar(500) DEFAULT NULL,
  `client_address` varchar(500) DEFAULT NULL,
  `client_bank_account` varchar(50) DEFAULT NULL COMMENT '银行账号',
  `remark` mediumtext COMMENT '用以说明客户情况及需求',
  PRIMARY KEY (`client_id`),
  UNIQUE KEY `uniq_client_num` (`client_num`),
  UNIQUE KEY `uniq_client_telephone` (`client_telephone`),
  UNIQUE KEY `uniq_client_bankAccount` (`client_bank_account`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=utf8;

/*Data for the table `client` */

insert  into `client`(`client_id`,`emp_name`,`emp_id`,`client_num`,`client_name`,`client_job`,`client_telephone`,`client_address`,`client_bank_account`,`remark`) values 
(4,'小听',9,'33798','jack','software engineer','18686588107','鸿博锦绣花园17-1-401','6217 0019 3005 3657 889','重要客户');

/*Table structure for table `department` */

DROP TABLE IF EXISTS `department`;

CREATE TABLE `department` (
  `dept_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '部门号',
  `dept_num` varchar(500) DEFAULT NULL COMMENT '部门编号',
  `dept_name` varchar(500) DEFAULT NULL COMMENT '部门名',
  `dept_duty` varchar(500) DEFAULT NULL COMMENT '部门职责',
  `dept_major_name` varchar(500) DEFAULT NULL COMMENT '部门主管名',
  `dept_major_telephone` varchar(500) DEFAULT NULL COMMENT '部门主管电话',
  `dept_major_email` varchar(500) DEFAULT NULL COMMENT '部门主管email',
  `dept_telephone` varchar(500) DEFAULT NULL COMMENT '部门电话',
  `remark` varchar(500) DEFAULT NULL COMMENT '记录部门详情及其它备注',
  PRIMARY KEY (`dept_id`),
  UNIQUE KEY `uniq_dept_num` (`dept_num`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

/*Data for the table `department` */

insert  into `department`(`dept_id`,`dept_num`,`dept_name`,`dept_duty`,`dept_major_name`,`dept_major_telephone`,`dept_major_email`,`dept_telephone`,`remark`) values 
(1,'SC13146','市场部','市场调研','拉钩招聘','12323762354','lagou@163.com','400-400-4008','大高速的高度'),
(2,'XS13148','销售部','销售商品','拉钩教育','14214517367','laggou@163.com','400-400-4002','阿呆活动好滴'),
(3,'JS98456','技术部','技术开发','王伟','123989802345','123989802345@163.com','400-400-4003','专为技术服务');

/*Table structure for table `emp` */

DROP TABLE IF EXISTS `emp`;

CREATE TABLE `emp` (
  `emp_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '员工号',
  `dept_id` int(11) DEFAULT NULL COMMENT '部门号',
  `dept_name` varchar(500) DEFAULT NULL COMMENT '部门名',
  `emp_num` varchar(500) DEFAULT NULL COMMENT '员工编号',
  `emp_name` varchar(500) DEFAULT NULL COMMENT '员工名',
  `emp_job` varchar(500) DEFAULT NULL COMMENT '职位名',
  `emp_duty` varchar(500) DEFAULT NULL COMMENT '岗位职责',
  `emp_salary` varchar(500) DEFAULT NULL COMMENT '职位薪资',
  `emp_working_days` decimal(3,2) DEFAULT NULL COMMENT '工作时长',
  `emp_join_datetime` datetime DEFAULT NULL COMMENT '入职时间',
  `emp_client_record` longtext COMMENT '记录员工与客户间的事件发生的日期、地点、概要和详细信息',
  `emp_client_ammount` bigint(20) DEFAULT NULL COMMENT '客户数量',
  `emp_check` varchar(500) DEFAULT NULL COMMENT '记录员工在职考核内容及结果',
  `emp_type` varchar(500) DEFAULT NULL COMMENT '说明是否为正式员工',
  `emp_telephone` varchar(500) DEFAULT NULL,
  `emp_qq` varchar(500) DEFAULT NULL,
  `emp_wechat` varchar(500) DEFAULT NULL,
  `emp_qqemail` varchar(500) DEFAULT NULL,
  `emp_163email` varchar(500) DEFAULT NULL,
  `remark` mediumtext COMMENT '记录对于员工的评价',
  PRIMARY KEY (`emp_id`),
  UNIQUE KEY `uniq_emp_num` (`emp_num`),
  UNIQUE KEY `uniq_emp_name` (`dept_name`),
  UNIQUE KEY `uniq_emp_telephone` (`emp_telephone`),
  UNIQUE KEY `uniq_emp_qq` (`emp_qq`),
  UNIQUE KEY `uniq_emp_wechat` (`emp_wechat`),
  UNIQUE KEY `uniq_emp_qqemail` (`emp_qqemail`),
  UNIQUE KEY `uniq_emp_163email` (`emp_163email`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

/*Data for the table `emp` */

insert  into `emp`(`emp_id`,`dept_id`,`dept_name`,`emp_num`,`emp_name`,`emp_job`,`emp_duty`,`emp_salary`,`emp_working_days`,`emp_join_datetime`,`emp_client_record`,`emp_client_ammount`,`emp_check`,`emp_type`,`emp_telephone`,`emp_qq`,`emp_wechat`,`emp_qqemail`,`emp_163email`,`remark`) values 
(9,3,'技术部','JS98456LG69100','刘戈','engineer','如何安照进度完成开发任务','8k',9.50,'2021-01-22 16:43:47','无',0,'考核内容为:springboot的使用,微服务,分布式技术.数据库分库分表.其结果表示可以转正','正职','13877111000','30914111119','13900810777','30111992909@.com','139778149000@163.com','此员工诚实可靠');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
