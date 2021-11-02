package br.com.javacompleto.javacore._064Polimorfismo.Test;

import br.com.javacompleto.javacore._064Polimorfismo.classes.ArquivoDAOImpl;
import br.com.javacompleto.javacore._064Polimorfismo.classes.DatabaseDAOImpl;
import br.com.javacompleto.javacore._064Polimorfismo.classes.GenericDAO;

public class DAOTest {
    public static void main(String[] args) {
//        ArquivoDAOImpl arquivoDAO = new ArquivoDAOImpl();
//        arquivoDAO.save();
//        DatabaseDAOImpl dbDAO = new DatabaseDAOImpl();
//        dbDAO.save();

        GenericDAO sDAO = new ArquivoDAOImpl();
        sDAO.save();
        GenericDAO s2DAO = new DatabaseDAOImpl();
        s2DAO.save();
    }
}
