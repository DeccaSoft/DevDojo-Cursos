package br.com.LogicaProgramacao._13EstruturasCondicionais;

public class _23CondicionaisExercicio {
    public static void main(String[] args) {
        //Alistamento Militar
        char sexo = 'M';
        int idade = 18;

        if((sexo=='M' || sexo=='F') && idade <18){
            System.out.println("Alistamento não permitido!");
        }else if(sexo=='M' && idade >=18){
            System.out.println("Alistamento Obrigatório!");
        }else if(sexo=='F' && idade>=18){
            System.out.println("Alistamento Opcional!");
        }
    }
}
