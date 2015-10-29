package dominio;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Foto")
public class Foto implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)	
	private Integer codFoto;
	private String caminho;
	
	public Foto() {
	}

	public Foto(Integer codFoto, String caminho) {
		super();
		this.codFoto = codFoto;
		this.caminho = caminho;
	}

	public Integer getCodFoto() {
		return codFoto;
	}

	public void setCodFoto(Integer codFoto) {
		this.codFoto = codFoto;
	}

	public String getCaminho() {
		return caminho;
	}

	public void setCaminho(String caminho) {
		this.caminho = caminho;
	}

	@Override
	public String toString() {
		return "Foto [codFoto=" + codFoto + ", caminho=" + caminho + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codFoto == null) ? 0 : codFoto.hashCode());
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
		Foto other = (Foto) obj;
		if (codFoto == null) {
			if (other.codFoto != null)
				return false;
		} else if (!codFoto.equals(other.codFoto))
			return false;
		return true;
	}	
}
