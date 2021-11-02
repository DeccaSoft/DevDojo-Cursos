package br.com.javacompleto.introducao.arrays;

public class _020Arrays3 {
    public static void main(String[] args) {
        int[] numeros = new int[5];
        int[] numeros2 = {1,2,3,4,5}; //Tamanho 5 e índices vão de 0 até 4
        int[] numeros3 = new int[]{5,4,3,2,1}; //Dessa forma não se pode definir o tamanho, pois já é automático quando se estabelece os valores de cada casa

        for (int i=0; i<numeros2.length; i++){
            System.out.println(numeros2[i]);
        }
        System.out.println("Foreach...");
        //foreach
        for(int aux : numeros3){ //a variável auxiliar (no caso "aux") deve ser do mesmo tipo do array (no caso "int")
            System.out.println(aux);
        }

    }
}
