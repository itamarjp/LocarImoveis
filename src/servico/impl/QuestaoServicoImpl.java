package servico.impl;

import java.util.List;

import dao.DaoFactory;
import dao.impl.EM;
import dominio.Questao;
import servico.QuestaoServico;
import dao.QuestaoDao;


public class QuestaoServicoImpl implements QuestaoServico {
	
	private QuestaoDao dao;
	
	public QuestaoServicoImpl() {
		dao = DaoFactory.criarQuestaoDao();
	}
	
	@Override
	public void inserirAtualizar(Questao x) {
		EM.getLocalEm().getTransaction().begin();
		dao.inserirAtualizar(x);
		EM.getLocalEm().getTransaction().commit();
	}
	
	@Override
	public void excluir(Questao x) {
		EM.getLocalEm().getTransaction().begin();
		dao.excluir(x);
		EM.getLocalEm().getTransaction().commit();
	}
	
	@Override
	public Questao buscar(int codQuestao) {
		return dao.buscar(codQuestao);
	}
	
	@Override
	public List<Questao> buscarTodos() {
		return dao.buscarTodos();
	}
	
}