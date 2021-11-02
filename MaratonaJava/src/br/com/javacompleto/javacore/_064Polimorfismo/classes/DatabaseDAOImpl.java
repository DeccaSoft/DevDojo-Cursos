package br.com.javacompleto.javacore._064Polimorfismo.classes;

public class DatabaseDAOImpl implements GenericDAO{

    @Override
    public void save() {
        System.out.println("Salvando Dados no Banco de Dados...");
    }
}
