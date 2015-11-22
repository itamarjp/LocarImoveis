package dao;


import java.util.List;

import dominio.Questao;

public interface QuestaoDao {

	public void inserirAtualizar(Questao x);
	public void excluir(Questao x);
	public Questao buscar(int x);
	public List<Questao> buscarTodos();

}
