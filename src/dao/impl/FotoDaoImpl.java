package dao.impl;

import java.util.List;

import dao.impl.EM;
import dao.FotoDao;
import dominio.Foto;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class FotoDaoImpl implements FotoDao{

	private EntityManager em;
	
	public FotoDaoImpl() {
		this.em = EM.getLocalEm();
	}
	
	@Override
	public void inserirAtualizar(Foto x) {
		if (x.getCodFoto() != null) {
			x = em.merge(x);
		}
		em.persist(x);
	}
	
	@Override
	public void excluir(Foto x) {
		x = em.merge(x);
		em.remove(x);
	}
	
	@Override
	public Foto buscar(int CodFoto) {
		return em.find(Foto.class, CodFoto);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Foto> buscarTodos() {
		String jpql = "SELECT x FROM Foto x";
		Query query = em.createQuery(jpql);
		return query.getResultList();
	}
	
	
	
	
	
	}


















