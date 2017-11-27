-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Erstellungszeit: 27. Nov 2017 um 15:15
-- Server-Version: 10.1.10-MariaDB
-- PHP-Version: 5.6.19

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Datenbank: `zimt`
--

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `t_email`
--

CREATE TABLE `t_email` (
  `id` int(50) NOT NULL,
  `email` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Daten für Tabelle `t_email`
--

INSERT INTO `t_email` (`id`, `email`) VALUES
(55654, 'ChrossChrispy@zimt.tv'),
(55654, 'ChrossChrispy@zimt.berlin');

-- --------------------------------------------------------

--
-- Tabellenstruktur für Tabelle `t_login`
--

CREATE TABLE `t_login` (
  `id` int(50) NOT NULL,
  `vorname` varchar(255) NOT NULL,
  `nachname` varchar(255) NOT NULL,
  `loginname` varchar(255) NOT NULL,
  `passwort` varchar(255) NOT NULL,
  `birthday` date NOT NULL,
  `admin` tinyint(1) NOT NULL,
  `active` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Daten für Tabelle `t_login`
--

INSERT INTO `t_login` (`id`, `vorname`, `nachname`, `loginname`, `passwort`, `birthday`, `admin`, `active`) VALUES
(55654, 'Chris', 'Chross', 'ChrossChrispy', '*8847044C5B239D04ACF5B79548EB4A61F7366A7A', '1999-05-06', 1, 1),
(55654, 'Chris', 'Chross', 'ChrossChrispy', 'Chrispychrossy55', '1999-05-06', 1, 1);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
