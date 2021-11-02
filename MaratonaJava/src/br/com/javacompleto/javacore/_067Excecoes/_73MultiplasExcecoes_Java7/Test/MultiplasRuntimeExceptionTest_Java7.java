package br.com.javacompleto.javacore._067Excecoes._73MultiplasExcecoes_Java7.Test;

import java.awt.*;
import java.io.FileNotFoundException;
import java.sql.SQLException;

public class MultiplasRuntimeExceptionTest_Java7 {
    public static void main(String[] args) {

        //MULT-CATCH

        try{
            throw new IllegalArgumentException();
        }catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | ArithmeticException e){ //UnChecked
            System.out.println(("Dentro do Mult-Catch Exception"));
        }catch (RuntimeException e){
            System.out.println(("Dentro do RuntimeException"));
        }finally{
            System.out.println("Dentro do Finally");
        }
        //MULT-CATCH
        //Até a versão 6 do Java isso não podia, A partir da Versão 7 se pode
        //tratar várias Exceções utilizando o pipe (|), mas se tem algumas regrinhas...
        //1) Não é mais permitido, por exemplo: e = new SQLException, pois você não sabe qual será a exceção executada.
        //2) Não se pode utilizar classes em uma mesma linha de Herança, ou seja, Super e SubClasse

        //ATENÇÃO: Uma Classe mais Genérica (SuperClasse) não pode vir antes de uma mais Específica (SubClasse)
        //porqua assim você terá um código unreadable... nesse caso, todas as Exceções acima
        //são do tipo RuntimeException, portanto se ele viesse antes, as demais NUNCA seriam executadas
        System.out.println("Final do Programa");
        
        //Código que serve tanto para Exceções Checked e UnChecked
        try {
            talvezLanceException();
        } catch (Exception e) { //Mult-Catch
            //Até a versão 6 do Java isso não podia, A partir da Versão 7 se pode
            //tratar várias Exceções utilizando o pipe (|), mas se tem algumas regrinhas...
            //1) Não é mais permitido, por exemplo: e = new SQLException, pois você não sabe qual será a exceção executada.
            //2) Não se pode utilizar classes em uma mesma linha de Herança, ou seja, Super e SubClasse
        }
    }

    //Código que serve tanto para Exceções Checked e UnChecked
    private static void talvezLanceException() throws SQLException, FileNotFoundException, AWTException{

    }
}
