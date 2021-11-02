package br.com.LogicaProgramacao._13EstruturasCondicionais;

public class _18Condicionais06_Exercicio {
    public static void main(String[] args) {
        //Torneio de Natação
        String nome = "Luffy";
        int idade = 19;

        if(idade <10){
            System.out.println(nome + " - Categoria Infantil");
        }else if(idade>=11 && idade<=15){
            System.out.println(nome + " - Categoria Juventil");
        }else if(idade>=16 && idade<=19){
            System.out.println(nome + " - Categoria Pré-Adulto");
        }else{
            System.out.println(nome + " - Categoria Adulto");
        }
    }
}
