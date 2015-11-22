package servico.impl;

import java.util.List;

import dao.DaoFactory;
import dao.impl.EM;

import dao.FotoDao;

import dominio.Foto;
import servico.FotoServico;

public class FotoServicoImpl implements FotoServico {
	
	private FotoDao dao;
	
	public FotoServicoImpl() {
		dao = DaoFactory.criarFotoDao();
	}
	
	@Override
	public void inserirAtualizar(Foto x) {
		EM.getLocalEm().getTransaction().begin();
		dao.inserirAtualizar(x);
		EM.getLocalEm().getTransaction().commit();
	}
	
	@Override
	public void excluir(Foto x) {
		EM.getLocalEm().getTransaction().begin();
		dao.excluir(x);
		EM.getLocalEm().getTransaction().commit();
	}
	
	@Override
	public Foto buscar(int codFoto) {
		return dao.buscar(codFoto);
	}
	
	@Override
	public List<Foto> buscarTodos() {
		return dao.buscarTodos();
	}
	
}