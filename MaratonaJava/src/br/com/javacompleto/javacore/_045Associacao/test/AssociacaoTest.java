package br.com.javacompleto.javacore._045Associacao.test;

import br.com.javacompleto.javacore._045Associacao.classes._47_Exercicio.classes.Aluno;
import br.com.javacompleto.javacore._045Associacao.classes._47_Exercicio.classes.Local;
import br.com.javacompleto.javacore._045Associacao.classes._47_Exercicio.classes.Professor;
import br.com.javacompleto.javacore._045Associacao.classes._47_Exercicio.classes.Seminario;

/*
Crie um sistema que gerencie Seminários (Crie também o Diagrama de Classes)
Deverá cadastrar os seminários, os alunos, os professores e um local. (Classes)
Um aluno poderá estar em apenas um seminário.
Um seminário poderá ter um ou vários alunos.
Um professor poderá ministrar um ou vários seminários.
Um seminário só poderá ter um professor.
Um seminário terá um local.
Atributos
Seminário:  Título
Aluno: Nome e Idade
Professor: Nome e Especialidade
Local: Rua e Bairro
 */

public class AssociacaoTest {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("André", 44);
        Aluno aluno2 = new Aluno("Dani", 43);
        Seminario sem = new Seminario("Maratona Java");
        Professor prof = new Professor("Yoda", "Java");
        Local local = new Local("Rua Solon Pinehiro, 1525", "Bairro de Fátima");

        aluno.setSeminario(sem);
        aluno2.setSeminario(sem);
        sem.setProfessor(prof);
        sem.setLocal(local);
        //Uma forma de referenciar Array
        sem.setAlunos(new Aluno[] {aluno, aluno2});
        //Outra forma de referenciar Array
        Seminario[] semArray = new Seminario[1];
        semArray[0] = sem;
        prof.setSeminarios(semArray);

        sem.print();
        prof.print();




    }
}
