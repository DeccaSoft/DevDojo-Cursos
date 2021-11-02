package br.com.LogicaProgramacao._13EstruturasCondicionais;

public class _27SwitchCaseExercicio {
    public static void main(String[] args) {
        String tipoConta = "Conta Corrente";
        switch (tipoConta) { //Atenção: O Java é Case Sencitive
            case "Conta Poupança":
                System.out.println("Conta Poupança - 0,05%");
                break;
            case "Conta Corrente":
                System.out.println("Conta Corrente - 0,02");
                break;
            case "Conta Investimento":
                System.out.println("Conta Investimento - 0.01%");
                break;
            default:
                System.out.println("Conta Inválida!!!");
                break;
        }
    }
}
