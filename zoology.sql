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
  `client_id` varchar(50) NOT NULL COMMENT '客户号',
  `emp_id` varchar(50) DEFAULT NULL COMMENT '员工号',
  `emp_name` varchar(500) DEFAULT NULL COMMENT '员工名',
  `client_num` varchar(500) DEFAULT NULL COMMENT '客户编号',
  `client_name` varchar(500) DEFAULT NULL,
  `client_job` varchar(500) DEFAULT NULL COMMENT '客户职业',
  `client_telephone` varchar(500) DEFAULT NULL,
  `client_address` varchar(500) DEFAULT NULL,
  `client_bank_accout` varchar(20) DEFAULT NULL COMMENT '银行账号',
  `remark` mediumtext COMMENT '用以说明客户情况及需求',
  PRIMARY KEY (`client_id`),
  UNIQUE KEY `client_num_only` (`client_num`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `client` */

insert  into `client`(`client_id`,`emp_id`,`emp_name`,`client_num`,`client_name`,`client_job`,`client_telephone`,`client_address`,`client_bank_accout`,`remark`) values 
('1','789','小王','33333','李章',NULL,NULL,NULL,NULL,'严重');

/*Table structure for table `department` */

DROP TABLE IF EXISTS `department`;

CREATE TABLE `department` (
  `dept_id` varchar(50) NOT NULL COMMENT '部门号',
  `dept_num` varchar(500) DEFAULT NULL COMMENT '部门编号',
  `dept_name` varchar(500) DEFAULT NULL COMMENT '部门名',
  `dept_duty` varchar(500) DEFAULT NULL COMMENT '部门职责',
  `dept_major_name` varchar(500) DEFAULT NULL COMMENT '部门主管名',
  `dept_major_telephone` varchar(500) DEFAULT NULL COMMENT '部门主管电话',
  `dept_major_email` varchar(500) DEFAULT NULL COMMENT '部门主管email',
  `dept_telephone` varchar(500) DEFAULT NULL COMMENT '部门电话',
  `remark` varchar(500) DEFAULT NULL COMMENT '记录部门详情及其它备注',
  PRIMARY KEY (`dept_id`),
  UNIQUE KEY `dept_num_only` (`dept_num`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `department` */

insert  into `department`(`dept_id`,`dept_num`,`dept_name`,`dept_duty`,`dept_major_name`,`dept_major_telephone`,`dept_major_email`,`dept_telephone`,`remark`) values 
('1',NULL,'市场部',NULL,'拉钩招聘','400-400-4008','lagou@163.com',NULL,NULL),
('2',NULL,'销售部',NULL,'拉钩教育','400-400-4002','laggou@163.com',NULL,NULL);

/*Table structure for table `emp` */

DROP TABLE IF EXISTS `emp`;

CREATE TABLE `emp` (
  `emp_id` varchar(50) NOT NULL COMMENT '员工号',
  `dept_id` varchar(50) DEFAULT NULL COMMENT '部门号',
  `dept_name` varchar(500) DEFAULT NULL COMMENT '部门名',
  `emp_num` varchar(500) DEFAULT NULL COMMENT '员工编号',
  `emp_name` varchar(500) DEFAULT NULL COMMENT '员工名',
  `emp_job` varchar(500) DEFAULT NULL COMMENT '职位名',
  `emp_duty` varchar(500) DEFAULT NULL COMMENT '岗位职责',
  `emp_salary` varchar(500) DEFAULT NULL COMMENT '职位薪资',
  `emp_working_days` int(11) DEFAULT NULL COMMENT '工作时长',
  `emp_join_datetime` datetime DEFAULT NULL COMMENT '入职时间',
  `emp_check` varchar(500) DEFAULT NULL COMMENT '记录员工在职考核内容及结果',
  `emp_type` varchar(500) DEFAULT NULL COMMENT '说明是否为正式员工',
  `emp_client_ammount` bigint(20) DEFAULT NULL COMMENT '客户数量',
  `emp_telephone` varchar(500) DEFAULT NULL,
  `emp_qq` varchar(500) DEFAULT NULL,
  `emp_wechat` varchar(500) DEFAULT NULL,
  `emp_qqemail` varchar(500) DEFAULT NULL,
  `emp_163email` varchar(500) DEFAULT NULL,
  `remark` mediumtext COMMENT '记录员工在职考核评价',
  PRIMARY KEY (`emp_id`),
  UNIQUE KEY `emp_num_only` (`emp_num`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `emp` */

insert  into `emp`(`emp_id`,`dept_id`,`dept_name`,`emp_num`,`emp_name`,`emp_job`,`emp_duty`,`emp_salary`,`emp_working_days`,`emp_join_datetime`,`emp_check`,`emp_type`,`emp_client_ammount`,`emp_telephone`,`emp_qq`,`emp_wechat`,`emp_qqemail`,`emp_163email`,`remark`) values 
('1','1',NULL,NULL,'小王',NULL,NULL,NULL,NULL,'2020-06-06 00:00:00',NULL,NULL,NULL,'13212345678',NULL,NULL,NULL,NULL,NULL),
('2','1',NULL,NULL,'老于',NULL,NULL,NULL,NULL,'2019-04-27 00:00:00',NULL,NULL,NULL,'13512345679',NULL,NULL,NULL,NULL,NULL),
('3','2',NULL,NULL,'老方',NULL,NULL,NULL,NULL,'2015-08-14 00:00:00',NULL,NULL,NULL,'13512345670',NULL,NULL,NULL,NULL,NULL);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
