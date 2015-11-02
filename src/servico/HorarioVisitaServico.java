package servico;

import java.time.*;
import java.util.List;

import dominio.HorarioVisita;;

public interface HorarioVisitaServico {

	public void inserirHorarioVisita(HorarioVisita x) throws ServicoException;
	public void excluir(HorarioVisita x);
	public HorarioVisita buscar(int id);
	public List<HorarioVisita> buscarTodos();
	
	public static List<HorarioVisita> buscarPorDataHorario(LocalDateTime horario) {
		// TODO Auto-generated method stub
		return null;
	}
	void inserirAtualizar(HorarioVisita x);
}
