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
@Table(name="tb_favoritos")
public class Favorito implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codFavorito;
	
	@ManyToOne
	@JoinColumn(name="anuncio")
	private Anuncio anuncio;
	
	@ManyToOne
	@JoinColumn(name="usuario")
	private Usuario usuario;

	public Favorito() {
	}

	public Favorito(Integer codFavorito, Anuncio anuncio, Usuario usuario) {
		super();
		this.codFavorito = codFavorito;
		this.anuncio = anuncio;
		this.usuario = usuario;
	}

	public Integer getCodFavorito() {
		return codFavorito;
	}

	public void setCodFavorito(Integer codFavorito) {
		this.codFavorito = codFavorito;
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
		return "Favorito [codFavorito=" + codFavorito + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codFavorito == null) ? 0 : codFavorito.hashCode());
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
		Favorito other = (Favorito) obj;
		if (codFavorito == null) {
			if (other.codFavorito != null)
				return false;
		} else if (!codFavorito.equals(other.codFavorito))
			return false;
		return true;
	}
}
