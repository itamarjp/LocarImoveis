package dao;

import java.util.List;
import dominio.Anuncio;

public interface AnuncioDao {
	public void inserirAtualizar(Anuncio x);
	public void excluir(Anuncio x);
	public void Anuncio buscar(int id);
	public List<Anuncio> buscarTodos();
}