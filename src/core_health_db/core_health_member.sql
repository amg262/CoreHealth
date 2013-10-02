CREATE DATABASE  IF NOT EXISTS `core_health` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `core_health`;
-- MySQL dump 10.13  Distrib 5.6.13, for Win32 (x86)
--
-- Host: localhost    Database: core_health
-- ------------------------------------------------------
-- Server version	5.6.14

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `member`
--

DROP TABLE IF EXISTS `member`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `member` (
  `member_id` int(11) NOT NULL AUTO_INCREMENT,
  `last_name` varchar(45) DEFAULT NULL,
  `first_name` varchar(45) DEFAULT NULL,
  `address` varchar(45) DEFAULT NULL,
  `city` varchar(45) DEFAULT NULL,
  `state` char(2) DEFAULT NULL,
  `zip` char(5) DEFAULT NULL,
  `phone` varchar(20) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `join_date` date DEFAULT NULL,
  `membership_type` varchar(5) NOT NULL,
  `membership_status` varchar(5) NOT NULL,
  `membership_payment` varchar(5) DEFAULT NULL,
  `free_session` varchar(5) DEFAULT NULL,
  PRIMARY KEY (`member_id`),
  KEY `fk_membership_type_idx` (`membership_type`),
  KEY `fk_membership_status_idx` (`membership_status`),
  KEY `fk_membership_payment_idx` (`membership_payment`),
  KEY `fk_free_session_idx` (`free_session`),
  CONSTRAINT `fk_free_session` FOREIGN KEY (`free_session`) REFERENCES `free_session` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_membership_payment` FOREIGN KEY (`membership_payment`) REFERENCES `membership_payment` (`payment_id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_membership_status` FOREIGN KEY (`membership_status`) REFERENCES `membership_status` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `fk_membership_type` FOREIGN KEY (`membership_type`) REFERENCES `membership_type` (`id`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `member`
--

LOCK TABLES `member` WRITE;
/*!40000 ALTER TABLE `member` DISABLE KEYS */;
INSERT INTO `member` VALUES (1,'Brown','Kathleen','s7837 Racine Ave','Milwaukee','WI','53183','414-859-4861','kathy@brown.com','2013-09-30','1fam','1act','1ann','1ava'),(2,'Koehler','Erik','w305 Main St.','Waukesha','WI','53188','262-985-6514','erik@koehler.com','2013-05-22','1sin','1ter','1mon','1una'),(3,'Uhan','Kyle','s309 w3057 Moreland Rd.','New Berlin','WI','53143','414-846-3155','kyle@uhan.com','2013-04-25','1sin','1act','1ann','1ava'),(4,'Brazeau','Nick','353 Hwy DE','Delafield','WI','55848','262-351-1345','nick@brazeau.com','2012-03-26','1fam','1act','1mon','1una'),(5,'Gunn','Andy','335 Harrison St.','North Prairie','WI','53153','262-470-5412','andy@goon.com','2012-08-21','1fam','1ter','1mon','1una'),(6,'Buczyncski','Dan','s987 w3032 Hwy 83','Hartland','WI','68483','414-846-6468','dan@buczyncski.com','2013-07-06','1sin','1act','1mon','1ava'),(7,'Smith','Helen','6093 Honeycutt Ct','Wales','WI','53149','414-236-4545','helen@smith.com','2013-08-24','1fam','1act','1ann','1ava'),(8,'McGee','Dingus','35 Main St.','Milwaukee','WI','51684','414-559-5643','dingus@mcgee.com','2012-05-05','1fam','1ter','1mon','1una'),(9,'MaGoo','Fatty','353 Locust Ave.','Milwaukee','WI','65168','414-251-1684','fatty@mcgoo.com','2011-06-12','1sin','1act','1ann','1ava'),(10,'White','Walter','35 Hwy EE','Racine','WI','54683','414-586-7464','walter@white.com','2011-05-05','1fam','1act','1ann','1ava'),(11,'White','Skyler','lkgje','lagk','GA','53579','41-684-6543','fkaj@aolij.com','2001-05-25','1fam','1ter','1ann','1una'),(12,'Bobby','Goon','909 Main St.','Kenosha','WI','53149','262-719-3232','goon@goon.com','2013-10-01','1sin','1act','1mon','1una');
/*!40000 ALTER TABLE `member` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2013-10-01 22:10:28
