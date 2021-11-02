package br.com.javacompleto.javacore._042ModificadorEstático.classes;

public class Cliente {
    // 0 - O bloco de Inicialização Estático é executado quando a JVM carregar a Classe (Apenas uma vez)
    // 1 - É alocado espaço na memória para o objeto que será criado,
    // 2 - Cada atributo de Classe é criado e inicializado com seus valores default ou valores explícitos,
    // 3 - Bloco de Inicialização é executado e
    // 4 - O Construtor é executado.

    private static int[] parcelas;
    //Bloco de Inicialização
    {
        System.out.println("Bloco de inicialização NÃO estático");
    }
    static { //Se o Bloco de Inicialização for Estático, ele será executado somente uma vez.
        System.out.println("Dentro do Bloco de Inicialização...Estático");
        parcelas = new int[100];
        for (int i=1; i<=100; i++){
            parcelas[i-1] = i;
        }
        System.out.println("Saindo do Bloco de Inicialização...");
    }
    //Quando se tem mais de um bloco de inicialização estático, eles sera~executados na ordem em que aparecem.

    static{
        System.out.println("Bloco de Inicialização estático 2");
    }
    static{
        System.out.println("Bloco de Inicialização estático 3");
    }

    //Um bloco de inicialização NÃO estático pode acessar um atributo estático,
        //porque ele existirá antes de se inicializar o bloco de inicialização.
    public Cliente(){
        System.out.println("Dentro do Construtor...");
        for (int parcela : Cliente.parcelas){
            System.out.print(parcela + " ");
        }
        System.out.println("");
        System.out.println("Saindo do Construtor...");
    }

    public static int[] getParcelas() {
        return parcelas;
    }

    //Não precisa mais do setParcelas, pois já setando no bloco de inicialização
    /*
    public static void setParcelas(int[] parcelas) {
        Cliente.parcelas = parcelas;
    }
    */
}
