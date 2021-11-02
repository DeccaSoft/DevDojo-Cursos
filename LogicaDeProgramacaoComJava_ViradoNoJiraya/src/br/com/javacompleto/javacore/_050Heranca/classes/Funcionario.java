package br.com.javacompleto.javacore._050Heranca.classes;

//Herança: É UM
public class Funcionario extends Pessoa{ //Funcionário (É UMa) Pessoa
    private double salario;

    //Se você cria um construtor diferente do padrãom na SuperClasse,
    //você tem que informar qual o construtor deverá ser chamado na SubClasse

    {
        System.out.println("Bloco de Inicialização de Funcionário 1");
    }
    {
        System.out.println("Bloco de Inicialização de Funcionário 2");
    }
    static{
        System.out.println("Bloco de Inicialização Estático de Funcionário 1");
    }
    public Funcionario(String nome){
        super(nome); //Regras:
                    // Assim como o this(), deve ser a primeira linha de execução
                    //e não pode usar o "." ponto, ou seja, não existe "super.algumaCoisa" !
                    //Consequentemente, se você tiver um construtor sobrecarregado usando o this(),
                    //você não poderá usar o super()... ou um ou o outro!!!
        System.out.println("Dentro do Construtor Funcionario(String)");
    }

    @Override // Sobrescrita de Método
    public void imprime() {
        super.imprime();
        System.out.println("Salário: " + this.getSalario());
        imprimeReciboPagamento();
    }

    public void imprimeReciboPagamento(){
        System.out.println("Eu " + super.nome + " recebi o pagamento de " + this.salario);
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
