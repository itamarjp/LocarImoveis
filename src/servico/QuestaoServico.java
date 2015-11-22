package servico;

import java.util.List;

import dominio.Questao;

public interface QuestaoServico {

	public void inserirAtualizar(Questao x);
	public void excluir(Questao x);
	public Questao buscar(int cod);
	public List<Questao> buscarTodos();
	
}