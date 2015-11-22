package dao;


import java.util.List;

import dominio.Locacao;

public interface LocacaoDao {

	public void inserirAtualizar(Locacao x);
	public void excluir(Locacao x);
	public Locacao buscar(int x);
	public List<Locacao> buscarTodos();

}
