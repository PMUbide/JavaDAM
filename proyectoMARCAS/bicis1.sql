-- phpMyAdmin SQL Dump
-- version 4.9.1
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost
-- Tiempo de generación: 19-04-2021 a las 17:12:11
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
  `id_grupo` int(11) NOT NULL,
  `fechaSalida` datetime NOT NULL,
  `id_ruta` int(11) NOT NULL,
  `aforoMax` int(11) DEFAULT NULL,
  `apuntados` int(11) DEFAULT NULL,
  `completo` tinyint(1) DEFAULT NULL,
  `fechaCreacion` datetime DEFAULT NULL,
  `aforo_max` int(11) DEFAULT NULL,
  `fecha_creacion` varchar(255) DEFAULT NULL,
  `fecha_salida` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `grupo`
--

INSERT INTO `grupo` (`id_grupo`, `fechaSalida`, `id_ruta`, `aforoMax`, `apuntados`, `completo`, `fechaCreacion`, `aforo_max`, `fecha_creacion`, `fecha_salida`) VALUES
(1, '2018-12-31 09:00:00', 1, 4, 2, 0, '2018-12-30 18:00:00', NULL, NULL, NULL),
(2, '2018-10-02 09:00:00', 2, 2, 0, 0, '2018-10-01 18:00:00', NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `native`
--

CREATE TABLE `native` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `native`
--

INSERT INTO `native` (`next_val`) VALUES
(1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ruta`
--

CREATE TABLE `ruta` (
  `id_ruta` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `id_user` int(11) DEFAULT NULL,
  `descripcion` varchar(1000) DEFAULT NULL,
  `pto_fin` varchar(255) DEFAULT NULL,
  `pto_inicio` varchar(255) DEFAULT NULL,
  `url_map` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `ruta`
--

INSERT INTO `ruta` (`id_ruta`, `nombre`, `id_user`, `descripcion`, `pto_fin`, `pto_inicio`, `url_map`) VALUES
(1, 'Ruta a María por la nacional', 1, 'Intentaremos ferries', NULL, NULL, NULL),
(2, 'Camino a los molinos', 2, 'Ruta exigente, llevad agua y comida, si quereis vivir', NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `id_user` int(11) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `apellidos` varchar(50) NOT NULL,
  `telefono` varchar(15) NOT NULL,
  `ciudad` varchar(50) DEFAULT NULL,
  `bicicleta` varchar(50) DEFAULT NULL,
  `edad` tinyint(4) DEFAULT NULL,
  `sexo` varchar(1) DEFAULT NULL,
  `foto` varchar(500) DEFAULT NULL,
  `nick` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `contrasena` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`id_user`, `nombre`, `apellidos`, `telefono`, `ciudad`, `bicicleta`, `edad`, `sexo`, `foto`, `nick`, `contrasena`) VALUES
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
  `id_grupo` int(11) NOT NULL,
  `id_user` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Volcado de datos para la tabla `usuario_grupo`
--

INSERT INTO `usuario_grupo` (`id_grupo`, `id_user`) VALUES
(1, 5),
(1, 4);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `grupo`
--
ALTER TABLE `grupo`
  ADD PRIMARY KEY (`id_grupo`),
  ADD UNIQUE KEY `UQ_idGrupo` (`id_grupo`),
  ADD KEY `FK_ruta_TO_grupo` (`id_ruta`);

--
-- Indices de la tabla `ruta`
--
ALTER TABLE `ruta`
  ADD PRIMARY KEY (`id_ruta`),
  ADD UNIQUE KEY `UQ_idRuta` (`id_ruta`),
  ADD UNIQUE KEY `UQ_nombre` (`nombre`),
  ADD KEY `FK_usuario_TO_ruta` (`id_user`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id_user`),
  ADD UNIQUE KEY `UQ_idUser` (`id_user`),
  ADD UNIQUE KEY `UQ_usuario` (`nick`);

--
-- Indices de la tabla `usuario_grupo`
--
ALTER TABLE `usuario_grupo`
  ADD KEY `FK_grupo_TO_usuario_grupo` (`id_grupo`),
  ADD KEY `FK_usuario_TO_usuario_grupo` (`id_user`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `grupo`
--
ALTER TABLE `grupo`
  MODIFY `id_grupo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `ruta`
--
ALTER TABLE `ruta`
  MODIFY `id_ruta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `id_user` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `grupo`
--
ALTER TABLE `grupo`
  ADD CONSTRAINT `FK_ruta_TO_grupo` FOREIGN KEY (`id_ruta`) REFERENCES `ruta` (`id_ruta`);

--
-- Filtros para la tabla `ruta`
--
ALTER TABLE `ruta`
  ADD CONSTRAINT `FK_usuario_TO_ruta` FOREIGN KEY (`id_user`) REFERENCES `usuario` (`id_user`);

--
-- Filtros para la tabla `usuario_grupo`
--
ALTER TABLE `usuario_grupo`
  ADD CONSTRAINT `FK_grupo_TO_usuario_grupo` FOREIGN KEY (`id_grupo`) REFERENCES `grupo` (`id_grupo`),
  ADD CONSTRAINT `FK_usuario_TO_usuario_grupo` FOREIGN KEY (`id_user`) REFERENCES `usuario` (`id_user`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
