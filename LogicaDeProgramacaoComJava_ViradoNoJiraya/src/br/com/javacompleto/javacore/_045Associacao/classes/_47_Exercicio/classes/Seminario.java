package br.com.javacompleto.javacore._045Associacao.classes._47_Exercicio.classes;

public class Seminario {
    private String titulo;
    //Associação TEM UM...
    private Aluno[] alunos; //Seminário (TEM UM) Aluno
    private Professor professor;    //Seminário (TEM UM) professor
    private Local local;    //Seminário (TEM UM) Local

    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Seminario() {
    }

    //O ideal seria verificar cada uma dessas variáveis se elas esão nulas ou não!
    public void print() {
        System.out.println("==++== Relatório de Seminários ==++==");
        System.out.println("Seminário: " + this.titulo);
        System.out.println("Professor: " + this.professor.getNome());
        if (this.professor != null){
            System.out.println("Professor: " + this.professor.getNome());
        }else{
            System.out.println("Nenhum professor cadastrado para esse Seminário!");
        }
        if (this.local != null){
            System.out.println("Local: " + this.local.getRua() + " Bairro: " + this.local.getBairro());
        }else{
            System.out.println("Nenhum local cadastrado para esse Seminário!");
        }
        if(alunos != null && alunos.length != 0){
        System.out.println("Alunos Participantes: ");
            for (Aluno aluno : alunos) {
                System.out.println(aluno.getNome());
            }
         return;
        }
        System.out.println("Nenhum aluno Inscrito!");
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}
