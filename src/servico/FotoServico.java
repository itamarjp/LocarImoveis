package servico;

import java.util.List;

import dominio.Foto;

public interface FotoServico {

	public void inserirAtualizar(Foto x);
	public void excluir(Foto x);
	public Foto buscar(int cod);
	public List<Foto> buscarTodos();
	
}