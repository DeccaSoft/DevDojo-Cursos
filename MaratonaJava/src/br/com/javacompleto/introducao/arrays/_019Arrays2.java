package br.com.javacompleto.introducao.arrays;

public class _019Arrays2 {
    public static void main(String[] args) {
        //int[] idades = new int[3];
        //Preenche por padrão cada espaço com "Zero" para byte, short, int, long, float, double
        //e para char = '\u0000' = Espaço Vazio (em Branco)
        // e para boolean = f
        // e para tipos reference, ou seja, arrays de objetos = null... é o caso de String por exemplo.
        String[] nomes = new String[4];
        nomes[0]="Naruto";
        nomes[1]="Goku";
        nomes[2]="Luffy";
        nomes[3]="Kurosaki";
        for(int i=0; i<nomes.length; i++){
            System.out.println((i+1) + "º Nome: " + nomes[i]);
        }
    }
}

