package servico;

import java.util.List;

import dominio.Favorito;

public interface FavoritoServico {

	public void inserirAtualizar(Favorito x);
	public void excluir(Favorito x);
	public Favorito buscar(int cod);
	public List<Favorito> buscarTodos();
	
}