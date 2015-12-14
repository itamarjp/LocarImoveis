package servico;

import java.util.List;

import dominio.Usuario;

public interface UsuarioServico {

	public void inserirAtualizar(Usuario x);
	public void excluir(Usuario x);
	public Usuario buscar(int cod);
	public List<Usuario> buscarTodos();
	public List<Usuario> BuscarUsuarioPorEmailSenha(String Usuario, String Senha);

	
}