package dominio;

/**
 * @author Renzo Rodrigues
 */
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_questoes")
public class Questao implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codQuestao;
	
	private String pergunta;
	private String resposta;
	
	@ManyToOne
	@JoinColumn(name="anuncio")
	private Anuncio anuncio;
	
	@ManyToOne
	@JoinColumn(name="usuario")
	private Usuario usuario;

	public Questao() {
	}

	public Questao(Integer codQuestao, String pergunta, String resposta, Anuncio anuncio, Usuario usuario) {
		this.codQuestao = codQuestao;
		this.pergunta = pergunta;
		this.resposta = resposta;
		this.anuncio = anuncio;
		this.usuario = usuario;
	}

	public Integer getCodQuestao() {
		return codQuestao;
	}

	public void setCodQuestao(Integer codQuestao) {
		this.codQuestao = codQuestao;
	}

	public String getPergunta() {
		return pergunta;
	}

	public void setPergunta(String pergunta) {
		this.pergunta = pergunta;
	}

	public String getResposta() {
		return resposta;
	}

	public void setResposta(String resposta) {
		this.resposta = resposta;
	}

	public Anuncio getAnuncio() {
		return anuncio;
	}

	public void setAnuncio(Anuncio anuncio) {
		this.anuncio = anuncio;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	@Override
	public String toString() {
		return "Questao [codQuestao=" + codQuestao + ", pergunta=" + pergunta + ", resposta=" + resposta + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codQuestao == null) ? 0 : codQuestao.hashCode());
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
		Questao other = (Questao) obj;
		if (codQuestao == null) {
			if (other.codQuestao != null)
				return false;
		} else if (!codQuestao.equals(other.codQuestao))
			return false;
		return true;
	}
}
