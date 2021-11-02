package br.com.javacompleto.javacore._064Polimorfismo.classes;

public class RelatorioPagamento {

    //Todo esse código foi removido, pois foi criado um método Genérico utilizando Polimporfismo

//    public void relatorioPagamentoGerente(Gerente gerente){
//        System.out.println("Gerndo Relatórios para a Gerência...");
//        gerente.calcularPagamento();
//        System.out.println("Nome: " + gerente.getNome());
//        System.out.println("Salário: " + gerente.getSalario());
//    }
//
//    public void relatorioPagamentoVendedor(Vendedor vendedor){
//        System.out.println("Gerndo Relatórios para Vendedores...");
//        vendedor.calcularPagamento();
//        System.out.println("Nome: " + vendedor.getNome());
//        System.out.println("Salário: " + vendedor.getSalario());
//    }

    public void relatorioPagamentoGenerico(Funcionario funcionario){ //Parâmetros Polimórficos
        System.out.println("Gerndo Relatórios para Funcionarios...");
        funcionario.calcularPagamento();
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Salário: " + funcionario.getSalario());
        // Se faz um Cast Explícito quando se vai "Afunilar", ou seja, um cast menos genérico
        //você deve explicitar... como se estivesse dizendo: Eu sei que esse objeto é um Gerente!!!
        //Mas e se tivermos outros tipos de funcionários, isso vai por águq abaixo...
        //Devemos, então, utilizar também o instanceOf
        if(funcionario instanceof Gerente){
            Gerente g = (Gerente) funcionario;
            System.out.println("PNL: " + g.getPnl());
        }
        //Fazenda a mesma coisa para vendedor
        //mas abreviando o código...
        if(funcionario instanceof Vendedor){
            //Vendedor v = (Vendedor) funcionario;
            System.out.println("Total Vendas: " + ((Vendedor) funcionario).getTotalVendas());
            //Porém assim só se usa uma vez, ´pois não foi criada uma variável de referência como no "if" anterior
        }

    }
}
