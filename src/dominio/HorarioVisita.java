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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="tb_horariosvisitas")
public class HorarioVisita implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codHorarioVisita;
	
	@ManyToOne
	@JoinColumn(name="anuncio")
	private Anuncio anuncio;
	private String Observacao;
	@Temporal(TemporalType.TIMESTAMP)
	private Date Horario;
	
	public HorarioVisita() {
		super();
	}
	
	
	
	
	public HorarioVisita(Integer codHorarioVisita, Anuncio anuncio, String observacao, Date horario) {
		super();
		this.codHorarioVisita = codHorarioVisita;
		this.anuncio = anuncio;
		Observacao = observacao;
		Horario = horario;
	}




	public Date getHorario() {
		return Horario;
	}


	public void setHorario(Date horario) {
		Horario = horario;
	}


	public Integer getCodHorarioVisita() {
		return codHorarioVisita;
	}
	public void setCodHorarioVisita(Integer codHorarioVisita) {
		this.codHorarioVisita = codHorarioVisita;
	}
	public Anuncio getAnuncio() {
		return anuncio;
	}
	public void setAnuncio(Anuncio anuncio) {
		this.anuncio = anuncio;
	}
	public String getObservacao() {
		return Observacao;
	}
	public void setObservacao(String observacao) {
		Observacao = observacao;
	}

	
	
	@Override
	public String toString() {
		return "HorarioVisita [codHorarioVisita=" + codHorarioVisita + ", anuncio=" + anuncio + ", Observacao="
				+ Observacao + ", Horario=" + Horario + "]";
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((Observacao == null) ? 0 : Observacao.hashCode());
		result = prime * result + ((anuncio == null) ? 0 : anuncio.hashCode());
		result = prime * result + ((codHorarioVisita == null) ? 0 : codHorarioVisita.hashCode());
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
		HorarioVisita other = (HorarioVisita) obj;
		if (Observacao == null) {
			if (other.Observacao != null)
				return false;
		} else if (!Observacao.equals(other.Observacao))
			return false;
		if (anuncio == null) {
			if (other.anuncio != null)
				return false;
		} else if (!anuncio.equals(other.anuncio))
			return false;
		if (codHorarioVisita == null) {
			if (other.codHorarioVisita != null)
				return false;
		} else if (!codHorarioVisita.equals(other.codHorarioVisita))
			return false;
		return true;
	}
	

	


}
