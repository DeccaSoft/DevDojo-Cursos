package br.com.javacompleto.introducao._010ControleFluxo;

public class _015ControleFluxo6 {
    public static void main(String[] args) {

        // Dado um valor de um carro, descubra em quantas vezes ele pode ser parcelado.
        // Porém, as parcelas não podem ser menores do que 1000.
        double valorTotal = 30000;
        // Invertendo a lógica
        for (int parcela = (int) valorTotal; parcela >=1; parcela--){
            double valorParcela = valorTotal / parcela;
            if (valorParcela<1000){
                continue;
            }
            System.out.println("Parcela " + parcela + " R$ " + valorParcela);
            //System.out.println("Consumindo Memória!");
        }
    }
}
