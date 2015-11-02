package servico.impl;

import dao.HorarioVisitaDao;

import java.time.*;
import java.util.List;

import dao.DaoFactory;
import dao.jpa.EM;
import dominio.HorarioVisita;
import servico.HorarioVisitaServico;
import servico.ServicoException;

public class HorarioVisitaServicoImpl implements HorarioVisitaServico {

	private HorarioVisitaDao dao;
	
	public HorarioVisitaServicoImpl() {
		dao = DaoFactory.criarHorarioVisitaDao();
	}
	
	@Override
	public void inserirAtualizar(HorarioVisita x) {
		EM.getLocalEm().getTransaction().begin();
		dao.inserirAtualizar(x);
		EM.getLocalEm().getTransaction().begin();
	}

	@Override
	public void excluir(HorarioVisita x) {
		EM.getLocalEm().getTransaction().begin();
		dao.excluir(x);
		EM.getLocalEm().getTransaction().commit();
	}

	@Override
	public HorarioVisita buscar(int id) {
		return dao.buscar(id);
	}

	@Override
	public List<HorarioVisita> buscarTodos() {
		return dao.buscarTodos();
	}

	@Override
	public void inserirHorarioVisita(HorarioVisita x) throws ServicoException {
		// TODO Auto-generated method stub
		
	}

	public List<HorarioVisita> buscarPorDataHorario(LocalDateTime horario) {
		// TODO Auto-generated method stub
		return null;
	}

}