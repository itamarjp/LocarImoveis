package servico;

import servico.impl.*;

public class ServicoFactory {
	public static AnuncioServico criarAnuncioServico() {
		return new AnuncioServicoImpl();
	}
	
	public static UsuarioServico criarUsuarioServico() {
		return new UsuarioServicoImpl();
	}
	
	public static FotoServico criarFotoServico() {
		return new FotoServicoImpl();
	}
	
	
}



