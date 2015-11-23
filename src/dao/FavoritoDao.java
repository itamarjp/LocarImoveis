package dao;


import java.util.List;

import dominio.Favorito;

public interface FavoritoDao {

	public void inserirAtualizar(Favorito x);
	public void excluir(Favorito x);
	public Favorito buscar(int x);
	public List<Favorito> buscarTodos();

}
