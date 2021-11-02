package br.com.javacompleto.javacore._064Polimorfismo.classes;

public class Gerente extends Funcionario {
    private double pnl; //Participação nos Lucros

    public Gerente(String nome, double salario, double pnl) {
        super(nome, salario);
        this.pnl = pnl;
    }

    @Override
    public void calcularPagamento() {
        this.salario = this.salario + pnl;
    }

    public double getPnl() {
        return pnl;
    }

    public void setPnl(double pnl) {
        this.pnl = pnl;
    }
}
