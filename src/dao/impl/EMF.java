package dao.impl;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EMF {
	private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysql-remoto");
	
	public static EntityManagerFactory get() {
		return emf;
	}
}