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
    private Integer CodLocacao;
    private Date DataLocacao;
    private Integer avaliacaoLocador;
    private Integer avaliacaoLocatario;
	@ManyToOne
	@JoinColumn(name="locatario",insertable=true, updatable=true)
    private Usuario locatario;
	@ManyToOne
	@JoinColumn(name="locador",insertable=true, updatable=true)
    private Usuario locador;

    

public Locacao() {
	// TODO Auto-generated constructor stub
	//fazer este construtor corretamente
}

public Locacao(Integer codLocacao, Date dataLocacao, Integer avaliacaoLocador, Integer avaliacaoLocatario,
			Usuario locatario, Usuario locador) {
		CodLocacao = codLocacao;
		DataLocacao = dataLocacao;
		this.avaliacaoLocador = avaliacaoLocador;
		this.avaliacaoLocatario = avaliacaoLocatario;
		this.locatario = locatario;
		this.locador = locador;
	}


public Integer getCodLocacao() {
		return CodLocacao;
	}


	public void setCodLocacao(Integer codLocacao) {
		CodLocacao = codLocacao;
	}


	public Date getDataLocacao() {
		return DataLocacao;
	}


	public void setDataLocacao(Date dataLocacao) {
		DataLocacao = dataLocacao;
	}


	public Integer getAvaliacaoLocador() {
		return avaliacaoLocador;
	}


	public void setAvaliacaoLocador(Integer avaliacaoLocador) {
		this.avaliacaoLocador = avaliacaoLocador;
	}


	public Integer getAvaliacaoLocatario() {
		return avaliacaoLocatario;
	}


	public void setAvaliacaoLocatario(Integer avaliacaoLocatario) {
		this.avaliacaoLocatario = avaliacaoLocatario;
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
    return "Locacao{" + "CodLocacao=" + CodLocacao + ", DataLocacao=" + DataLocacao + ", avaliacaoLocador=" + avaliacaoLocador + ", avaliacaoLocatario=" + avaliacaoLocatario + '}';
}
@Override
    public boolean equals(Object obj) {
    	// TODO Auto-generated method stub
    	return super.equals(obj);
    }
    
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}
}
