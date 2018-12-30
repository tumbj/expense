-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 30, 2018 at 07:31 PM
-- Server version: 10.1.36-MariaDB
-- PHP Version: 7.2.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `expense`
--

-- --------------------------------------------------------

--
-- Table structure for table `expensetable`
--

CREATE TABLE `expensetable` (
  `ID` int(10) NOT NULL,
  `Description` varchar(255) NOT NULL,
  `Money` int(100) NOT NULL,
  `Type` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `expensetable`
--

INSERT INTO `expensetable` (`ID`, `Description`, `Money`, `Type`) VALUES
(1, 'mom give', 100, 'income'),
(2, 'father give', 250, 'income'),
(3, 'brother give', 100, 'income'),
(4, 'buy rice', 100, 'expense'),
(5, 'mom give', 100, 'income'),
(6, 'father give', 250, 'income'),
(7, 'brother give', 100, 'income'),
(8, 'buy rice', 100, 'expense');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `expensetable`
--
ALTER TABLE `expensetable`
  ADD PRIMARY KEY (`ID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `expensetable`
--
ALTER TABLE `expensetable`
  MODIFY `ID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
