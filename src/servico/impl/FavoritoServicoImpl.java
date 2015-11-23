package servico.impl;

import java.util.List;

import dao.DaoFactory;
import dao.impl.EM;

import dao.FavoritoDao;

import dominio.Favorito;
import servico.FavoritoServico;

public class FavoritoServicoImpl implements FavoritoServico {
	
	private FavoritoDao dao;
	
	public FavoritoServicoImpl() {
		dao = DaoFactory.criarFavoritoDao();
	}
	
	@Override
	public void inserirAtualizar(Favorito x) {
		EM.getLocalEm().getTransaction().begin();
		dao.inserirAtualizar(x);
		EM.getLocalEm().getTransaction().commit();
	}
	
	@Override
	public void excluir(Favorito x) {
		EM.getLocalEm().getTransaction().begin();
		dao.excluir(x);
		EM.getLocalEm().getTransaction().commit();
	}
	
	@Override
	public Favorito buscar(int codFavorito) {
		return dao.buscar(codFavorito);
	}
	
	@Override
	public List<Favorito> buscarTodos() {
		return dao.buscarTodos();
	}
	
}