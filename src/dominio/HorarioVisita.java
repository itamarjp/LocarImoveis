package dominio;

/**
 * @author Neirivon Elias Cardoso
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
@Table(name="tb_horariosvisitas")
public class HorarioVisita implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codHorarioVisita;
	
	@ManyToOne
	@JoinColumn(name="anuncio")
	private Anuncio anuncio;

	public HorarioVisita() {
	}

	public HorarioVisita(Integer codHorarioVisita, Anuncio anuncio) {
		super();
		this.codHorarioVisita = codHorarioVisita;
		this.anuncio = anuncio;
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

	@Override
	public String toString() {
		return "HorarioVisita [codHorarioVisita=" + codHorarioVisita + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
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
		if (codHorarioVisita == null) {
			if (other.codHorarioVisita != null)
				return false;
		} else if (!codHorarioVisita.equals(other.codHorarioVisita))
			return false;
		return true;
	}
}
