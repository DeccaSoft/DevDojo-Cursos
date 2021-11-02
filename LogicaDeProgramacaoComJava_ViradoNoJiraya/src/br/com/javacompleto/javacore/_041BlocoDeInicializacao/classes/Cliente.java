package br.com.javacompleto.javacore._041BlocoDeInicializacao.classes;

public class Cliente {
    // 1 - É alocado espaço na memória para o objeto que será criado,
    // 2 - Cada atributo de Classe é criado e inicializado com seus valores default ou valores explícitos,
    // 3 - Bloco de Inicialização é executado e
    // 4 - O Construtor é executado.
    private int[] parcelas;

    {
        System.out.println("Dentro do Bloco de Inicialização...");
        parcelas = new int[100];
        for (int i=1; i<=100; i++){
            parcelas[i-1] = i;
        }
        System.out.println("Saindo do Bloco de Inicialização...");
    }

    public Cliente(){
        System.out.println("Dentro do Construtor...");
        for (int parcela : this.parcelas){
            System.out.print(parcela + " ");
        }
        System.out.println("");
        System.out.println("Saindo do Construtor...");
    }

    public int[] getParcelas() {
        return parcelas;
    }

    public void setParcelas(int[] parcelas) {
        this.parcelas = parcelas;
    }
}
