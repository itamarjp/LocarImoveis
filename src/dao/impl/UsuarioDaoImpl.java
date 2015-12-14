package dao.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import dao.UsuarioDao;
import dominio.Usuario;

public class UsuarioDaoImpl implements UsuarioDao{

	private EntityManager em;
	
	public UsuarioDaoImpl() {
		this.em = EM.getLocalEm();
	}
	
	@Override
	public void inserirAtualizar(Usuario x) {
		if (x.getCodUsuario() != null) {
			x = em.merge(x);
		}
		em.persist(x);
	}
	
	@Override
	public void excluir(Usuario x) {
		x = em.merge(x);
		em.remove(x);
	}
	
	@Override
	public Usuario buscar(int CodUsuario) {
		return em.find(Usuario.class, CodUsuario);
	}
	
	@SuppressWarnings("unchecked")
	@Override	
	public List<Usuario> BuscarUsuarioPorEmailSenha(String Usuario, String Senha){
		String jpql = "SELECT x FROM Usuario x WHERE x.email = :p1 AND x.senha = :p2";
		Query query = em.createQuery(jpql);
		query.setParameter("p1", Usuario);
		query.setParameter("p2", Senha);
		return query.getResultList();
	}

	
	@SuppressWarnings("unchecked")
	@Override
	public List<Usuario> buscarTodos() {
		String jpql = "SELECT x FROM Usuario x";
		Query query = em.createQuery(jpql);
		return query.getResultList();
	}
	
	
	
	
	
	}


















