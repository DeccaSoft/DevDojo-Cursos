package br.com.javacompleto.introducao.arrays;

public class _022Arrays5 {
    public static void main(String[] args) {
        int[][] dias = new int[2][2]; //poderia ser int[] dias[] = new int[2][2]
        dias[0][0]=31;
        dias[0][1]=30;
        dias[1][0]=29;
        dias[1][1]=28;

        for(int i=0; i<dias.length; i++){
            System.out.println("Endereços de Memória");
            System.out.println(dias[i]); //Aqui ele mostra só o endereço de memória referenciado
            for(int j=0; j<dias[i].length; j++ ){
                System.out.println(dias[i][j]);
            }
        }
        System.out.println("-----------------");
        //Utilizando o foreach
        for(int[] ref: dias){
            System.out.println("Foreach1");
            for(int dia : ref){
                System.out.println("Foreach2");
                System.out.println(dia);
            }
        }

    }
}
