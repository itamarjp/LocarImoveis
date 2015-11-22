package dao.impl;

import java.util.List;

import dao.impl.EM;
import dao.LocacaoDao;
import dominio.Locacao;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class LocacaoDaoImpl implements LocacaoDao{

	private EntityManager em;
	
	public LocacaoDaoImpl() {
		this.em = EM.getLocalEm();
	}
	
	@Override
	public void inserirAtualizar(Locacao x) {
		if (x.getCodLocacao() != null) {
			x = em.merge(x);
		}
		em.persist(x);
	}
	
	@Override
	public void excluir(Locacao x) {
		x = em.merge(x);
		em.remove(x);
	}
	
	@Override
	public Locacao buscar(int CodLocacao) {
		return em.find(Locacao.class, CodLocacao);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Locacao> buscarTodos() {
		String jpql = "SELECT x FROM Locacao x";
		Query query = em.createQuery(jpql);
		return query.getResultList();
	}
	
	
	
	
	
	}


















