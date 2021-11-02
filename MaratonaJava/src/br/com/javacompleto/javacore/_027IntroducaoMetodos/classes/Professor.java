package br.com.javacompleto.javacore._027IntroducaoMetodos.classes;

// Crie os seguintes atributos para essa classe:
    // Nome; Matrícula; RG; CPF;
// Crie uma classe de teste para preencher e imprimir os dados
public class Professor {
    public String nome;
    public String matricula;
    public String rg;
    public String cpf;

    public void imprime(Professor aux){
        System.out.println("Professor");
        System.out.println(aux.cpf);
        System.out.println(aux.matricula);
        System.out.println(aux.nome);
        System.out.println(aux.rg);
        System.out.println("------------");
        //Cuidado!!!
        //Alterando o nome detro do imprime...
        System.out.println("Nome sendo alterado dentro do objeto...");
        aux.nome = "João";
        System.out.println("Agora me chamo... " + aux.nome);
    }

    public void imprime2(){
        System.out.println("Professor");
        System.out.println(this.cpf);
        System.out.println(this.matricula);
        System.out.println(this.nome);
        System.out.println(this.rg);
        System.out.println("------------");
    }
}
