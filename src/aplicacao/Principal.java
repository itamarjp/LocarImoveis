package aplicacao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Principal {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("meujpa");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();

        //em.persist();
        //em.merge();
        
        em.getTransaction().commit();
		
        em.close();
        emf.close();

	}

}
