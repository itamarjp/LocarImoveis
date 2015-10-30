package dominio;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Locacao")
public class Locacao implements Serializable {
	private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer CodLocacao;
    private Date DataLocacao;
    private Integer avaliacaoLocador;
    private Integer avaliacaoLocatario;
    private Usuario locatario;
    private Usuario locador;

    public Locacao(Date DataLocacao, Integer avaliacaoLocador, Integer avaliacaoLocatario) {
        this.DataLocacao = DataLocacao;
        this.avaliacaoLocador = avaliacaoLocador;
        this.avaliacaoLocatario = avaliacaoLocatario;
    }


public Locacao(Integer codLocacao, Date dataLocacao, Integer avaliacaoLocador, Integer avaliacaoLocatario,
			Usuario locatario, Usuario locador) {
		super();
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
