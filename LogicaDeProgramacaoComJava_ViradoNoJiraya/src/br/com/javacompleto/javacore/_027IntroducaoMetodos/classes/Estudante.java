package br.com.javacompleto.javacore._027IntroducaoMetodos.classes;

public class Estudante {
    private String nome;
    private int idade;
    private double[] notas;
    private boolean aprovado;

    public void print(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        //System.out.println("Notas: " + this.notas); // Aqui ele só mostra a referencia da variável
        System.out.print("Suas notas foram: ");
        if (this.notas != null){
            for (double nota: this.notas) {
                System.out.print(nota + " ");
            }
            System.out.println("");
        }else{
            System.out.println("Aluno sem Notas!!!");
        }

    }

    public void tirarMedia(){
        if(this.notas == null){
            System.out.println("Aluno sem Média");
            return;
        }
        double somaNotas = 0;
        for (double nota : this.notas) {
                somaNotas += nota;
            }

        double media = somaNotas / this.notas.length;
        if (media>6){
            this.aprovado = true;
            System.out.println("Aprovado! Sua média foi: " + media);
        }else{
            this.aprovado = false;
            System.out.println("Reprovado! Sua média foi: " + media);
        }

    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setIdade(int idade){
        if (idade<0){
            System.out.println("Idade Inválida!!!");
            return;
        }
        this.idade = idade;
    }
    public void setNotas(double[] notas){
        this.notas = notas;
    }

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public double[] getNotas(){

        return this.notas;
    }

    public boolean isAprovado(){
        return aprovado;
    }
}
