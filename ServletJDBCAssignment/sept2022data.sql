-- MySQL dump 10.13  Distrib 8.0.30, for Win64 (x86_64)
--
-- Host: localhost    Database: sept2022
-- ------------------------------------------------------
-- Server version	8.0.30

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `abc`
--

DROP TABLE IF EXISTS `abc`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `abc` (
  `prdId` int NOT NULL,
  `prdName` varchar(255) DEFAULT NULL,
  `prdPrice` int DEFAULT NULL,
  PRIMARY KEY (`prdId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `abc`
--

LOCK TABLES `abc` WRITE;
/*!40000 ALTER TABLE `abc` DISABLE KEYS */;
INSERT INTO `abc` VALUES (3,'Chairs',200),(4,'Pillows',30);
/*!40000 ALTER TABLE `abc` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `addrone2one`
--

DROP TABLE IF EXISTS `addrone2one`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `addrone2one` (
  `employee_id` bigint NOT NULL,
  `city` varchar(255) DEFAULT NULL,
  `country` varchar(255) DEFAULT NULL,
  `state` varchar(255) DEFAULT NULL,
  `street` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`employee_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `addrone2one`
--

LOCK TABLES `addrone2one` WRITE;
/*!40000 ALTER TABLE `addrone2one` DISABLE KEYS */;
INSERT INTO `addrone2one` VALUES (1,'Pittsburgh','U.S.','PA','13th Street');
/*!40000 ALTER TABLE `addrone2one` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `emp`
--

DROP TABLE IF EXISTS `emp`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `emp` (
  `eno` decimal(10,0) NOT NULL,
  `ename` varchar(50) DEFAULT NULL,
  `esal` decimal(10,0) DEFAULT NULL,
  PRIMARY KEY (`eno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `emp`
--

LOCK TABLES `emp` WRITE;
/*!40000 ALTER TABLE `emp` DISABLE KEYS */;
INSERT INTO `emp` VALUES (100,'Rebecca',12345),(101,'Jayden',54321),(102,'Jethon',33333),(103,'Adam',4444),(106,'Jimmy',33333),(107,'Ben',99999);
/*!40000 ALTER TABLE `emp` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee_meeting`
--

DROP TABLE IF EXISTS `employee_meeting`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee_meeting` (
  `EMPLOYEE_ID` bigint NOT NULL,
  `MEETING_ID` bigint NOT NULL,
  PRIMARY KEY (`EMPLOYEE_ID`,`MEETING_ID`),
  KEY `FK_sny992gdb25w1egho4g7oqfc9` (`MEETING_ID`),
  CONSTRAINT `FK_o8nc2ec0v3lga2bdhvaemda6v` FOREIGN KEY (`EMPLOYEE_ID`) REFERENCES `employeem2m` (`EMPLOYEE_ID`),
  CONSTRAINT `FK_sny992gdb25w1egho4g7oqfc9` FOREIGN KEY (`MEETING_ID`) REFERENCES `meetingm2m` (`MEETING_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee_meeting`
--

LOCK TABLES `employee_meeting` WRITE;
/*!40000 ALTER TABLE `employee_meeting` DISABLE KEYS */;
INSERT INTO `employee_meeting` VALUES (1,1),(2,1),(1,2);
/*!40000 ALTER TABLE `employee_meeting` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employeem2m`
--

DROP TABLE IF EXISTS `employeem2m`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employeem2m` (
  `EMPLOYEE_ID` bigint NOT NULL AUTO_INCREMENT,
  `FIRSTNAME` varchar(255) DEFAULT NULL,
  `LASTNAME` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`EMPLOYEE_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employeem2m`
--

LOCK TABLES `employeem2m` WRITE;
/*!40000 ALTER TABLE `employeem2m` DISABLE KEYS */;
INSERT INTO `employeem2m` VALUES (1,'Sachin','Tendulkar'),(2,'Brian','Lara');
/*!40000 ALTER TABLE `employeem2m` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `empone2one`
--

DROP TABLE IF EXISTS `empone2one`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `empone2one` (
  `employee_id` bigint NOT NULL AUTO_INCREMENT,
  `birth_date` date DEFAULT NULL,
  `cell_phone` varchar(255) DEFAULT NULL,
  `firstname` varchar(255) DEFAULT NULL,
  `lastname` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`employee_id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empone2one`
--

LOCK TABLES `empone2one` WRITE;
/*!40000 ALTER TABLE `empone2one` DISABLE KEYS */;
INSERT INTO `empone2one` VALUES (1,'1969-12-31','114-857-922','Vivek','Antony');
/*!40000 ALTER TABLE `empone2one` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `meetingm2m`
--

DROP TABLE IF EXISTS `meetingm2m`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `meetingm2m` (
  `MEETING_ID` bigint NOT NULL AUTO_INCREMENT,
  `MEETING_DATE` datetime DEFAULT NULL,
  `SUBJECT` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`MEETING_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `meetingm2m`
--

LOCK TABLES `meetingm2m` WRITE;
/*!40000 ALTER TABLE `meetingm2m` DISABLE KEYS */;
INSERT INTO `meetingm2m` VALUES (1,'2022-10-03 10:33:39','Quaterly Sales meeting'),(2,'2022-10-03 10:33:39','Weekly Status meeting');
/*!40000 ALTER TABLE `meetingm2m` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `prd`
--

DROP TABLE IF EXISTS `prd`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `prd` (
  `prdId` int NOT NULL,
  `prdName` varchar(255) DEFAULT NULL,
  `prdPrice` int DEFAULT NULL,
  PRIMARY KEY (`prdId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `prd`
--

LOCK TABLES `prd` WRITE;
/*!40000 ALTER TABLE `prd` DISABLE KEYS */;
INSERT INTO `prd` VALUES (3,'Chairs',200),(4,'Pillows',30);
/*!40000 ALTER TABLE `prd` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `student`
--

DROP TABLE IF EXISTS `student`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `student` (
  `sno` decimal(10,0) NOT NULL,
  `sname` varchar(50) DEFAULT NULL,
  `sddress` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`sno`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `student`
--

LOCK TABLES `student` WRITE;
/*!40000 ALTER TABLE `student` DISABLE KEYS */;
INSERT INTO `student` VALUES (111,'Govinda','NY'),(222,'Rebecca','Santa Clara'),(333,'Adam','Pittsburgh'),(444,'Amar','Palo Alto');
/*!40000 ALTER TABLE `student` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_details`
--

DROP TABLE IF EXISTS `user_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user_details` (
  `USER_ID` int NOT NULL AUTO_INCREMENT,
  `city` varchar(255) DEFAULT NULL,
  `state` varchar(255) DEFAULT NULL,
  `street` varchar(255) DEFAULT NULL,
  `zipcode` varchar(255) DEFAULT NULL,
  `USER_NAME` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`USER_ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_details`
--

LOCK TABLES `user_details` WRITE;
/*!40000 ALTER TABLE `user_details` DISABLE KEYS */;
INSERT INTO `user_details` VALUES (1,'Bethel Park','PA','Interlaken dr','15102','Colin'),(2,'Bridgeville','PA','HighField Ct','15058','Bin');
/*!40000 ALTER TABLE `user_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `xyz`
--

DROP TABLE IF EXISTS `xyz`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `xyz` (
  `prdId` int NOT NULL,
  `product_name` varchar(255) DEFAULT NULL,
  `prdPrice` int NOT NULL,
  PRIMARY KEY (`prdId`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `xyz`
--

LOCK TABLES `xyz` WRITE;
/*!40000 ALTER TABLE `xyz` DISABLE KEYS */;
INSERT INTO `xyz` VALUES (3,'Chairs',200),(4,'Pillows',30);
/*!40000 ALTER TABLE `xyz` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-10-03 16:30:40
