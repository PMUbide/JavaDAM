-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 19-04-2021 a las 17:01:46
-- Versión del servidor: 5.7.31
-- Versión de PHP: 7.3.21

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
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

DROP TABLE IF EXISTS `grupo`;
CREATE TABLE IF NOT EXISTS `grupo` (
  `idGrupo` int(11) NOT NULL AUTO_INCREMENT,
  `fechaSalida` datetime NOT NULL,
  `idRuta` int(11) NOT NULL,
  `aforoMax` int(11) DEFAULT NULL,
  `apuntados` int(11) DEFAULT NULL,
  `completo` tinyint(1) DEFAULT NULL,
  `fechaCreacion` datetime DEFAULT NULL,
  PRIMARY KEY (`idGrupo`),
  UNIQUE KEY `UQ_idGrupo` (`idGrupo`),
  KEY `FK_ruta_TO_grupo` (`idRuta`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

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

DROP TABLE IF EXISTS `ruta`;
CREATE TABLE IF NOT EXISTS `ruta` (
  `nombre` varchar(50) NOT NULL,
  `descripcion` varchar(1000) DEFAULT NULL,
  `id_ruta` int(11) NOT NULL AUTO_INCREMENT,
  `id_user` int(11) DEFAULT NULL,
  `pto_fin` varchar(255) DEFAULT NULL,
  `pto_inicio` varchar(255) DEFAULT NULL,
  `url_map` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_ruta`),
  UNIQUE KEY `UQ_nombre` (`nombre`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `ruta`
--

INSERT INTO `ruta` (`nombre`, `descripcion`, `id_ruta`, `id_user`, `pto_fin`, `pto_inicio`, `url_map`) VALUES
('Ruta a María por la nacional', 'Intentaremos ferries', 1, 1, NULL, NULL, NULL),
('Camino a los molinos', 'Ruta exigente, llevad agua y comida, si quereis vivir', 2, 2, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

DROP TABLE IF EXISTS `usuario`;
CREATE TABLE IF NOT EXISTS `usuario` (
  `id_user` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) NOT NULL,
  `apellidos` varchar(50) NOT NULL,
  `telefono` varchar(15) NOT NULL,
  `ciudad` varchar(50) DEFAULT NULL,
  `bicicleta` varchar(50) DEFAULT NULL,
  `edad` int(11) DEFAULT NULL,
  `sexo` varchar(1) DEFAULT NULL,
  `foto` varchar(1000) DEFAULT NULL,
  `contrasena` varchar(50) NOT NULL,
  `nick` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_user`),
  UNIQUE KEY `UQ_idUser` (`id_user`)
) ENGINE=MyISAM AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`id_user`, `nombre`, `apellidos`, `telefono`, `ciudad`, `bicicleta`, `edad`, `sexo`, `foto`, `contrasena`, `nick`) VALUES
(1, 'Enrique', 'Gimeno', '661236342', 'Zaragoza', 'Orbea', 27, '1', NULL, 'moneditas', 'anfetos'),
(2, 'Jorge', 'Ruiz', '655131123', 'Zaragoza', '', 27, '1', NULL, 'canada95', 'gorronegra'),
(3, 'Edurne', 'Abian', '655111111', 'María de Huerva', '', 18, '2', NULL, 'moviltechosolar19', 'dudu'),
(4, 'Pablo', 'Martinez', '666010101', 'Graus', '', 29, '1', NULL, 'RIP2019', 'larosa'),
(5, 'Cesar', 'Cesario', '615151515', 'Zaragoza', 'patinete', 15, '1', NULL, '123415', 'quincePorciento'),
(6, 'o', 'loaoaoaoaooa', 'a', 'a', 'a', 23, '1', 'a', 'asdasd', 'asdasd'),
(7, 'a', 'a', 'a', 'a', 'a', 55, '1', 'a', 'a', 'a'),
(8, 'paco', 'porras', '9843883', 'zaragoza', 'sin bici', 99, '1', 'sin foto', 'asd', 'anfetos2');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario_grupo`
--

DROP TABLE IF EXISTS `usuario_grupo`;
CREATE TABLE IF NOT EXISTS `usuario_grupo` (
  `idGrupo` int(11) NOT NULL,
  `idUser` int(11) NOT NULL,
  KEY `FK_grupo_TO_usuario_grupo` (`idGrupo`),
  KEY `FK_usuario_TO_usuario_grupo` (`idUser`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `usuario_grupo`
--

INSERT INTO `usuario_grupo` (`idGrupo`, `idUser`) VALUES
(1, 5),
(1, 4);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
