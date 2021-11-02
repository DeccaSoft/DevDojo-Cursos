package br.com.javacompleto.javacore._067Excecoes._71Finally.Test;

public class Finally {
    public static void main(String[] args) {
        String s = abrirArquivo();
        System.out.println(s);
    }

    public static String abrirArquivo(){
        try{
            System.out.println("Abrindo Arquivo...");
            System.out.println("Lendo Arquivo...");
            //throw new Exception();
            System.out.println("Escrevendo no Arquivo...");
            return "Teste";
        }catch(Exception e){
            System.out.println("Dentro Catch");
            e.printStackTrace();
        }finally{ //Executa mesmo que você tenha um Retorno, ou seja, SEMPRE será Executado
            System.out.println("FINALLY... Fechando o Arquivo...");
        }
        return "null;";
        //ATENÇÃO: Só existe: Try-Catch(s), Try-Finally ou Try-Catch(s)-Finally
    }
}
