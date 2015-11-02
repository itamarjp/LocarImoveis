package aplicacao;

import javax.persistence.*;

import dominio.Anuncio;
import dominio.EstadoAnuncio;
import dominio.HorarioVisita;
import dominio.Usuario;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class InstanciacaoHorarioVisita {

	public static void main(String args[]) throws ParseException {

		/*
		-- TABELA Usuario
		CREATE TABLE IF NOT EXISTS `locarImoveis`.`Usuario`(
		  `codUsuario` INT ZEROFILL NOT NULL  AUTO_INCREMENT ,
		  `cpf` VARCHAR(11) NOT NULL ,
		  `nome` VARCHAR(80) NOT NULL ,
		  `celular` VARCHAR(15) NOT NULL ,
		  `eMail` VARCHAR(255) NOT NULL ,
		  `senha` VARCHAR(50) NOT NULL ,
		  PRIMARY KEY (`codUsuario`) ,
		  UNIQUE INDEX `unique_cpf` (`cpf`))
		ENGINE = InnoDB
		DEFAULT CHARACTER SET = utf8;
		
		INSERT INTO Usuario(cpf, nome, celular, email, senha) VALUES
		('22222222222', 'Lorem Ipsum', '88888888', 'loremipsum@gmail.com', '654321'),
		('33333333333', 'Dollor Emum', '77777777', 'dolloremun@gmail.com', '878765');		 
		*/
		
		Usuario usu1 = new Usuario(null, "22222222222", "Lorem Ipsum", "88888888", "loremipsum@gmail.com", "654321");
		Usuario usu2 = new Usuario(null, "33333333333", "Dollor Emum", "77777777", "dolloremun@gmail.com", "878765");
		
		SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy"); 
		
		Anuncio anu1 = new Anuncio(null, "Pampulha", "Uberlandia", "Excelente apartamento no Pampulha, Zona Sul da cidade de Uberlândia. São 3 dormitórios com 1 suíte, sala de estar e jantar, escritório, varanda gourmet com churrasqueira, lavabo e banheiro social", new BigDecimal(600.0), formatador.parse("01/11/2015"),formatador.parse("16/01/2015") , EstadoAnuncio.ATIVO, usu1);
		usu1.addAnuncio(anu1);
		Anuncio anu2 = new Anuncio(null, "Lagoinha", "Uberlândia", "Excelente casa no Lagoinha, Zona Sul da cidade de Uberlândia. São 2 dormitórios com 1 suíte, sala de estar e jantar, varanda com churrasqueira, lavabo e banheiro social", new BigDecimal(700.0), formatador.parse("01/11/2015"), formatador.parse("16/01/2015"), EstadoAnuncio.ATIVO, usu1);
		usu1.addAnuncio(anu2);
		Anuncio anu3 = new Anuncio(null, "Planalto", "Uberlândia", "Excelente casa no Planalto, Zona Oeste da cidade de Uberlândia. São 4 dormitórios com 2 suíte, sala de estar e jantar, varanda com churrasqueira, 2 lavabo e banheiro social", new BigDecimal(550.0), formatador.parse("01/11/2015"), formatador.parse("16/01/2015"), EstadoAnuncio.ATIVO, usu2);
		usu2.addAnuncio(anu3);
		System.out.println("Anuncio 1: " + anu1);
/*
-- TABELA EstadoAnuncio
CREATE TABLE IF NOT EXISTS `locarImoveis`.`EstadoAnuncio` (
`codEstadoAnuncio` INT ZEROFILL NOT NULL AUTO_INCREMENT ,
`anuncio` INT ZEROFILL NOT NULL ,
`estado` enum('Ativo','Finalizado','Suspenso','') NOT NULL ,
PRIMARY KEY (`codEstadoAnuncio`) ,
FOREIGN KEY(`anuncio`) REFERENCES `Anuncio` (`codAnuncio`)
ON DELETE CASCADE ON UPDATE CASCADE
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

INSERT INTO EstadoAnuncio(anuncio, estado) VALUES
(1, 'Ativo'),
(2, 'Ativo'),
(3, 'Ativo');
		
*/


		
		
/*
-- TABELA Favoritos
CREATE TABLE IF NOT EXISTS `locarImoveis`.`Favoritos` (
`codFavoritos` INT ZEROFILL NOT NULL AUTO_INCREMENT,
`usuario` INT ZEROFILL NOT NULL,
`anuncio` INT ZEROFILL NOT NULL,
PRIMARY KEY (`codFavoritos`) ,
FOREIGN KEY(`usuario`) REFERENCES `Usuario` (`codUsuario`) ,
FOREIGN KEY(`anuncio`) REFERENCES `Anuncio` (`codAnuncio`)
ON DELETE CASCADE ON UPDATE CASCADE
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

INSERT INTO Favoritos(usuario, anuncio) VALUES
(1, 1),
(1, 3),
(2, 1),
(2, 2);

*/
		
/*
-- TABELA Fotos
CREATE TABLE IF NOT EXISTS `locarImoveis`.`Fotos` (
`codFotos` INT ZEROFILL NOT NULL AUTO_INCREMENT ,
`anuncio` INT ZEROFILL NOT NULL ,
`caminho` VARCHAR(500) NOT NULL ,
PRIMARY KEY (`codFotos`) ,
FOREIGN KEY(`anuncio`) REFERENCES `Anuncio` (`codAnuncio`)
ON DELETE CASCADE ON UPDATE CASCADE
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

INSERT INTO Fotos(anuncio, caminho) VALUES
(1, '/resources/imagens/1.jpg'),
(1, '/resources/imagens/2.jpg'),
(1, '/resources/imagens/3.jpg'),
(2, '/resources/imagens/4.png'),
(2, '/resources/imagens/5.png'),
(3, '/resources/imagens/6.png'),
(3, '/resources/imagens/7.png');

*/
		
/*
-- TABELA Locacao
CREATE TABLE IF NOT EXISTS `locarImoveis`.`Locacao` (
`codLocacao` INT ZEROFILL NOT NULL AUTO_INCREMENT ,
`anuncio` INT ZEROFILL NOT NULL,
`dataInicio` DATE NOT NULL,
`avaliacaoLocador` INT NOT NULL,
`avaliacaoLocatario` INT NOT NULL,
PRIMARY KEY (`codLocacao`),
FOREIGN KEY(`anuncio`) REFERENCES `Anuncio` (`codAnuncio`)
ON DELETE CASCADE ON UPDATE CASCADE
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

INSERT INTO Locacao(anuncio, dataInicio, avaliacaoLocador, avaliacaoLocatario) VALUES
('1', '2015-11-01', 8, 9),
('2', '2015-11-02', 8, 7),
('3', '2015-11-03', 9, 8);

*/

/*
-- TABELA Questao
CREATE TABLE  IF NOT EXISTS `locarImoveis`.`Questao` (
`codQuestao` INT ZEROFILL NOT NULL AUTO_INCREMENT ,
`usuario` INT ZEROFILL NOT NULL ,
`anuncio` INT ZEROFILL NOT NULL ,
`pergunta` VARCHAR(255) NOT NULL ,
`resposta` VARCHAR(255) ,
PRIMARY KEY(`codQuestao`) ,
FOREIGN KEY(`usuario`) REFERENCES `Usuario` (`codUsuario`) ,
FOREIGN KEY(`anuncio`) REFERENCES `Anuncio` (`codAnuncio`)
ON DELETE CASCADE ON UPDATE CASCADE
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

INSERT INTO Questao(usuario, anuncio, pergunta, resposta) VALUES
('2', '1', 'A casa possui cerca elétrica?', 'Sim'),
('2', '1', 'A rua é asfaltada?', 'Sim'),
('2', '1', 'Taxas estão inclusas?', 'Não'),
('2', '2', 'A casa possui cerca elétrica?', 'Sim');
		
*/

/*
-- TABELA HorarioVisita
CREATE TABLE IF NOT EXISTS `locarImoveis`.`HorarioVisita` (
`codHorarioVisita` INT ZEROFILL NOT NULL AUTO_INCREMENT ,
`anuncio` INT ZEROFILL NOT NULL ,
`horario` DATETIME NOT NULL,
`observacao` VARCHAR(255) ,
PRIMARY KEY (`codHorarioVisita`) ,
FOREIGN KEY(`anuncio`) REFERENCES `Anuncio` (`codAnuncio`)
ON DELETE RESTRICT ON UPDATE CASCADE
)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8;

INSERT INTO HorarioVisita(anuncio, horario, observacao) VALUES
('1', '2015-10-13 09:00', 'Chave não abriu a casa. Vai retornar outro dia'),
('1', '2015-10-13 10:00', 'Cliente não gostou do local'),
('1', '2015-10-13 11:00', 'Vai retornar com a esposa'),
('1', '2015-10-13 13:00', 'Ficou de dar resposta posteriormente'),
('2', '2015-10-09 15:00', 'Não gostou da pintura'),
('2', '2015-10-09 16:00', 'Muita Infriltração'),
('3', '2015-10-12 15:00', 'Vai alugar'),
('3', '2015-10-12 16:00', 'Não gostou do banheiro muito pequeno');
*/

		SimpleDateFormat fh = new SimpleDateFormat("dd/MM/yyyy HH:mm"); 
		HorarioVisita hv1 = new HorarioVisita(null, anu1, fh.parse("13/10/2015 09:00"), "Chave não abriu a casa. Vai retornar outro dia");
		HorarioVisita hv2 = new HorarioVisita(null, anu1, fh.parse("13/10/2015 10:00"), "Cliente não gostou do local");
		HorarioVisita hv3 = new HorarioVisita(null, anu1, fh.parse("13/10/2015 11:00"), "Vai retornar com a esposa");
		HorarioVisita hv4 = new HorarioVisita(null, anu1, fh.parse("13/10/2015 13:00"), "Ficou de dar resposta posteriormente");
		HorarioVisita hv5 = new HorarioVisita(null, anu2, fh.parse("09/10/2015 15:00"), "Não gostou da pintura");
		HorarioVisita hv6 = new HorarioVisita(null, anu2, fh.parse("09/10/2015 16:00"), "Muita Infriltração");
		HorarioVisita hv7 = new HorarioVisita(null, anu3, fh.parse("12/10/2015 15:00"), "Vai alugar");
		HorarioVisita hv8 = new HorarioVisita(null, anu3, fh.parse("12/10/2015 16:00"), "Não gostou do banheiro muito pequeno");
		


		EntityManagerFactory emf = Persistence.createEntityManagerFactory("meujpa");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		em.persist(usu1);
		em.persist(usu2);
		em.persist(anu1);
		em.persist(anu2);
		em.persist(anu3);
		
		em.persist(hv1);
		em.persist(hv2);
		em.persist(hv3);
		em.persist(hv4);
		em.persist(hv5);
		em.persist(hv6);
		em.persist(hv7);
		em.persist(hv8);
		
		em.getTransaction().commit();

		System.out.println("Pronto!");
		
		em.close();
		emf.close();
	}
}