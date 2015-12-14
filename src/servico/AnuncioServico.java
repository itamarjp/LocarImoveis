package servico;

import java.util.List;	

import dominio.Anuncio;

public interface AnuncioServico {

	void inserirAtualizar(Anuncio x);
	public void excluir(Anuncio x);
	public Anuncio buscar(int id);
	public List<Anuncio> buscarTodos();
		

}
