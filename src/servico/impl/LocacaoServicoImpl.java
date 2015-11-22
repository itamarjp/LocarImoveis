package servico.impl;

import java.util.List;

import dao.DaoFactory;
import dao.impl.EM;

import dao.LocacaoDao;

import dominio.Locacao;
import servico.LocacaoServico;

public class LocacaoServicoImpl implements LocacaoServico {
	
	private LocacaoDao dao;
	
	public LocacaoServicoImpl() {
		dao = DaoFactory.criarLocacaoDao();
	}
	
	@Override
	public void inserirAtualizar(Locacao x) {
		EM.getLocalEm().getTransaction().begin();
		dao.inserirAtualizar(x);
		EM.getLocalEm().getTransaction().commit();
	}
	
	@Override
	public void excluir(Locacao x) {
		EM.getLocalEm().getTransaction().begin();
		dao.excluir(x);
		EM.getLocalEm().getTransaction().commit();
	}
	
	@Override
	public Locacao buscar(int codLocacao) {
		return dao.buscar(codLocacao);
	}
	
	@Override
	public List<Locacao> buscarTodos() {
		return dao.buscarTodos();
	}
	
}