-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 20-10-2020 a las 09:02:34
-- Versión del servidor: 10.1.38-MariaDB
-- Versión de PHP: 7.3.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `handle_pruebas`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tran_x_prod`
--

CREATE TABLE `tran_x_prod` (
  `id_txp` int(11) UNSIGNED NOT NULL,
  `id_transaction` int(11) UNSIGNED NOT NULL,
  `id_product` int(11) UNSIGNED NOT NULL,
  `quantity_t` int(11) UNSIGNED DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `tran_x_prod`
--

INSERT INTO `tran_x_prod` (`id_txp`, `id_transaction`, `id_product`, `quantity_t`) VALUES
(1, 1, 1, 1),
(2, 1, 4, 1),
(3, 2, 3, 2),
(4, 3, 3, 1),
(5, 4, 2, 1),
(6, 4, 1, 1),
(7, 5, 1, 1),
(8, 5, 2, 1),
(9, 5, 3, 1),
(10, 5, 3, 1),
(11, 5, 4, 1),
(12, 6, 1, 1),
(13, 6, 2, 1),
(14, 6, 4, 1),
(15, 7, 1, 1),
(16, 8, 1, 1),
(17, 9, 1, 1),
(18, 10, 1, 1),
(19, 11, 1, 1),
(20, 12, 1, 1),
(21, 13, 2, 1),
(22, 14, 3, 1),
(23, 14, 4, 1),
(24, 15, 3, 3),
(25, 16, 3, 1),
(26, 17, 3, 1),
(27, 18, 3, 1),
(28, 19, 3, 3),
(29, 20, 3, 3),
(30, 21, 3, 1),
(31, 22, 3, 7),
(32, 23, 3, 14),
(33, 24, 4, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `t_product`
--

CREATE TABLE `t_product` (
  `id_product` int(11) UNSIGNED NOT NULL,
  `name` varchar(244) DEFAULT NULL,
  `quantity` int(11) UNSIGNED DEFAULT NULL,
  `status` varchar(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `t_product`
--

INSERT INTO `t_product` (`id_product`, `name`, `quantity`, `status`) VALUES
(1, 'Teclado Logitech 345 Editado', 96, '1'),
(2, 'Mouse Logitech 567', 96, '1'),
(3, 'Laptop Lenovo Ideapad 520', 100, '1'),
(4, 'HeadPhones Sony M333', 95, '1'),
(7, 'Producto Nuevo w', 35, '1');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `t_transaction`
--

CREATE TABLE `t_transaction` (
  `id_transaction` int(11) UNSIGNED NOT NULL,
  `id_user` int(10) UNSIGNED NOT NULL,
  `serial_number` varchar(244) DEFAULT NULL,
  `date` date DEFAULT NULL,
  `status` varchar(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `t_transaction`
--

INSERT INTO `t_transaction` (`id_transaction`, `id_user`, `serial_number`, `date`, `status`) VALUES
(1, 1, '00001', '2020-10-03', '1'),
(2, 1, '00002', '2020-10-05', '1'),
(3, 1, '00003', '2020-10-05', '1'),
(4, 4, '00004', '2020-10-05', '1'),
(5, 1, '00005', '2020-10-08', '1'),
(6, 1, '00006', '2020-10-09', '1'),
(7, 1, '00007', '2020-10-09', '1'),
(8, 1, '00008', '2020-10-09', '1'),
(9, 1, '00009', '2020-10-09', '1'),
(10, 1, '00010', '2020-10-09', '1'),
(11, 1, '00011', '2020-10-09', '1'),
(12, 1, '00012', '2020-10-09', '1'),
(13, 1, '00012', '2020-10-09', '1'),
(14, 1, '00012', '2020-10-09', '1'),
(15, 1, '00013', '2020-10-13', '1'),
(16, 1, '00014', '2020-10-13', '1'),
(17, 1, '00015', '2020-10-13', '1'),
(18, 1, '00016', '2020-10-13', '1'),
(19, 1, '00017', '2020-10-14', '1'),
(20, 1, '00018', '2020-10-14', '1'),
(21, 1, '00019', '2020-10-14', '1'),
(22, 1, '00020', '2020-10-14', '1'),
(23, 1, '00021', '2020-10-14', '1'),
(24, 1, '00022', '2020-10-14', '1');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `t_user`
--

CREATE TABLE `t_user` (
  `id_user` int(10) UNSIGNED NOT NULL,
  `pass` varchar(8) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  `phone` varchar(9) DEFAULT NULL,
  `status` varchar(1) DEFAULT NULL,
  `user` varchar(8) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Volcado de datos para la tabla `t_user`
--

INSERT INTO `t_user` (`id_user`, `pass`, `name`, `phone`, `status`, `user`) VALUES
(1, 'admin', 'Administrador sistema', '322322322', '1', 'admin'),
(2, '123', 'usuario prueba', '12312312', '2', 'user'),
(4, '123', 'prueba', '1111', '2', 'pru'),
(5, '145', 'usuario ', '333333', '2', 'tuuu'),
(6, '420', 'jotica', '310825749', '2', 'user');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `tran_x_prod`
--
ALTER TABLE `tran_x_prod`
  ADD PRIMARY KEY (`id_txp`,`id_transaction`,`id_product`),
  ADD KEY `tran_has_prod_FKIndex1` (`id_transaction`) USING BTREE,
  ADD KEY `tran_has_prod_FKIndex2` (`id_product`) USING BTREE;

--
-- Indices de la tabla `t_product`
--
ALTER TABLE `t_product`
  ADD PRIMARY KEY (`id_product`);

--
-- Indices de la tabla `t_transaction`
--
ALTER TABLE `t_transaction`
  ADD PRIMARY KEY (`id_transaction`),
  ADD KEY `id_user` (`id_user`) USING BTREE;

--
-- Indices de la tabla `t_user`
--
ALTER TABLE `t_user`
  ADD PRIMARY KEY (`id_user`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `tran_x_prod`
--
ALTER TABLE `tran_x_prod`
  MODIFY `id_txp` int(11) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=34;

--
-- AUTO_INCREMENT de la tabla `t_product`
--
ALTER TABLE `t_product`
  MODIFY `id_product` int(11) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `t_transaction`
--
ALTER TABLE `t_transaction`
  MODIFY `id_transaction` int(11) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=25;

--
-- AUTO_INCREMENT de la tabla `t_user`
--
ALTER TABLE `t_user`
  MODIFY `id_user` int(10) UNSIGNED NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `tran_x_prod`
--
ALTER TABLE `tran_x_prod`
  ADD CONSTRAINT `tran_x_prod_ibfk_1` FOREIGN KEY (`id_transaction`) REFERENCES `t_transaction` (`id_transaction`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  ADD CONSTRAINT `tran_x_prod_ibfk_2` FOREIGN KEY (`id_product`) REFERENCES `t_product` (`id_product`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Filtros para la tabla `t_transaction`
--
ALTER TABLE `t_transaction`
  ADD CONSTRAINT `t_transaction_ibfk_1` FOREIGN KEY (`id_user`) REFERENCES `t_user` (`id_user`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
