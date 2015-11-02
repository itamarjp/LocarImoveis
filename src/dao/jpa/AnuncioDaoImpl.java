package dao.jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import dao.AnuncioDao;
import dominio.Anuncio;

public class AnuncioDaoImpl implements AnuncioDao {

	private EntityManager em;
	
	public AnuncioDaoImpl() {
		this.em = EM.getLocalEm();
	}
	
	@Override
	public void inserirAtualizar(Anuncio x) {
		if (x.getCodAnuncio() != null) {
			x = em.merge(x);
		}
		em.persist(x);
	}

	@Override
	public void excluir(Anuncio x) {
		x = em.merge(x);
		em.remove(x);
	}

	@Override
	public Anuncio buscar(int codAnuncio) {
		return em.find(Anuncio.class, codAnuncio);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Anuncio> buscarTodos() {
		String jpql = "SELECT x FROM Anuncio x";
		Query query = em.createQuery(jpql);
		return query.getResultList();
	}

}
