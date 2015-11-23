package dao.impl;

import java.util.List;

import dao.impl.EM;
import dao.FavoritoDao;
import dominio.Favorito;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class FavoritoDaoImpl implements FavoritoDao{

	private EntityManager em;
	
	public FavoritoDaoImpl() {
		this.em = EM.getLocalEm();
	}
	
	@Override
	public void inserirAtualizar(Favorito x) {
		if (x.getCodFavorito() != null) {
			x = em.merge(x);
		}
		em.persist(x);
	}
	
	@Override
	public void excluir(Favorito x) {
		x = em.merge(x);
		em.remove(x);
	}
	
	@Override
	public Favorito buscar(int CodFavorito) {
		return em.find(Favorito.class, CodFavorito);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Favorito> buscarTodos() {
		String jpql = "SELECT x FROM Favorito x";
		Query query = em.createQuery(jpql);
		return query.getResultList();
	}
	
	
	
	
	
	}


















