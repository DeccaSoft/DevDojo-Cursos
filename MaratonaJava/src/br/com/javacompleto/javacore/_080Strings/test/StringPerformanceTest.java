package br.com.javacompleto.javacore._080Strings.test;

public class StringPerformanceTest {
    public static void main(String[] args) {
        Long inicio = System.currentTimeMillis();
        concatString(10000);
        Long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto: " + (fim - inicio) + " Milissegundos");

        inicio = System.currentTimeMillis();
        concatStringBuilder(9000000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto com StringBuilder: " + (fim - inicio) + " Milissegundos");
        //O StringBuilder é mais rápido do que o StringBuffer
        inicio = System.currentTimeMillis();
        concatStringBuffer(9000000);
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto com StringBuffer: " + (fim - inicio) + " Milissegundos");
    }

    private static void concatString(int tam){
        String string = "";
        for (int i=0; i<tam; i++){
            string+=i;
        }
    }

    private static void concatStringBuilder(int tam){
        StringBuilder sb = new StringBuilder(tam);
        for (int i=0; i<tam; i++){
            sb.append(1);
        }
    }
    //StringBuilder e Stringbuffer são a mesma coisa
    //No entanto o StrgBuffer possui os métodos sincronizados
    //ou seja, são protegidos contra acesso de múltiplas Threads
    private static void concatStringBuffer(int tam){
        StringBuffer sbf = new StringBuffer(tam);
        for (int i=0; i<tam; i++){
            sbf.append(1);
        }
    }
}
