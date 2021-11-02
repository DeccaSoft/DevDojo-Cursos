package br.com.javacompleto.javacore._057Enum.classes;

public class Cliente {
    //Enums também podem ser implementados dentro da Classe...
    public enum TipoPagamento{ //pode ser privado, público, protegido ou sem nenhum modificador (modificador padrão)
        A_VISTA, A_PRAZO
    }
    private String nome;
    private TipoCliente tipoCliente;
    private TipoPagamento tipoPagamento;

    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente.getNome() +
                ", tipoPagamento=" + tipoPagamento +
                ", numero" + tipoCliente.getTipo() +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    public TipoPagamento getTipoPagamento() {
        return tipoPagamento;
    }

    public void setTipoPagamento(TipoPagamento tipoPagamento) {
        this.tipoPagamento = tipoPagamento;
    }

    /*
    Removidos para a utilização e Enums

    public static final int PESSOA_FISICA = 1;
    public static final int PESSOA_JURIDICA = 2;

    public Cliente(String nome, int tipo) {
        this.nome = nome;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        String tipo;
        if (this.tipo==1){
            tipo = "Pessoa Física";
        }else{
            tipo = "Pessoa Jurídica";
        }
        return "Cliente: " + this.nome + " - Tipo: " + tipo; //Foi utilizado só (tipo)
                                                            // para poder ser utilizado a variável local
                                                            // e não a da classe (this.tipo)
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

     */
}
