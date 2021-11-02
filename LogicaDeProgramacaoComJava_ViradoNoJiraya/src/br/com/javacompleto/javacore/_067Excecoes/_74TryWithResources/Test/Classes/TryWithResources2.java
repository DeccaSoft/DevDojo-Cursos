package br.com.javacompleto.javacore._067Excecoes._74TryWithResources.Test.Classes;

public class TryWithResources2 {
    public static void main(String[] args) {
        lerArquivo();
    }


    public static void lerArquivo()  {
        //Try With Resources
        try(Leitor1 leitor1 = new Leitor1(); Leitor2 leitor2 = new Leitor2()) {
            //Observe (na execução) que o Java sempre fecha na ordem inversa.
        }catch (Exception e){
            //Você não é obrigado a ter o bloc catch,
            // mas se não utilizá-lo, você deverá incluir a exceção que pode ser lançada na assinatura do método
            e.printStackTrace();
        }
    }
}
