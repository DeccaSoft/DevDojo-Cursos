package br.com.javacompleto.javacore._060ClassesAbstratas.classes;

public class Gerente extends Funcionario {
    public Gerente() {
    }

    public Gerente(String nome, String clt, double salario) {
        super(nome, clt, salario);
    }

    @Override
    public void calculaSalario() {
        //super.calculaSalario();
        this.salario = salario + (salario*0.2);
    }


}
