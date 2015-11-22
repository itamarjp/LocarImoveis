package dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import dao.HorarioVisitaDao;
import dominio.HorarioVisita;

public class HorarioVisitaDaoImpl implements HorarioVisitaDao {

	private EntityManager em;
	
	public HorarioVisitaDaoImpl() {
		this.em = EM.getLocalEm();
	}
	
	@Override
	public void inserirAtualizar(HorarioVisita x) {
		if (x.getCodHorarioVisita() != null) {
			x = em.merge(x);
		}
		em.persist(x);
	}

	@Override
	public void excluir(HorarioVisita x) {
		x = em.merge(x);
		em.remove(x);
	}

	@Override
	public HorarioVisita buscar(int codHorarioVisita) {
		return em.find(HorarioVisita.class, codHorarioVisita);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<HorarioVisita> buscarTodos() {
		String jpql = "SELECT x FROM HorarioVisita x";
		Query query = em.createQuery(jpql);
		return query.getResultList();
	}

}
