-- MySQL dump 10.13  Distrib 8.0.30, for Win64 (x86_64)
--
-- Host: localhost    Database: proyecto_easy_parking
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
-- Table structure for table `plazas`
--

DROP TABLE IF EXISTS `plazas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `plazas` (
  `idPlazas` int NOT NULL AUTO_INCREMENT,
  `Plazas_Disponibles` int NOT NULL,
  `Plazas_Ocupadas` int NOT NULL,
  `Total_de_Plazas` int NOT NULL,
  `Tipo_de_Vehiculo_idTipo_de_Vehiculo` int NOT NULL,
  PRIMARY KEY (`idPlazas`),
  KEY `fk_Plazas_Tipo_de_Vehiculo1_idx` (`Tipo_de_Vehiculo_idTipo_de_Vehiculo`),
  CONSTRAINT `fk_Plazas_Tipo_de_Vehiculo1` FOREIGN KEY (`Tipo_de_Vehiculo_idTipo_de_Vehiculo`) REFERENCES `tipo_de_vehiculo` (`idTipo_de_Vehiculo`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `plazas`
--

LOCK TABLES `plazas` WRITE;
/*!40000 ALTER TABLE `plazas` DISABLE KEYS */;
INSERT INTO `plazas` VALUES (1,10,0,10,1),(3,10,0,10,3);
/*!40000 ALTER TABLE `plazas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `registro`
--

DROP TABLE IF EXISTS `registro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `registro` (
  `idRegistro` int NOT NULL AUTO_INCREMENT,
  `Placa` varchar(45) NOT NULL,
  `Hora_Ingreso` datetime(6) NOT NULL,
  `Hora_Salida` datetime(6) DEFAULT NULL,
  `Tipo_de_Vehiculo_idTipo_de_Vehiculo` int NOT NULL,
  `fechaFactura` datetime(6) DEFAULT NULL,
  `ValorFactura` double DEFAULT NULL,
  PRIMARY KEY (`idRegistro`),
  UNIQUE KEY `Placa_UNIQUE` (`Placa`),
  KEY `fk_Registro_Tipo_de_Vehiculo1_idx` (`Tipo_de_Vehiculo_idTipo_de_Vehiculo`),
  CONSTRAINT `fk_Registro_Tipo_de_Vehiculo1` FOREIGN KEY (`Tipo_de_Vehiculo_idTipo_de_Vehiculo`) REFERENCES `tipo_de_vehiculo` (`idTipo_de_Vehiculo`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `registro`
--

LOCK TABLES `registro` WRITE;
/*!40000 ALTER TABLE `registro` DISABLE KEYS */;
INSERT INTO `registro` VALUES (1,'all001','2022-09-15 08:22:10.000000','2022-10-16 20:22:10.000000',3,'2022-09-16 20:25:10.000000',510000),(3,'mmm001','2022-09-15 08:02:10.000000','2022-09-21 02:49:52.517000',1,'2022-09-21 02:49:52.517000',NULL),(4,'wr4345','2022-09-20 00:17:12.735000',NULL,1,NULL,NULL),(5,'los123','2022-09-21 00:57:29.204000',NULL,2,NULL,NULL);
/*!40000 ALTER TABLE `registro` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipo_de_vehiculo`
--

DROP TABLE IF EXISTS `tipo_de_vehiculo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tipo_de_vehiculo` (
  `idTipo_de_Vehiculo` int NOT NULL AUTO_INCREMENT,
  `Descripcion` varchar(45) NOT NULL,
  `Tarifa` int NOT NULL,
  PRIMARY KEY (`idTipo_de_Vehiculo`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb3;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipo_de_vehiculo`
--

LOCK TABLES `tipo_de_vehiculo` WRITE;
/*!40000 ALTER TABLE `tipo_de_vehiculo` DISABLE KEYS */;
INSERT INTO `tipo_de_vehiculo` VALUES (1,'Carro ',80),(2,'Moto',20),(3,'Bicicleta',5),(4,'Camion',110),(5,'Prueba ',110),(7,'Prueba cambios ',99);
/*!40000 ALTER TABLE `tipo_de_vehiculo` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-09-21 15:10:59
