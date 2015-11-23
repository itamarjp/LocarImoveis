package servico.impl;

import java.util.List;

import dao.DaoFactory;
import dao.impl.EM;

import dao.HorarioVisitaDao;

import dominio.HorarioVisita;
import servico.HorarioVisitaServico;

public class HorarioVisitaServicoImpl implements HorarioVisitaServico {
	
	private HorarioVisitaDao dao;
	
	public HorarioVisitaServicoImpl() {
		dao = DaoFactory.criarHorarioVisitaDao();
	}
	
	@Override
	public void inserirAtualizar(HorarioVisita x) {
		EM.getLocalEm().getTransaction().begin();
		dao.inserirAtualizar(x);
		EM.getLocalEm().getTransaction().commit();
	}
	
	@Override
	public void excluir(HorarioVisita x) {
		EM.getLocalEm().getTransaction().begin();
		dao.excluir(x);
		EM.getLocalEm().getTransaction().commit();
	}
	
	@Override
	public HorarioVisita buscar(int codHorarioVisita) {
		return dao.buscar(codHorarioVisita);
	}
	
	@Override
	public List<HorarioVisita> buscarTodos() {
		return dao.buscarTodos();
	}
	
}