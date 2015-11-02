package dao;

import java.util.List;
import dominio.HorarioVisita;

public interface HorarioVisitaDao {
	public void inserirAtualizar(HorarioVisita x);
	public void excluir(HorarioVisita x);
	public HorarioVisita buscar(int id);
	public List<HorarioVisita> buscarTodos();
}
