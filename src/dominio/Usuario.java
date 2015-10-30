package dominio;

/**
 * @author Renzo Rodrigues
 */
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="tb_usuarios")
public class Usuario implements Serializable {
	private static final long serialVersionUID  = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codUsuario;
    
    private String nome;
    private String cpf;
    private String celular;
    private String email;
    private String senha;
        
    @OneToMany(mappedBy="usuario")
    private List<Favorito> favoritos;
    
    @OneToMany(mappedBy="usuario")
    private List<Locacao> locacoesComoLocatario;
    
    @OneToMany(mappedBy="anuncio")
    private List<Locacao> locacoesComoLocador;
    
    @OneToMany(mappedBy="usuario")
    private List<Anuncio> anuncios;
    
    @OneToMany(mappedBy="anuncio")
    private List<Questao> questoes;

    public Usuario() {
        this.favoritos = new ArrayList<>();
        this.locacoesComoLocatario = new ArrayList<>();
        this.locacoesComoLocador = new ArrayList<>();
        this.anuncios = new ArrayList<>();
        this.questoes = new ArrayList<>();
    }

    public Usuario(Integer codUsuario, String nome, String cpf, String celular, String email, String senha) {
        this.codUsuario = codUsuario;
        this.nome = nome;
        this.cpf = cpf;
        this.celular = celular;
        this.email = email;
        this.senha = senha;
    }

    public Integer getCodUsuario() {
        return codUsuario;
    }

    public void setCodUsuario(Integer codUsuario) {
        this.codUsuario = codUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public List<Favorito> getFavoritos() {
        return favoritos;
    }

    public void setFavoritos(List<Favorito> favoritos) {
        this.favoritos = favoritos;
    }

    public List<Locacao> getLocacoesLocatario() {
        return locacoesComoLocatario;
    }

    public void setLocacoesLocatario(List<Locacao> locacoesLocatario) {
        this.locacoesComoLocatario = locacoesLocatario;
    }

    public List<Locacao> getLocacoesLocador() {
        return locacoesComoLocador;
    }

    public void setLocacoesLocador(List<Locacao> locacoesLocador) {
        this.locacoesComoLocador = locacoesLocador;
    }

    public List<Anuncio> getAnuncios() {
        return anuncios;
    }

    public void setAnuncios(List<Anuncio> anuncios) {
        this.anuncios = anuncios;
    }

    public List<Questao> getQuestoes() {
        return questoes;
    }

    public void setQuestoes(List<Questao> questoes) {
        this.questoes = questoes;
    }
    
    public void addFavorito(Favorito x){
        this.favoritos.add(x);
    }
    public void removeFavorito(Favorito x){
        this.favoritos.remove(x);
    }
    
    public void addLocacaoLocatario(Locacao x){
        this.locacoesComoLocatario.add(x);
    }
    public void removeLocacaoLocatario(Locacao x){
        this.locacoesComoLocatario.remove(x);
    }
    
    public void addLocacaoLocador(Locacao x){
        this.locacoesComoLocador.add(x);
    }
    public void removeLocacaoLocador(Locacao x){
        this.locacoesComoLocador.remove(x);
    }
    
    public void addAnuncio(Anuncio x){
        this.anuncios.add(x);
    }
    public void removeAnuncio(Anuncio x){
        this.anuncios.remove(x);
    }
    
    public void addQuestao(Questao x){
        this.questoes.add(x);
    }
    public void removeQuestao(Questao x){
        this.questoes.remove(x);
    }

    @Override
    public String toString() {
        return "Usuario{" + "codUsuario=" + codUsuario + ", nome=" + nome + ", cpf=" + cpf + ", celular=" + celular + ", email=" + email + ", senha=" + senha + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.codUsuario);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (!Objects.equals(this.codUsuario, other.codUsuario)) {
            return false;
        }
        return true;
    }      
}
