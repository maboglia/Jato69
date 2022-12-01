
--
-- Table structure for table `alimenti`
--

DROP TABLE IF EXISTS `alimenti`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `alimenti` (
  `id` int NOT NULL AUTO_INCREMENT,
  `categoria` varchar(25) NOT NULL,
  `prodotto` varchar(100) NOT NULL,
  `proteine` decimal(6,2) DEFAULT NULL,
  `lipidi` decimal(6,2) DEFAULT NULL,
  `carboidrati` decimal(6,2) DEFAULT NULL,
  `energia` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=776 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

