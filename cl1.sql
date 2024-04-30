-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 19-04-2024 a las 08:54:39
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `cl1`
--
CREATE DATABASE IF NOT EXISTS `cl1` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci;
USE `cl1`;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `categoria`
--

CREATE TABLE `categoria` (
  `id` bigint(20) NOT NULL,
  `nombre` varchar(45) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `categoria`
--

INSERT INTO `categoria` (`id`, `nombre`) VALUES
(1, 'Quimica'),
(2, 'Fisica'),
(3, 'Matematica');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `docente`
--

CREATE TABLE `docente` (
  `sueldo` double DEFAULT NULL,
  `fecha_nacimiento` datetime(6) DEFAULT NULL,
  `fkcategoria` bigint(20) DEFAULT NULL,
  `id` bigint(20) NOT NULL,
  `email` varchar(45) DEFAULT NULL,
  `nombre` varchar(45) DEFAULT NULL,
  `sexo` varchar(45) DEFAULT NULL,
  `dni` char(8) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `docente`
--

INSERT INTO `docente` (`sueldo`, `fecha_nacimiento`, `fkcategoria`, `id`, `email`, `nombre`, `sexo`, `dni`) VALUES
(1200.5, '2002-05-24 19:00:00.000000', 3, 1, 'Jose@cibertec.edu.pe', 'Jose', 'masculino', '45789856'),
(1130.5, '2000-02-11 19:00:00.000000', 2, 2, 'Carla@cibertec.edu.pe', 'Carla', 'femenino', '45789632'),
(1130.5, '2000-02-11 19:00:00.000000', 2, 3, 'Carla@cibertec.edu.pe', 'Carla', 'femenino', '45789632');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `categoria`
--
ALTER TABLE `categoria`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `docente`
--
ALTER TABLE `docente`
  ADD PRIMARY KEY (`id`),
  ADD KEY `FK6hedqpv7difv1g64w0ol3j2ov` (`fkcategoria`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `categoria`
--
ALTER TABLE `categoria`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `docente`
--
ALTER TABLE `docente`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `docente`
--
ALTER TABLE `docente`
  ADD CONSTRAINT `FK6hedqpv7difv1g64w0ol3j2ov` FOREIGN KEY (`fkcategoria`) REFERENCES `categoria` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
