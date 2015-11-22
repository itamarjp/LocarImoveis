package aplicacao;

import java.math.BigDecimal;
import java.util.Date;

import dominio.Anuncio;
import dominio.Foto;
import dominio.Locacao;
import dominio.Questao;
import dominio.Usuario;
import dominio.Anuncio.EstadoAnuncio;
import servico.AnuncioServico;
import servico.FotoServico;
import servico.LocacaoServico;
import servico.QuestaoServico;
import servico.ServicoFactory;
import servico.UsuarioServico;

public class Principal {

	public static void main(String[] args) {
		
		System.out.println("Alo");
		UsuarioServico us = ServicoFactory.criarUsuarioServico();
		
        Usuario usr1 = new Usuario(null, "Itamar","000", "34-123", "itamar@ispbrasil.com.br",  "x");
        us.inserirAtualizar(usr1);
        
        Usuario usr2 = new Usuario(null, "xiquinho","000", "34-123", "xiquinho@iftm.edu.br",  "x");
        us.inserirAtualizar(usr2);
        
        AnuncioServico as = ServicoFactory.criarAnuncioServico();
        
        Anuncio an1 =  new Anuncio(null, "bairro", "cidade", "descricao", new BigDecimal(1), new Date(), new Date(),EstadoAnuncio.Pendente , usr1);
        as.inserirAtualizar(an1);
        
   
        FotoServico fs = ServicoFactory.criarFotoServico();
        
        Foto f1 = new Foto(null, "/Foto.img", an1);
        fs.inserirAtualizar(f1);
     
        LocacaoServico ls = ServicoFactory.criarLocacaoServico();
        
        Locacao l1 = new Locacao(null, new Date(), 1, 1, usr1, usr2);

        ls.inserirAtualizar(l1);
        
        QuestaoServico qs = ServicoFactory.criarQuestaoServico();
        
        Questao q1 = new Questao(null, "Ainda esta disponivel ?", "", an1, usr2);
        qs.inserirAtualizar(q1);
        

		System.out.println("Bye");

	}

}
