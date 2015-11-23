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
	
	public static LocacaoServico criarLocacaoServico() {
		return new LocacaoServicoImpl();
	}
	public static QuestaoServico criarQuestaoServico() {
		return new QuestaoServicoImpl();
	}
	public static FavoritoServico criarFavoritoServico() {
		return new FavoritoServicoImpl();
	}

	public static HorarioVisitaServico criarHorarioVisitaServico() {
		return new HorarioVisitaServicoImpl();
	}

	
}



