package br.com.javacompleto.javacore._064Polimorfismo.classes;

public class ArquivoDAOImpl implements GenericDAO {
    @Override
    public void save() {
        System.out.println("Salvando Dados nos Arquivos...");
    }
}
