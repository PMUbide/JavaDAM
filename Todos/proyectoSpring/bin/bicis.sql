-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 12-04-2021 a las 15:33:19
-- Versión del servidor: 8.0.17
-- Versión de PHP: 7.3.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `bicis`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `grupo`
--

CREATE TABLE `grupo` (
  `idGrupo` int(11) NOT NULL,
  `fechaSalida` datetime NOT NULL,
  `idRuta` int(11) NOT NULL,
  `aforoMax` int(11) DEFAULT NULL,
  `apuntados` int(11) DEFAULT NULL,
  `completo` tinyint(1) DEFAULT NULL,
  `fechaCreacion` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `grupo`
--

INSERT INTO `grupo` (`idGrupo`, `fechaSalida`, `idRuta`, `aforoMax`, `apuntados`, `completo`, `fechaCreacion`) VALUES
(1, '2018-12-31 09:00:00', 1, 4, 2, 0, '2018-12-30 18:00:00'),
(2, '2018-10-02 09:00:00', 2, 2, 0, 0, '2018-10-01 18:00:00');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ruta`
--

CREATE TABLE `ruta` (
  `idRuta` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `inicio` varchar(50) DEFAULT NULL,
  `final` varchar(50) DEFAULT NULL,
  `idUser` int(11) DEFAULT NULL,
  `descripcion` varchar(1000) DEFAULT NULL,
  `urlMap` varchar(1000) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `ruta`
--

INSERT INTO `ruta` (`idRuta`, `nombre`, `inicio`, `final`, `idUser`, `descripcion`, `urlMap`) VALUES
(1, 'Ruta a María por la nacional', 'Puerta Salesianos', 'Principio del pueblo', 1, 'Intentaremos ferries', 'https://www.google.com/maps/dir/41.6449558,-0.9036664/41.5432246,-0.9949279/@41.5945323,-0.9874811,11.5z/data=!4m4!4m3!2m1!3b1!3e1'),
(2, 'Camino a los molinos', 'Cementerio de Torrero', 'Monte molinos', 2, 'Ruta exigente, llevad agua y comida, si quereis vivir', 'https://www.google.com/maps/dir/Cementerio+torrero..+TANATORIOS,+Calle+G,+Zaragoza/41.5187719,-0.9164034/@41.5606461,-0.9385922,17882m/data=!3m1!1e3!4m11!4m10!1m5!1m1!1s0xd5915020c2c2a23:0xc25d70ff1f044590!2m2!1d-0.8891312!2d41.6197382!1m0!2m1!3b1!3e1');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `idUser` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `apellidos` varchar(50) NOT NULL,
  `telefono` varchar(15) NOT NULL,
  `ciudad` varchar(50) DEFAULT NULL,
  `bicicleta` varchar(50) DEFAULT NULL,
  `edad` tinyint(4) DEFAULT NULL,
  `sexo` varchar(1) DEFAULT NULL,
  `foto` longblob,
  `usuario` varchar(50) NOT NULL,
  `contrasena` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`idUser`, `nombre`, `apellidos`, `telefono`, `ciudad`, `bicicleta`, `edad`, `sexo`, `foto`, `usuario`, `contrasena`) VALUES
(1, 'Enrique', 'Gimeno', '661236342', 'Zaragoza', 'Orbea', 27, '1', NULL, 'fibolovah', 'moneditas'),
(2, 'Jorge', 'Ruiz', '655131123', 'Zaragoza', '', 27, '1', NULL, 'gorronegra', 'canada95'),
(3, 'Edurne', 'Abian', '655111111', 'María de Huerva', '', 18, '2', NULL, 'dudu', 'moviltechosolar19'),
(4, 'Pablo', 'Martinez', '666010101', 'Graus', '', 29, '1', NULL, 'Kobed19', 'RIP2019'),
(5, 'Cesar', 'Cesario', '615151515', 'Zaragoza', 'patinete', 15, '1', NULL, 'Babuino15', '123415');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario_grupo`
--

CREATE TABLE `usuario_grupo` (
  `idGrupo` int(11) NOT NULL,
  `idUser` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `usuario_grupo`
--

INSERT INTO `usuario_grupo` (`idGrupo`, `idUser`) VALUES
(1, 5),
(1, 4);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `grupo`
--
ALTER TABLE `grupo`
  ADD PRIMARY KEY (`idGrupo`),
  ADD UNIQUE KEY `UQ_idGrupo` (`idGrupo`),
  ADD KEY `FK_ruta_TO_grupo` (`idRuta`);

--
-- Indices de la tabla `ruta`
--
ALTER TABLE `ruta`
  ADD PRIMARY KEY (`idRuta`),
  ADD UNIQUE KEY `UQ_idRuta` (`idRuta`),
  ADD UNIQUE KEY `UQ_nombre` (`nombre`),
  ADD KEY `FK_usuario_TO_ruta` (`idUser`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`idUser`),
  ADD UNIQUE KEY `UQ_idUser` (`idUser`),
  ADD UNIQUE KEY `UQ_usuario` (`usuario`);

--
-- Indices de la tabla `usuario_grupo`
--
ALTER TABLE `usuario_grupo`
  ADD KEY `FK_grupo_TO_usuario_grupo` (`idGrupo`),
  ADD KEY `FK_usuario_TO_usuario_grupo` (`idUser`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `grupo`
--
ALTER TABLE `grupo`
  MODIFY `idGrupo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `ruta`
--
ALTER TABLE `ruta`
  MODIFY `idRuta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `idUser` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `grupo`
--
ALTER TABLE `grupo`
  ADD CONSTRAINT `FK_ruta_TO_grupo` FOREIGN KEY (`idRuta`) REFERENCES `ruta` (`idRuta`);

--
-- Filtros para la tabla `ruta`
--
ALTER TABLE `ruta`
  ADD CONSTRAINT `FK_usuario_TO_ruta` FOREIGN KEY (`idUser`) REFERENCES `usuario` (`idUser`);

--
-- Filtros para la tabla `usuario_grupo`
--
ALTER TABLE `usuario_grupo`
  ADD CONSTRAINT `FK_grupo_TO_usuario_grupo` FOREIGN KEY (`idGrupo`) REFERENCES `grupo` (`idGrupo`),
  ADD CONSTRAINT `FK_usuario_TO_usuario_grupo` FOREIGN KEY (`idUser`) REFERENCES `usuario` (`idUser`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
