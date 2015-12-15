package aplicacao;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import dominio.Anuncio;
import dominio.Anuncio.EstadoAnuncio;
import dominio.Favorito;
import dominio.Foto;
import dominio.HorarioVisita;
import dominio.Locacao;
import dominio.Questao;
import dominio.Usuario;
import servico.AnuncioServico;
import servico.FavoritoServico;
import servico.FotoServico;
import servico.HorarioVisitaServico;
import servico.LocacaoServico;
import servico.QuestaoServico;
import servico.ServicoFactory;
import servico.UsuarioServico;

public class Principal {

	public static void main(String[] args)  throws ParseException {
		
		System.out.println("Alo");
		// instancia minima que esta no desenho feito pelo Leandro Mendes.
		
		UsuarioServico us = ServicoFactory.criarUsuarioServico();
		
		Usuario usr1 = new Usuario(null, "Leandro Locador","111.111.111-11", "349999-9999", "email@email.com",  "123456");
        us.inserirAtualizar(usr1);
        
        Usuario usr2 = new Usuario(null, "Leandro Locatário","222.222.222-22", "349999-99990", "email2@email.com",  "654321");
        us.inserirAtualizar(usr2);
        		
        SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
        
        String strdata1 = "01/01/2015";
        String strdata2 = "15/01/2015";
        String strdatavisita = "31/12/2015";
        String strd1 = "01/01/2015";
    
        Date data1 = f.parse(strdata1);
        Date data2 =  f.parse(strdata2);
        Date datavisita = f.parse(strdatavisita);
        Date d1 = f.parse(strd1);
        
        AnuncioServico as = ServicoFactory.criarAnuncioServico();
        String desc= "Casa em condominio"; 
        Anuncio an1 =  new Anuncio(null, "Centro", "Uberlandia", desc, new BigDecimal("800.00"), data1,  data2,EstadoAnuncio.Ativo , usr1);
        as.inserirAtualizar(an1);
        
        HorarioVisitaServico HVs = ServicoFactory.criarHorarioVisitaServico();
        HorarioVisita hhv1 = new HorarioVisita(null, an1, "Quem chegar primeiro ligue para a contra-parte", datavisita);
        HVs.inserirAtualizar(hhv1);
        
		
        FotoServico fs = ServicoFactory.criarFotoServico();
        
        Foto f1 = new Foto(null, "/Foto1.jpg", an1);
        Foto f2 = new Foto(null, "/Foto2.jpg", an1);
        Foto f3 = new Foto(null, "/Foto3.jpg", an1);
        Foto f4 = new Foto(null, "/Foto4.jpg", an1);
        Foto f5 = new Foto(null, "/Foto5.jpg", an1);
        Foto f6 = new Foto(null, "/Foto6.jpg", an1);
        
        fs.inserirAtualizar(f1);
        fs.inserirAtualizar(f2);
        fs.inserirAtualizar(f3);
        fs.inserirAtualizar(f4);
        fs.inserirAtualizar(f5);
        fs.inserirAtualizar(f6);
     	
        
        FavoritoServico FavS = ServicoFactory.criarFavoritoServico();
        Favorito fav1 = new Favorito(null, an1, usr2);
        FavS.inserirAtualizar(fav1);
        
        QuestaoServico qs = ServicoFactory.criarQuestaoServico();
        Questao q1 = new Questao(null, "A casa possui quantas vagas de garagem?", "", an1, usr2);
        qs.inserirAtualizar(q1);
		q1.setResposta("Possui 2 vagas");
		qs.inserirAtualizar(q1);
		
		LocacaoServico ls = ServicoFactory.criarLocacaoServico();
        Locacao l1 = new Locacao(null,d1, 1, 1, usr1, usr2);
        ls.inserirAtualizar(l1);
        
        System.out.println("Bye");
		System.exit(0);
		// fim instancia minima que esta no desenho feito pelo Leandro Mendes.
		
		
		
		UsuarioServico us1 = ServicoFactory.criarUsuarioServico();
		
		Usuario Usr1 = new Usuario(null, "Itamar","000", "34-123", "itamar@ispbrasil.com.br",  "x");
        us1.inserirAtualizar(Usr1);
        
        Usuario Usr2 = new Usuario(null, "Francisco","000", "34-123", "franciscolopesdacunha@gmail.com",  "x");
        us1.inserirAtualizar(Usr2);
        
        AnuncioServico as1 = ServicoFactory.criarAnuncioServico();
        String desc1= "Alugo apartamento térreo, com área externa, 2 quartos, 1 vaga na garagem, não possui armários nem guarda roupas embutido, porteiro 24 horas, ônibus para na porta do condomínio"; 
        
        Anuncio ans1 =  new Anuncio(null, "Santa Monica", "Uberlandia", desc, new BigDecimal("650.00"), new Date(), new Date(),EstadoAnuncio.Pendente , usr1);
        as1.inserirAtualizar(ans1);
        
        desc= "Alugo ap MRV 2/4 armários planejados na cozinha e no banheiro, mais box blindex no banheiro."; 
        
        Anuncio an2 =  new Anuncio(null, "Shopping Park", "Uberlandia", desc, new BigDecimal("450.00"), new Date(), new Date(),EstadoAnuncio.Pendente , usr2);
        as.inserirAtualizar(an2);
        
        desc= "2/4 sala 2 ambientes cozinha área de serviço privativa banheiro com box, armário espelho e ducha dupla."; 
        
        Anuncio an3 =  new Anuncio(null, "Jardim Holanda", "Uberlandia", desc, new BigDecimal("550.00"), new Date(), new Date(),EstadoAnuncio.Pendente , usr1);
        as.inserirAtualizar(an3);
        
        
   
        FotoServico fs1 = ServicoFactory.criarFotoServico();
        
        Foto foto1 = new Foto(null, "/Foto.jpg", ans1);
        fs.inserirAtualizar(foto1);
     
        LocacaoServico ls1 = ServicoFactory.criarLocacaoServico();
        Locacao loc1 = new Locacao(null, new Date(), 1, 1, Usr1, Usr2);
        ls1.inserirAtualizar(loc1);
        
        QuestaoServico qs1 = ServicoFactory.criarQuestaoServico();
        Questao quest1 = new Questao(null, "Ainda esta disponivel ?", "", ans1, Usr2);
        qs1.inserirAtualizar(quest1);
        
        FavoritoServico FavS1 = ServicoFactory.criarFavoritoServico();
        Favorito favo1 = new Favorito(null, ans1, Usr1);
        FavS1.inserirAtualizar(favo1);
        
        HorarioVisitaServico HVs1 = ServicoFactory.criarHorarioVisitaServico();
        HorarioVisita hhvi1 = new HorarioVisita(null, an1, "Disponivel as 12h", new Date());
        HVs1.inserirAtualizar(hhvi1);
        
        
        
		System.out.println("Bye");
		System.exit(0);
	}

}
