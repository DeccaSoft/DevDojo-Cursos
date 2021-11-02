package br.com.javacompleto.javacore._077Assertivas.Test;

public class AssertionTest {
    public static void main(String[] args) {

        //calculaSalario(-2000);
        //calcSalario(-1000);
        diasDaSemana(9);
    }
    //Assert a partir do Java 1.4
    //Você também pode Habilitar as Assertivas somente para uma Classe Específica... Ex:
    // -ea: br.com.javacompleto.javacore._77Assertivas.Test
    //-da = Desabilitada

    private static void calculaSalario(double salario){
        //Assertions são utilizadas na fase de Produção e São Desabilitadas por padrão
        //IDEAL é que Assertions sejam utilizadas em Métodos Privados
        assert (salario>0) : "O Salário NÃO deve ser Menor que Zero!!!" + salario;
//        if(salario>0){
//            //Faz Cálcilo de Salário
//            System.out.println("Seu salário é de...");
//        }else{
//            System.out.println("Se chegou até aqui, Ferrou!!!");
//        }

    }
    //Em métodos Públicos, devemos fazer o seguinte...
    public static void calcSalario(double salario){
        if(salario<0){
            throw new IllegalArgumentException();
        }
    }

    //ÙNICO caso que devemos utilizar assertivas em Métodos Públicos...
    //Quando você tem certeza ABSOLUTA que não existem outros valores possíveis.
    public static void diasDaSemana(int dia){
        switch (dia){
            case 1:break;
            case 2:break;
            case 3:break;
            case 4:break;
            case 5:break;
            case 6:break;
            case 7:break;
            default: assert false;
        }
    }
}
