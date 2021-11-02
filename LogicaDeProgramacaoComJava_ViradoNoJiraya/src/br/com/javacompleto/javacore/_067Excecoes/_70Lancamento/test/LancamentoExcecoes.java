package br.com.javacompleto.javacore._067Excecoes._70Lancamento.test;

public class LancamentoExcecoes {
    public static void main(String[] args) {
        try{
            divisao(10,0);
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }
    private static void divisao(int num1, int num2){
        if(num2 == 0){
            throw new IllegalArgumentException("Passe um valor diferente de Zero para num2");
        }
        int result = num1/num2;
        System.out.println(result);
    }
}
