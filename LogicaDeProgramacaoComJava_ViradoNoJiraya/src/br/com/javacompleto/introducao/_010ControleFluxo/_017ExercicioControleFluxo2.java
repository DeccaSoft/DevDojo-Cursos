package br.com.javacompleto.introducao._010ControleFluxo;

public class _017ExercicioControleFluxo2 {
    public static void main(String[] args) {
        // Crie um switch que, dado um valor de 1 a 7
        // considerando 1==domingo, imprima se é dia útil ou não

        byte dia = 6;
        String sit = "Util";

        if (dia==1 || dia==7){
            sit = "Não Util";
        }
        switch (dia){
            case 1: System.out.println("Domingo - " + sit); break;
            case 2: System.out.println("Segunda - " + sit); break;
            case 3: System.out.println("Terça - " + sit); break;
            case 4: System.out.println("Quarta - " + sit); break;
            case 5: System.out.println("Quinta - " + sit); break;
            case 6: System.out.println("Sexta - " + sit); break;
            default: System.out.println("Dia Inválido!"); break;
        }

        // Outra forma de fazer com menos linhas de código...

        dia++;
        if (dia==1 || dia==7){
            sit = "Não Util";
        }

        switch (dia){
            case 1: case 7: System.out.println(sit); break;
            case 2: case 3: case 4: case 5: case 6: //default: System.out.println(sit); break; // Poderi o default estar aqui caso necessário
            default: System.out.println("Dia Inválido!!!"); break;
        }
    }
}
