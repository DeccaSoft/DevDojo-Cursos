package br.com.LogicaProgramacao._13EstruturasCondicionais;

public class _25SwitchCase {
    public static void main(String[] args) {
        //Imprima um numero e imprima o dia correspondente da semana
        int diaSemana = 1;
        switch (diaSemana){ //Somente valores que poçam ser convertidos par inteiro
            case 1: System.out.println("Domingo"); break;
            case 2: System.out.println("Segunda"); break;
            case 3: System.out.println("Terça"); break;
            case 4: System.out.println("Quarta"); break;
            case 5: System.out.println("Quinta"); break;
            case 6: System.out.println("Sexta"); break;
            case 7: System.out.println("Saábado"); break;
            default: System.out.println("Valor Inválido"); break;
            //A ordem dos cases não importa
            //
        }
        System.out.println("Fim do Programa");
    }
}
