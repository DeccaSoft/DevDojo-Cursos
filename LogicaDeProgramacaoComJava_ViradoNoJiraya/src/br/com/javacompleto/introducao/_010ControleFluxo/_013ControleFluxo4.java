package br.com.javacompleto.introducao._010ControleFluxo;

public class _013ControleFluxo4 {
    public static void main(String[] args) {
        int contador=0;
        while (contador<10){
            System.out.println(contador++);
            //contador++;
        }
        int c=0;
        while (c<10){
            System.out.println(++c);
        }
        int contador3=0;
        do{
            System.out.println("Dentro do While");
        }while(contador3>10);

        for(int i=0; i<10; i++){
            System.out.println("O valor de i ´: "+i);
        }
    }
}
