-- phpMyAdmin SQL Dump
-- version 4.5.2
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Dec 15, 2015 at 03:15 AM
-- Server version: 10.0.21-MariaDB
-- PHP Version: 5.6.16

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `imobiliaria`
--

-- --------------------------------------------------------

--
-- Table structure for table `tb_anuncios`
--

CREATE TABLE `tb_anuncios` (
  `codAnuncio` int(11) NOT NULL,
  `Status` int(11) DEFAULT NULL,
  `bairro` varchar(255) DEFAULT NULL,
  `cidade` varchar(255) DEFAULT NULL,
  `dataFim` date DEFAULT NULL,
  `dataIni` date DEFAULT NULL,
  `descricao` varchar(8000) DEFAULT NULL,
  `vlrLocacao` decimal(19,2) DEFAULT NULL,
  `usuario` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_anuncios`
--

INSERT INTO `tb_anuncios` (`codAnuncio`, `Status`, `bairro`, `cidade`, `dataFim`, `dataIni`, `descricao`, `vlrLocacao`, `usuario`) VALUES
(1, 0, 'Centro', 'Uberlandia', '2015-01-15', '2015-01-01', 'Casa em condominio', '800.00', 1);

-- --------------------------------------------------------

--
-- Table structure for table `tb_favoritos`
--

CREATE TABLE `tb_favoritos` (
  `codFavorito` int(11) NOT NULL,
  `anuncio` int(11) DEFAULT NULL,
  `usuario` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_favoritos`
--

INSERT INTO `tb_favoritos` (`codFavorito`, `anuncio`, `usuario`) VALUES
(1, 1, 2);

-- --------------------------------------------------------

--
-- Table structure for table `tb_fotos`
--

CREATE TABLE `tb_fotos` (
  `codFoto` int(11) NOT NULL,
  `caminho` varchar(255) DEFAULT NULL,
  `anuncio` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_fotos`
--

INSERT INTO `tb_fotos` (`codFoto`, `caminho`, `anuncio`) VALUES
(1, '/Foto1.jpg', 1),
(2, '/Foto2.jpg', 1),
(3, '/Foto3.jpg', 1),
(4, '/Foto4.jpg', 1),
(5, '/Foto5.jpg', 1),
(6, '/Foto6.jpg', 1);

-- --------------------------------------------------------

--
-- Table structure for table `tb_horariosvisitas`
--

CREATE TABLE `tb_horariosvisitas` (
  `codHorarioVisita` int(11) NOT NULL,
  `Horario` datetime DEFAULT NULL,
  `Observacao` varchar(255) DEFAULT NULL,
  `anuncio` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_horariosvisitas`
--

INSERT INTO `tb_horariosvisitas` (`codHorarioVisita`, `Horario`, `Observacao`, `anuncio`) VALUES
(1, '2015-12-31 00:00:00', 'Quem chegar primeiro ligue para a contra-parte', 1);

-- --------------------------------------------------------

--
-- Table structure for table `tb_locacao`
--

CREATE TABLE `tb_locacao` (
  `codLocacao` int(11) NOT NULL,
  `dataLocacao` date DEFAULT NULL,
  `locarComoLocador` int(11) DEFAULT NULL,
  `locarComoLocatario` int(11) DEFAULT NULL,
  `locador` int(11) DEFAULT NULL,
  `locatario` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_locacao`
--

INSERT INTO `tb_locacao` (`codLocacao`, `dataLocacao`, `locarComoLocador`, `locarComoLocatario`, `locador`, `locatario`) VALUES
(1, '2015-01-01', 1, 1, 2, 1);

-- --------------------------------------------------------

--
-- Table structure for table `tb_questoes`
--

CREATE TABLE `tb_questoes` (
  `codQuestao` int(11) NOT NULL,
  `pergunta` varchar(255) DEFAULT NULL,
  `resposta` varchar(255) DEFAULT NULL,
  `anuncio` int(11) DEFAULT NULL,
  `usuario` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_questoes`
--

INSERT INTO `tb_questoes` (`codQuestao`, `pergunta`, `resposta`, `anuncio`, `usuario`) VALUES
(1, 'A casa possui quantas vagas de garagem?', 'Possui 2 vagas', 1, 2);

-- --------------------------------------------------------

--
-- Table structure for table `tb_usuarios`
--

CREATE TABLE `tb_usuarios` (
  `codUsuario` int(11) NOT NULL,
  `celular` varchar(255) DEFAULT NULL,
  `cpf` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `senha` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `tb_usuarios`
--

INSERT INTO `tb_usuarios` (`codUsuario`, `celular`, `cpf`, `email`, `nome`, `senha`) VALUES
(1, '349999-9999', '111.111.111-11', 'email@email.com', 'Leandro Locador', '123456'),
(2, '349999-99990', '222.222.222-22', 'email2@email.com', 'Leandro Locatário', '654321');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tb_anuncios`
--
ALTER TABLE `tb_anuncios`
  ADD PRIMARY KEY (`codAnuncio`),
  ADD KEY `FKe4t0sc33201hls53ppxx2oohi` (`usuario`);

--
-- Indexes for table `tb_favoritos`
--
ALTER TABLE `tb_favoritos`
  ADD PRIMARY KEY (`codFavorito`),
  ADD KEY `FKba8kysnugig4k29hml0x77cxw` (`anuncio`),
  ADD KEY `FKo13ebocjl4fjk0m7yciln96y8` (`usuario`);

--
-- Indexes for table `tb_fotos`
--
ALTER TABLE `tb_fotos`
  ADD PRIMARY KEY (`codFoto`),
  ADD KEY `FKp2e31vc11swjr958axonfdx8o` (`anuncio`);

--
-- Indexes for table `tb_horariosvisitas`
--
ALTER TABLE `tb_horariosvisitas`
  ADD PRIMARY KEY (`codHorarioVisita`),
  ADD KEY `FK4hmgf2ndesgbf1hrvq5qx2alw` (`anuncio`);

--
-- Indexes for table `tb_locacao`
--
ALTER TABLE `tb_locacao`
  ADD PRIMARY KEY (`codLocacao`),
  ADD KEY `FK914ssq6rmapxnh3fwl4ina43m` (`locador`),
  ADD KEY `FK6q1g5xnj52d5ktredxnfgjdg2` (`locatario`);

--
-- Indexes for table `tb_questoes`
--
ALTER TABLE `tb_questoes`
  ADD PRIMARY KEY (`codQuestao`),
  ADD KEY `FKpcbiefxd82kdw1by6qh8h7y34` (`usuario`),
  ADD KEY `FKjdh08ydi287pcv6bqfdrawju` (`anuncio`);

--
-- Indexes for table `tb_usuarios`
--
ALTER TABLE `tb_usuarios`
  ADD PRIMARY KEY (`codUsuario`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tb_anuncios`
--
ALTER TABLE `tb_anuncios`
  MODIFY `codAnuncio` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `tb_favoritos`
--
ALTER TABLE `tb_favoritos`
  MODIFY `codFavorito` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `tb_fotos`
--
ALTER TABLE `tb_fotos`
  MODIFY `codFoto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
--
-- AUTO_INCREMENT for table `tb_horariosvisitas`
--
ALTER TABLE `tb_horariosvisitas`
  MODIFY `codHorarioVisita` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `tb_locacao`
--
ALTER TABLE `tb_locacao`
  MODIFY `codLocacao` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `tb_questoes`
--
ALTER TABLE `tb_questoes`
  MODIFY `codQuestao` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `tb_usuarios`
--
ALTER TABLE `tb_usuarios`
  MODIFY `codUsuario` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `tb_anuncios`
--
ALTER TABLE `tb_anuncios`
  ADD CONSTRAINT `FKe4t0sc33201hls53ppxx2oohi` FOREIGN KEY (`usuario`) REFERENCES `tb_usuarios` (`codUsuario`);

--
-- Constraints for table `tb_favoritos`
--
ALTER TABLE `tb_favoritos`
  ADD CONSTRAINT `FKba8kysnugig4k29hml0x77cxw` FOREIGN KEY (`anuncio`) REFERENCES `tb_anuncios` (`codAnuncio`),
  ADD CONSTRAINT `FKo13ebocjl4fjk0m7yciln96y8` FOREIGN KEY (`usuario`) REFERENCES `tb_usuarios` (`codUsuario`);

--
-- Constraints for table `tb_fotos`
--
ALTER TABLE `tb_fotos`
  ADD CONSTRAINT `FKp2e31vc11swjr958axonfdx8o` FOREIGN KEY (`anuncio`) REFERENCES `tb_anuncios` (`codAnuncio`);

--
-- Constraints for table `tb_horariosvisitas`
--
ALTER TABLE `tb_horariosvisitas`
  ADD CONSTRAINT `FK4hmgf2ndesgbf1hrvq5qx2alw` FOREIGN KEY (`anuncio`) REFERENCES `tb_anuncios` (`codAnuncio`);

--
-- Constraints for table `tb_locacao`
--
ALTER TABLE `tb_locacao`
  ADD CONSTRAINT `FK6q1g5xnj52d5ktredxnfgjdg2` FOREIGN KEY (`locatario`) REFERENCES `tb_usuarios` (`codUsuario`),
  ADD CONSTRAINT `FK914ssq6rmapxnh3fwl4ina43m` FOREIGN KEY (`locador`) REFERENCES `tb_usuarios` (`codUsuario`);

--
-- Constraints for table `tb_questoes`
--
ALTER TABLE `tb_questoes`
  ADD CONSTRAINT `FKjdh08ydi287pcv6bqfdrawju` FOREIGN KEY (`anuncio`) REFERENCES `tb_usuarios` (`codUsuario`),
  ADD CONSTRAINT `FKpcbiefxd82kdw1by6qh8h7y34` FOREIGN KEY (`usuario`) REFERENCES `tb_usuarios` (`codUsuario`),
  ADD CONSTRAINT `FKpdql4yu7v9791vonfyvi95p2p` FOREIGN KEY (`anuncio`) REFERENCES `tb_anuncios` (`codAnuncio`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
