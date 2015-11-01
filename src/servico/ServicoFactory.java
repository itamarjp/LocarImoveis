package servico;

/*
 * @author Eduardo V. Rocha
 */

import servico.AnuncioServicoImpl;

public class ServicoFactory {
	public static AnuncioServicoImpl criarAnuncio() {
		return new AnuncioServicoImpl();
	}
}