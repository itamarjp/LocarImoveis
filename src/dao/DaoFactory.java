package dao;

/**
 * @author Eduardo V. Rocha
 */

import dao.jpa.AnuncioDaoImpl;

public class DaoFactory {
    public static AnuncioDao criarAnuncioDao() {
        return new AnuncioDaoImpl();
    }
    
}