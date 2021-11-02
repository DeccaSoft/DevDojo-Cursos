package br.com.javacompleto.introducao._010ControleFluxo;

public class _012ControleFluxo3 {
    public static void main(String[] args) {
        byte dia = 5;
        if (dia == 1){
            System.out.println("Domingo");
        } else if(dia == 2){
            System.out.println("Segunda");
        }else if(dia == 3){
            System.out.println("Terça");
        }else if(dia == 4){
            System.out.println("Quarta");
        }else if(dia == 5){
            System.out.println("Quinta");
        }else if(dia == 6){
            System.out.println("Sexta");
        }else if(dia == 7){
            System.out.println("Sábado");
        }else{
            System.out.println("Dia não Existe");
        }

        //Quando se tem apenas uma comparação simples dentro de IF´s encadeados, po-se usar o Switch

        dia++;
        //O Switch só aceita char, int, byte, short, enum e (a partir do java7) String
        switch(dia){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default: //Pode ser colocado em qualquer ordem, mas não é uma boa prática de programação
                System.out.println("Dia não Existe");
                break; //Não precisa (Obviamente)
        }
        // Apesar de permitido, não se usa "{ e }" para delimitar blocos do case... Não é uma boa prática!
    }
}
