package br.com.javacompleto.introducao._010ControleFluxo;

public class _016ExercicioControleFluxo {
    public static void main(String[] args) {
        /*
        Criar Variável Salário e imprima o imposto de acordo com as regras de negócio seguintes:
        Calculo do imposto:
        Salario < 1000 = 5%
                >= 1000 && <2000 = 10%
                >= 2000 && <4000 = 15%
                >5000 = 20%
         */

        double sal = 5000;
        double imp = 0;

        if (sal < 1000) {
            imp = sal * 0.05;
            System.out.println("Imposto = " + imp);
        } else if(sal >= 1000 && sal < 2000){
            imp = sal * 0.10;
            System.out.println("Imposto = " + imp);
        } else if (sal >= 2000 && sal < 4000){
            imp = sal * 0.15;
            System.out.println("Imposto = " + imp);
        } else if (sal > 5000){
            imp = sal * 0.20;
            System.out.println("Imposto = " + imp);
        } else {
            System.out.println("SORTUDO!!!");
        }

    }
}
