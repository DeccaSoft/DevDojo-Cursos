package br.com.LogicaProgramacao._13EstruturasCondicionais;

public class _17Condicionais05_OperadoresLogicos_TabelaVerdade {
    public static void main(String[] args) {
        //Exemplo Imposto de Renda
        double salario = 4500D;
        //Operadores Lógicos:
        // ! (Not = Negação), && (E), || (Ou)
        if(salario<=1903.98){
            System.out.println("Isento");
        }else if(salario>=1903.99 && salario<=2826.65){
            System.out.println("Imposto de 7.5%, que é igual a: " + salario*0.075 );
        }else if(salario>=2826.66 && salario<=3751.05){
            System.out.println("Imposto de 15%, que é igual a: " + salario*0.15 );
        }else if(salario>=3751.06 && salario<=4664.68){
            System.out.println("Imposto de 22.5%, que é igual a: " + salario*0.225 );
        }else{
            System.out.println("Imposto de 27.5%, que é igual a: " + salario*0.275 );
        }
    }
}
