package aplicacao;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Anuncio;
import dominio.Foto;
import dominio.Locacao;
import dominio.Usuario;
import servico.AnuncioServico;
import servico.ServicoFactory;
import servico.UsuarioServico;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("Alo");
		UsuarioServico us = ServicoFactory.criarUsuarioServico();
		AnuncioServico as = ServicoFactory.criarAnuncioServico();
		
        Usuario usr1 = new Usuario(null, "Itamar","000", "34-123", "itamar@ispbrasil.com.br",  "x");
        us.inserirAtualizar(usr1);
        
        Usuario usr2 = new Usuario(null, "xiquinho","000", "34-123", "xiquinho@iftm.edu.br",  "x");
        us.inserirAtualizar(usr2);
        
        
        
        
        Anuncio an1 =  new Anuncio(null, "bairro", "cidade", "descricao", new BigDecimal(1), new Date(), new Date(), usr1);
        as.inserirAtualizar(an1);
        
   
        /*
        Foto f1 = new Foto(null, "/Foto.img", an1);
        em.persist(f1);
        Locacao l1 = new Locacao(null, new Date(), 1, 1, usr1, usr2);
        em.persist(l1);        
       */
		System.out.println("Bye");

	}

}
