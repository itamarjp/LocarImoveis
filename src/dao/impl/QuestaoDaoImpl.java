package dao.impl;

import java.util.List;

import dao.impl.EM;
import dao.QuestaoDao;
import dominio.Questao;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class QuestaoDaoImpl implements QuestaoDao{

	private EntityManager em;
	
	public QuestaoDaoImpl() {
		this.em = EM.getLocalEm();
	}
	
	@Override
	public void inserirAtualizar(Questao x) {
		if (x.getCodQuestao() != null) {
			x = em.merge(x);
		}
		em.persist(x);
	}
	
	@Override
	public void excluir(Questao x) {
		x = em.merge(x);
		em.remove(x);
	}
	
	@Override
	public Questao buscar(int CodQuestao) {
		return em.find(Questao.class, CodQuestao);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Questao> buscarTodos() {
		String jpql = "SELECT x FROM Questao x";
		Query query = em.createQuery(jpql);
		return query.getResultList();
	}
	
	
	
	
	
	}


















