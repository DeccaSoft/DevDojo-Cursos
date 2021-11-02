package br.com.javacompleto.javacore._067Excecoes._72MultiplasExcecoes_Java6.Test;

import java.io.FileNotFoundException;
import java.sql.SQLException;

public class MultiplasRuntimeExceptionTest {
    public static void main(String[] args) {
        //Código que serve tanto para Exceções Checked e UnChecked
        try{
            throw new RuntimeException();
        }catch (ArrayIndexOutOfBoundsException e){ //UnChecked
            System.out.println(("Dentro do ArrayIndexOutOfBoundsException"));
        }catch (IllegalArgumentException e){ //UnChecked
            System.out.println(("Dentro do IllegalArgumentException"));
        }catch (ArithmeticException e){ //UnChecked
            System.out.println(("Dentro do ArithmeticException"));
        }catch (RuntimeException e){
            System.out.println(("Dentro do RuntimeException"));
        }finally{
            System.out.println("Dentro do Finally");
        }
        //ATENÇÃO: Uma Classe mais Genérica (SuperClasse) não pode vir antes de uma mais Específica (SubClasse)
        //porqua assim você terá um código unreadable... nesse caso, todas as Exceções acima
        //são do tipo RuntimeException, portanto se ele viesse antes, as demais NUNCA seriam executadas
        System.out.println("Final do Programa");
        
        //Código que serve tanto para Exceções Checked e UnChecked
        try {
            talvezLanceException();
        } catch (SQLException e) {
            //throwables.printStackTrace();
        } catch (FileNotFoundException e) {
            //e.printStackTrace();
        }
    }

    //Código que serve tanto para Exceções Checked e UnChecked
    private static void talvezLanceException() throws SQLException, FileNotFoundException{

    }
}
