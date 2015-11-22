package dominio;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tb_anuncios")
public class Anuncio implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codAnuncio;
	
	private String bairro;
	private String cidade;
	private String descricao;
	private BigDecimal vlrLocacao;
	private Date dataIni;
	private Date dataFim;

	public enum EstadoAnuncio {
	    Ativo,
	    Pendente,
	    Desativado,
	};	
	private EstadoAnuncio Status = EstadoAnuncio.Pendente;
	
	@ManyToOne
	@JoinColumn(name="usuario")
	private Usuario usuario;
	
	@OneToMany(mappedBy="anuncio")
	private List<Favorito> favoritos;
	
	@OneToMany(mappedBy="anuncio")
	private List<Questao> questoes;
	
	@OneToMany(mappedBy="anuncio")
	private List<HorarioVisita> horariosvisitas;
	
	@OneToMany(mappedBy="anuncio")
	private List<Foto> fotos;
	
	public Anuncio() {
		this.favoritos = new ArrayList<>();
		this.questoes = new ArrayList<>();
		this.horariosvisitas = new ArrayList<>();
		this.fotos = new ArrayList<>();
	}

	public Anuncio(Integer codAnuncio, String bairro, String cidade, String descricao, BigDecimal vlrLocacao,
			Date dataIni, Date dataFim,EstadoAnuncio Estado,  Usuario usuario) {
		this.codAnuncio = codAnuncio;
		this.bairro = bairro;
		this.cidade = cidade;
		this.descricao = descricao;
		this.vlrLocacao = vlrLocacao;
		this.dataIni = dataIni;
		this.dataFim = dataFim;
		this.usuario = usuario;
		this.Status=Estado;
		this.favoritos = new ArrayList<>();
		this.questoes = new ArrayList<>();
		this.horariosvisitas = new ArrayList<>();
		this.fotos = new ArrayList<>();
	}

	public Integer getCodAnuncio() {
		return codAnuncio;
	}	
	
	public EstadoAnuncio getStatus() {
		return Status;
	}

	public void setStatus(EstadoAnuncio status) {
		Status = status;
	}

	public void setCodAnuncio(Integer codAnuncio) {
		this.codAnuncio = codAnuncio;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getVlrLocacao() {
		return vlrLocacao;
	}

	public void setVlrLocacao(BigDecimal vlrLocacao) {
		this.vlrLocacao = vlrLocacao;
	}

	public Date getDataIni() {
		return dataIni;
	}

	public void setDataIni(Date dataIni) {
		this.dataIni = dataIni;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Favorito> getFavoritos() {
		return favoritos;
	}

	public void setFavoritos(List<Favorito> favoritos) {
		this.favoritos = favoritos;
	}

	public List<Questao> getQuestoes() {
		return questoes;
	}

	public void setQuestoes(List<Questao> questoes) {
		this.questoes = questoes;
	}

	public List<HorarioVisita> getHorariosvisitas() {
		return horariosvisitas;
	}

	public void setHorariosvisitas(List<HorarioVisita> horariosvisitas) {
		this.horariosvisitas = horariosvisitas;
	}

	public List<Foto> getFotos() {
		return fotos;
	}

	public void setFotos(List<Foto> fotos) {
		this.fotos = fotos;
	}
	
	public void addFavorito(Favorito x){
		this.favoritos.add(x);
	}
	
	public void removeFavorito(Favorito x){
		this.favoritos.remove(x);
	}
	
	public void addQuestao(Questao x){
		this.questoes.add(x);
	}
	
	public void removeQuestao(Questao x){
		this.questoes.remove(x);
	}
	
	public void addHorarioVisita(HorarioVisita x){
		this.horariosvisitas.add(x);
	}
	
	public void removeHorarioVisita(HorarioVisita x){
		this.horariosvisitas.remove(x);
	}
	
	public void addFoto(Foto x){
		this.fotos.add(x);
	}
	
	public void removeFoto(Foto x){
		this.fotos.remove(x);
	}

	
	@Override
	public String toString() {
		return "Anuncio [codAnuncio=" + codAnuncio + ", bairro=" + bairro + ", cidade=" + cidade + ", descricao="
				+ descricao + ", vlrLocacao=" + vlrLocacao + ", dataIni=" + dataIni + ", dataFim=" + dataFim
				+ ", Status=" + Status + ", usuario=" + usuario + ", favoritos=" + favoritos + ", questoes=" + questoes
				+ ", horariosvisitas=" + horariosvisitas + ", fotos=" + fotos + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codAnuncio == null) ? 0 : codAnuncio.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Anuncio other = (Anuncio) obj;
		if (codAnuncio == null) {
			if (other.codAnuncio != null)
				return false;
		} else if (!codAnuncio.equals(other.codAnuncio))
			return false;
		return true;
	}	
}
