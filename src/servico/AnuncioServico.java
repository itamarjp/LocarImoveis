package servico;

/*
 * @author Eduardo V. Rocha
 */

import java.time.*;
import java.util.List;	

import dominio.Anuncio;

public interface AnuncioServico {

	public void inserirAnuncio(Anuncio x) throws ServicoException;
	public void excluir(Anuncio x);
	public Anuncio buscar(int id);
	public List<Anuncio> buscarTodos();
	
//	public static List<Anuncio> buscarPorDataHorario(LocalDateTime horario) {
//		// TODO Auto-generated method stub
//		return null;
//	}
	
	void inserirAtualizar(Anuncio x);
}
