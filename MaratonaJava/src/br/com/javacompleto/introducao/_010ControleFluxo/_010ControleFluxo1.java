package br.com.javacompleto.introducao._010ControleFluxo;

public class _010ControleFluxo1 {
    public static void main(String[] args) {
        if(false){
            System.out.println("Entrou no if true");
        } else {
            System.out.println("Entrou no else");
        }

        boolean c = false;
        if(c=true){
            System.out.println("Entrou aqui porque fizemos uma (atribuição) e não uma (comparação)");
        }
        if (c == false){
            System.out.println("Aqui ele não entra, pois o (c) agora é true");
        }


        int idade = 20;
        float salario = 2000;
        if (idade>18){
            System.out.println("Entrou no Clube");
        } else {
            System.out.println("Não pode entrar no clube");
        }

        //Se a idade < 15... Infantil,
        //se idade >= 15 && idade < 18... Juvenil
        //se idade >=18... Adulto

        int idade2 = 15;
        String categoria;

        if (idade2<15){
            categoria = "Infantil";
        } else if(idade2>=15 && idade2<18){
            categoria = "Juvenil";
        } else {
            categoria = "Adulto";
        }
        //Toda vez que você declarar uma variável LOCAL, ela precisa estar INICIALIZADA ANTES de ser Utilizada
        //Caso suprimisse o bloco em que ela seria inicializada daria erro de compilação,
        //pois quando ela fosse ser utilizada... mostrada na tela, ela não teria nenhum valor atribuído a ela.
        //O ideal seria inicializa-la com ""... String categoria="";
        System.out.println(categoria);




    }
}
