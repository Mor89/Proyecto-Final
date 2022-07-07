-- phpMyAdmin SQL Dump
-- version 5.1.3
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 07-07-2022 a las 03:54:28
-- Versión del servidor: 10.4.24-MariaDB
-- Versión de PHP: 7.4.29

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bd_inventario`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tb_categoria`
--

CREATE TABLE `tb_categoria` (
  `id_categoria` int(5) NOT NULL,
  `nom_categoria` varchar(50) NOT NULL,
  `estado_categoria` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `tb_categoria`
--

INSERT INTO `tb_categoria` (`id_categoria`, `nom_categoria`, `estado_categoria`) VALUES
(1002, 'Mesa', 5),
(1005, 'Pupusas', 1),
(1011, 'lknlk', 1),
(1012, 'lknlk', 1),
(1014, 'lmlkmkmk', 1),
(1015, 'zanahoria', 1),
(1016, 'zanahoria', 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tb_producto`
--

CREATE TABLE `tb_producto` (
  `id_producto` int(9) NOT NULL,
  `nom_producto` varchar(50) NOT NULL,
  `stock` decimal(3,2) DEFAULT NULL,
  `precio` decimal(3,2) DEFAULT NULL,
  `unidad_de_medida` varchar(20) DEFAULT NULL,
  `estado_producto` tinyint(1) DEFAULT NULL,
  `categoria` int(5) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `tb_producto`
--

INSERT INTO `tb_producto` (`id_producto`, `nom_producto`, `stock`, `precio`, `unidad_de_medida`, `estado_producto`, `categoria`) VALUES
(1, 'Laptop', '1.80', '3.60', 'Dolar', 1, 1002),
(9, 'zanahoria', '3.20', '3.60', 'dolar', 1, 1014),
(11, 'zanahoria', '9.00', '3.80', 'euro', 1, 1002),
(12, 'gato', '3.60', '3.60', 'euro', 20, 1015);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tb_usuario`
--

CREATE TABLE `tb_usuario` (
  `id` int(11) NOT NULL,
  `nombre` varchar(60) NOT NULL,
  `apellido` varchar(40) NOT NULL,
  `correo` varchar(60) NOT NULL,
  `usuario` varchar(50) NOT NULL,
  `clave` varchar(150) NOT NULL,
  `tipo` int(3) NOT NULL,
  `estado` tinyint(1) NOT NULL,
  `pregunta` varchar(100) NOT NULL,
  `respuesta` varchar(50) NOT NULL,
  `fecha_registro` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `tb_usuario`
--

INSERT INTO `tb_usuario` (`id`, `nombre`, `apellido`, `correo`, `usuario`, `clave`, `tipo`, `estado`, `pregunta`, `respuesta`, `fecha_registro`) VALUES
(1, 'Salvador', 'Valladares', 'salvador.valladares21@itca.edu.sv', 'Salvador', '827ccb0eea8a706c4c34a16891f84e7b', 1, 1, '', '', '2022-07-07 01:51:28');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `tb_categoria`
--
ALTER TABLE `tb_categoria`
  ADD PRIMARY KEY (`id_categoria`);

--
-- Indices de la tabla `tb_producto`
--
ALTER TABLE `tb_producto`
  ADD PRIMARY KEY (`id_producto`),
  ADD KEY `categoria` (`categoria`);

--
-- Indices de la tabla `tb_usuario`
--
ALTER TABLE `tb_usuario`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `tb_categoria`
--
ALTER TABLE `tb_categoria`
  MODIFY `id_categoria` int(5) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=1017;

--
-- AUTO_INCREMENT de la tabla `tb_producto`
--
ALTER TABLE `tb_producto`
  MODIFY `id_producto` int(9) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=14;

--
-- AUTO_INCREMENT de la tabla `tb_usuario`
--
ALTER TABLE `tb_usuario`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `tb_producto`
--
ALTER TABLE `tb_producto`
  ADD CONSTRAINT `tb_producto_ibfk_1` FOREIGN KEY (`categoria`) REFERENCES `tb_categoria` (`id_categoria`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
