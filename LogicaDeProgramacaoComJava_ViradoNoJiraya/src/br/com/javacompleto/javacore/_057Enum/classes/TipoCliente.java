package br.com.javacompleto.javacore._057Enum.classes;

public enum TipoCliente {
    //Tudo atribuído aqui é considerado Constante
    //ATENÇÂO: As constantes da enumeração DEVEM ser a Primeira linha da Classe Enum
    /* Antes era assim...
    PESSOA_FISICA, PESSOA_JURIDICA;
    */
    //Mas com a criação do Construtor devemos passar os valores do tipo inteiro de acordo com o atributo tipo
    PESSOA_FISICA(1, "Pessoa Física"),
    //Constant Specific Class Body
    PESSOA_JURIDICA(2, "Pessoa jUrídica"){
        public String getId(){
            return "B";
        }
    };

    //Enumerações funcionam como classes
    //Mas nunca se pode chamar diretamente um construtor enum... Ele próprio vai se chamar!

    //Atributos podem ser criados, mas só após a própria enumeração
    private int tipo;
    private String nome;

    //Construtor: Não pode ser Público, pois vc não o chama, Ele mesmo se chama!
                //Pode ser privado, mas é redundância...

    TipoCliente(int tipo, String nome) {
        this.tipo = tipo;
        this.nome = nome;
    }

    //Constant Specific Class Body
    public String getId(){
        return "A";
    }


    //Criado somente o método get, pois não queremos permitir a setagem de valores.
    public int getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }
}
