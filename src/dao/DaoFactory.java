package dao;

import dao.UsuarioDao;

import dao.impl.*;

public class DaoFactory {

	public static UsuarioDao criarUsuario() {
		return new UsuarioDaoImpl();
	}
    public static AnuncioDao criarAnuncioDao() {
        return new AnuncioDaoImpl();
    }

	public static HorarioVisitaDao criarHorarioVisitaDao() {
		return new HorarioVisitaDaoImpl();
	}
	
}