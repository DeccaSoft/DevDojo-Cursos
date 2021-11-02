package br.com.LogicaProgramacao;

public class _11ReutilizandoVariaveis {
    public static void main(String[] args) {
        //Calcule porcentagens de um salário (30%, 15% e 5%)
        //A cada cálculo guarde, imprima e reutilize a variável para o novo cálculo
        double salario = 5000;
        double resultado = salario * 0.3;
        System.out.println("30% de "+salario + " é igual a: "+resultado);
        System.out.println("15% de "+resultado + " é igual a: "+(resultado*=0.15));
        System.out.println("5% de "+resultado + " é igual a: "+resultado*0.05);
    }
}
