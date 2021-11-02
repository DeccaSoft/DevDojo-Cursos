package br.com.LogicaProgramacao._13EstruturasCondicionais;

public class _15Condicionais03_Exercicio {
    public static void main(String[] args) {
        //Receba salario e se for maior que 4500 imprima 30% dele, senão imprima 15%.
        float salario = 4700.50F;
        if (salario > 4500){
            //Poderia ter criado uma variável aqui dentro deste ESCOPO
            //para guardar o valor correspondente aos 30%... e ela só existiria Aqui!
            System.out.println("30% de " + salario + " é igual a: " + salario*0.3F);
        }else{
            System.out.println("15% de " + salario + " é igual a: " + salario*0.15F);
        }
    }
}
