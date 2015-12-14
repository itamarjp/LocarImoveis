package servico.impl;

import java.util.List;

/*
 * @author Eduardo V. Rocha
 */

import dao.AnuncioDao;
import dao.DaoFactory;
import dao.impl.EM;
import dominio.Anuncio;
import dominio.Favorito;
import dominio.Foto;
import servico.AnuncioServico;

public class AnuncioServicoImpl implements AnuncioServico {
	
	private AnuncioDao dao;
	public AnuncioServicoImpl() {
		dao = DaoFactory.criarAnuncioDao();
	}

	
	@Override
	public void excluir(Anuncio x) {
		EM.getLocalEm().getTransaction().begin();
		dao.excluir(x);
		EM.getLocalEm().getTransaction().commit();
	}
	
	@Override
	public void inserirAtualizar(Anuncio x) {
		EM.getLocalEm().getTransaction().begin();
		dao.inserirAtualizar(x);
		EM.getLocalEm().getTransaction().commit();
	}
	
	@Override
	public Anuncio buscar(int codAnuncio) {
		return dao.buscar(codAnuncio);
	}
	
	@Override
	public List<Anuncio> buscarTodos() {
		return dao.buscarTodos();
	}
	
	
}
