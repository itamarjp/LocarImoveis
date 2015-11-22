package servico;

import java.util.List;	

import dominio.Anuncio;

public interface AnuncioServico {

	public void inserirAnuncio(Anuncio x);
	public void excluir(Anuncio x);
	public Anuncio buscar(int id);
	public List<Anuncio> buscarTodos();
		
	void inserirAtualizar(Anuncio x);
}
