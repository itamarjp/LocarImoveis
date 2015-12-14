package servico.impl;

import java.util.List;

import dao.DaoFactory;
import dao.impl.EM;

import dao.UsuarioDao;

import dominio.Usuario;
import servico.UsuarioServico;

public class UsuarioServicoImpl implements UsuarioServico {
	
	private UsuarioDao dao;
	
	public UsuarioServicoImpl() {
		dao = DaoFactory.criarUsuario();
	}
	
	@Override
	public void inserirAtualizar(Usuario x) {
		EM.getLocalEm().getTransaction().begin();
		dao.inserirAtualizar(x);
		EM.getLocalEm().getTransaction().commit();
	}
	
	@Override
	public void excluir(Usuario x) {
		EM.getLocalEm().getTransaction().begin();
		dao.excluir(x);
		EM.getLocalEm().getTransaction().commit();
	}
	
	@Override
	public Usuario buscar(int codUsuario) {
		return dao.buscar(codUsuario);
	}
	
	@Override
	public List<Usuario> buscarTodos() {
		return dao.buscarTodos();
	}
	public List<Usuario> BuscarUsuarioPorEmailSenha(String Usuario, String Senha){
		return dao.BuscarUsuarioPorEmailSenha( Usuario,  Senha);
	}

	
}