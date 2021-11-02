package br.com.javacompleto.javacore._067Excecoes.ExceptionsExemplos;

public class ArrayIndexOutOfBoundsException2_TryCatch {
    public static void main(String[] args) {
        //Atenção: Quando se trabalha com RunTimeExceptions, não precisa utilizar o Try-Catch... Esistem outras maneiras de se tratar.
        try{
            int[] a = new int[2];
            System.out.println(a[2]);
        }catch (RuntimeException e){ //Polimorfismo...Trabalhe com a Classe mais Específica possível
            // que pode ter informções valiosas sobre o erro
            // por esse motivo deveria ser utilizado ArrayIndexOutOfBoundsException!
            //Não foi utilizado porque RuntimeException é Unchecked
            //Se quisermos utilizar ArrayIndexOutOfBoundsException deveríamos colocar o Throws na Assinatura do Método.
            e.printStackTrace();
        }
        System.out.println("Fora do Bloco Catch");
    }
}
