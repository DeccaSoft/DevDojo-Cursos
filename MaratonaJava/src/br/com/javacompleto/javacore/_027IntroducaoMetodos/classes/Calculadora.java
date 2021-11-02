package br.com.javacompleto.javacore._027IntroducaoMetodos.classes;

public class Calculadora {
    public void somaDoisNumeros(){
        System.out.println(5+5);
    }
    public void subtraiDoisNumeros(){
        System.out.println(5-5);
    }
    public void multiplicaDoisNumeros(int num1, int num2){
        System.out.println(num1*num2);
    }
    public double divideDoisNumeros(double num1, double num2){
        //double resultado = num1/num2;
        //return resultado;
        //No caso acima a variável fica redundante, pois você pode retornar direto o valor da divisão, economizando linha de código e espaço em memória
        if(num2 != 0){
            return num1/num2;
        }
        System.out.println("Não existe Divisão por Zero!");
        return 0;
    }

    public void imprimeDoisNumerosDivididos(double num1, double num2){
        if (num2 != 0){
            System.out.println(num1 / num2);
            return; //Só pode usar o return (puro e simples) em métodos void... funciona como um break.
        }else{ //Aqui não precisaria do else, pois ele só executaria caso não entrasse no if.
            System.out.println("Não existe Divisão por Zero!");
        }
    }

    public void alteraDoisNumeros(int num1, int num2){
        num1 = 30;
        num2 = 40;
        System.out.println("Dentro do Altera dois Números");
        System.out.println("Num1= "+num1);
        System.out.println("Num2= "+num2);
        System.out.println("Saindo do Altera");
    }

    public void somaArray(int[] numeros){
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println("A Soma dos valores do Array Números é: " + soma);
    }

    public void somaVarArgs(int... numeros){ //Só se pode ter um VarArgs por assinatura.
        int soma = 0;
        for (int num : numeros) {
            soma += num;
        }
        System.out.println("A Soma dos valores do Array Números pelo VarArgs é: " + soma);
    }
}
