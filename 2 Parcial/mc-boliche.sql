-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 27-10-2023 a las 16:35:35
-- Versión del servidor: 10.4.18-MariaDB
-- Versión de PHP: 7.3.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `mc-boliche`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `productos`
--

CREATE TABLE `productos` (
  `idproducto` int(11) NOT NULL,
  `tipo` varchar(30) NOT NULL,
  `descripcion` varchar(30) NOT NULL,
  `precio` decimal(8,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `productos`
--

INSERT INTO `productos` (`idproducto`, `tipo`, `descripcion`, `precio`) VALUES
(1000, 'Sandwiches de Carne', 'McBacon', '2700.00'),
(1001, 'Sandwiches de Carne', 'McNifica', '2900.00'),
(1002, 'Sandwiches de Carne', 'Cuarto Libra Queso', '2800.00'),
(1003, 'Sandwiches de Carne', 'Big Mac', '2200.00'),
(2000, 'Sandwiches de Pollo', 'McNuggets', '1900.00'),
(2001, 'Sandwiches de Pollo', 'McPollo', '2300.00'),
(3000, 'Acompañamientos', 'Papa', '1500.00'),
(3001, 'Acompañamientos', 'Ensalada', '1700.00'),
(4000, 'Bebidas', 'Gaseosa Comun', '1000.00'),
(4001, 'Bebidas', 'Gaseosa Light', '1000.00'),
(4002, 'Bebidas', 'Agua', '950.00'),
(5000, 'Postres', 'Sundae', '1400.00'),
(5001, 'Postres', 'Cono', '600.00');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `productos`
--
ALTER TABLE `productos`
  ADD PRIMARY KEY (`idproducto`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
