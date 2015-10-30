package dominio;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="tb_locacao")
public class Locacao implements Serializable {
	private static final long serialVersionUID = 1L;
    
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codLocacao;
    
	private Date dataLocacao;
    private Integer locarComoLocador;
    private Integer locarComoLocatario;
	
    @ManyToOne
	@JoinColumn(name="locatario",insertable=true, updatable=true)
    private Usuario locatario;
	
    @ManyToOne
	@JoinColumn(name="locador",insertable=true, updatable=true)
    private Usuario locador;

	public Locacao() {
	}

	public Locacao(Integer codLocacao, Date dataLocacao, Integer locarComoLocador, Integer locarComoLocatario,
			Usuario locatario, Usuario locador) {
		this.codLocacao = codLocacao;
		this.dataLocacao = dataLocacao;
		this.locarComoLocador = locarComoLocador;
		this.locarComoLocatario = locarComoLocatario;
		this.locatario = locatario;
		this.locador = locador;
	}

	public Integer getCodLocacao() {
		return codLocacao;
	}

	public void setCodLocacao(Integer codLocacao) {
		this.codLocacao = codLocacao;
	}

	public Date getDataLocacao() {
		return dataLocacao;
	}

	public void setDataLocacao(Date dataLocacao) {
		this.dataLocacao = dataLocacao;
	}

	public Integer getLocarComoLocador() {
		return locarComoLocador;
	}

	public void setLocarComoLocador(Integer locarComoLocador) {
		this.locarComoLocador = locarComoLocador;
	}

	public Integer getLocarComoLocatario() {
		return locarComoLocatario;
	}

	public void setLocarComoLocatario(Integer locarComoLocatario) {
		this.locarComoLocatario = locarComoLocatario;
	}

	public Usuario getLocatario() {
		return locatario;
	}

	public void setLocatario(Usuario locatario) {
		this.locatario = locatario;
	}

	public Usuario getLocador() {
		return locador;
	}

	public void setLocador(Usuario locador) {
		this.locador = locador;
	}

	@Override
	public String toString() {
		return "Locacao [codLocacao=" + codLocacao + ", dataLocacao=" + dataLocacao + ", locarComoLocador="
				+ locarComoLocador + ", locarComoLocatario=" + locarComoLocatario + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codLocacao == null) ? 0 : codLocacao.hashCode());
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
		Locacao other = (Locacao) obj;
		if (codLocacao == null) {
			if (other.codLocacao != null)
				return false;
		} else if (!codLocacao.equals(other.codLocacao))
			return false;
		return true;
	}
}
