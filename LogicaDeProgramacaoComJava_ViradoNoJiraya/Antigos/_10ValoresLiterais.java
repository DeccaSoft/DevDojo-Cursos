package br.com.LogicaProgramacao;

public class _10ValoresLiterais {
    public static void main(String[] args) {
        //Calcule uma determinada porcentagem de um dado salário

        //Todo número decimal no java é double por padrão.
        float salario = 2500.00F; //Literal para Float
        float porcentagem = 30;
        float resultado;
        resultado = (porcentagem/100) * salario;
        System.out.println(resultado);
    }
}
