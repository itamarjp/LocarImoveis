package servico.impl;

import java.util.List;

/*
 * @author Eduardo V. Rocha
 */

import dao.AnuncioDao;
import dao.DaoFactory;
import dao.jpa.EM;

import dominio.Anuncio;
import servico.AnuncioServico;
import servico.ServicoException;

public class AnuncioServicoImpl implements AnuncioServico {
	
	private AnuncioDao dao;
	public AnuncioServicoImpl() {
		dao = DaoFactory.criarAnuncioDao();
	}

	@Override
	public void inserirAtualizar(Anuncio x) {
		EM.getLocalEm().getTransaction().begin();
		dao.inserirAtualizar(x);
		EM.getLocalEm().getTransaction().begin();
	}
	
	@Override
	public void excluir(Anuncio x) {
		EM.getLocalEm().getTransaction().begin();
		dao.excluir(x);
		EM.getLocalEm().getTransaction().commit();
	}
	
	@Override
	public Anuncio buscar(int id) {
		return dao.buscar(id);
	}

	@Override
	public void inserirAnuncio(Anuncio x) throws ServicoException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Anuncio> buscarTodos() {
		// TODO Auto-generated method stub
		return null;
	}
	
}
