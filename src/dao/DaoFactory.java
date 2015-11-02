package dao;

/**
 * @authors Eduardo V. Rocha, Neirivon Elias Cardoso
 * 
 */

import dao.jpa.AnuncioDaoImpl;
import dao.jpa.HorarioVisitaDaoImpl;;

public class DaoFactory {
    public static AnuncioDao criarAnuncioDao() {
        return new AnuncioDaoImpl();
    }
    
	public static HorarioVisitaDao criarHorarioVisitaDao() {
		return new HorarioVisitaDaoImpl();
	}
    
}