package br.com.javacompleto.javacore._116Colecoes.classes;

public class Celular {

    private String nome;
    private String IMEI;
    //Neste exemplo queremos que o EMAI determine se dois Objetos são Iguais
    //Por esse motivo faremos um Método equals para identificar isto.

    //Regras para criação do Método Equals:
    //1-Deve ser Reflexivo: x.equals(x) tem que ser true para tudo que for diferente de nulo
    //2-Simétrico: x.equals(y)==true==y.equals(x); para x e y diferentes de null
    //3-Transitividade: x.equals(y)==true==y.equals(z)==x.equals(z)...; para x, y e z diferentes de null
    //4-Consistente: x.equals(y) deve sempre retornar o mesmo valor
    //5-Para x diferente de null, x.equals(null) DEVE retornar false.

    //Ctrl + O = Sobrescrever o método equals
    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(this == obj) return true;
        if(this.getClass() != obj.getClass()) return false;
        Celular outroCelular = (Celular) obj;
        //return IMEI != null ? IMEI.equals(outroCelular.getIMEI()) : false;
        //O Código acima foi simplificado para este a seguir:
        return IMEI != null && IMEI.equals(outroCelular.getIMEI());
    }

    //Regras para criação do Método HashCode:
    //1-Se x.equals(y)==true -> y.hashCode()==x.hashCode(),
    //por esse motivo DEVE-SE usar o mesmo valor testado no equals aqui no hasCode (No caso foi o EMAI)
    //2-Se x.hashCode()==y.hashCode(); NÃO quer dizer que x.equals(y)==true... Podem ser Diferentes!
    //3-Se x.equals(y)==false, Não precisa ter nada no hashCode
    //4-Se x.hashCode() != y.hashCode() -> x.equals(y) DEVERÁ ser false

    //Ctrl + O = Sobrescrever o Método HasCode
    @Override
    public int hashCode() {
        return IMEI != null ? IMEI.hashCode() : 1;
    }

    @Override
    public String toString() {
        return "Celular{" +
                "nome='" + nome + '\'' +
                ", IMEI='" + IMEI + '\'' +
                '}';
    }

    public Celular(String nome, String IMEI) {
        this.nome = nome;
        this.IMEI = IMEI;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getIMEI() {
        return IMEI;
    }

    public void setIMEI(String IMEI) {
        this.IMEI = IMEI;
    }
}
