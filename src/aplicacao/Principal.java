package aplicacao;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Anuncio;
import dominio.Foto;
import dominio.Usuario;

public class Principal {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("meujpa");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        Usuario usr1 = new Usuario(null, "Itamar","000", "34-123", "itamar@ispbrasil.com.br",  "x");
        Anuncio an1 =  new Anuncio(null, "bairro", "cidade", "descricao", new BigDecimal(1), new Date(), new Date(), usr1);
        Foto f1 = new Foto(null, "/Foto.img", an1);
        
        em.persist(usr1);
        em.persist(an1);
        em.persist(f1);
        em.getTransaction().commit();
		
       // em.close();
       // emf.close();

	}

}
