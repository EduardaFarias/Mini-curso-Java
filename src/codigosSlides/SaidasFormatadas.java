package codigosSlides;

public class SaidasFormatadas {
    public static void main(String[] args) {
        double precoAbacate = 5.20;
        double precoMamao = 4.50;
        double valorTotal = precoAbacate + precoMamao;

    
        System.out.printf("O preço do abacate é: %.2f\n"
                        + "O preço do mamão é: %.2f\n"
                        + "O valor total da sua compra é: %.2f",
                        precoAbacate, precoMamao, valorTotal
                        );
    }
}
