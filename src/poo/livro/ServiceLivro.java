package poo.livro;

public class ServiceLivro {
    private Livro livro;

    public String apresentaLivro(Livro livro){
        String mensagem =
                "Dados do livro: " +
                        "\n---------------------------" +
                        "\nNome do livro: " + livro.getNome() +
                        "\nAutor: " + livro.getAutor() +
                        "\nGênero: " + livro.getGenero() +
                        "\nAno de publicação" + livro.getAnoPublicacao() +
                        "\nQuantidade de páginas: " + livro.getQtdPaginas() +
                        "\nEditora: " + livro.getEditora() +
                        "\nFaixa etária: " + livro.getFaixaEtaria() +
                        "\nPreço: " + livro.getPreco();

        return mensagem;
    }

    public String categorizaLivro(Livro livro){
        String mensagem;
        int faixaEtaria = livro.getFaixaEtaria();
        if(faixaEtaria >= 2 && faixaEtaria < 4 ){
            mensagem = "Pré-escolar";
        }
        else if(faixaEtaria >= 4 && faixaEtaria < 8){
            mensagem = "Infantil";
        }
        else if (faixaEtaria >= 8 && faixaEtaria < 12) {
            mensagem = "Juvenil";
        }
        else if (faixaEtaria >= 12 && faixaEtaria < 16) {
            mensagem = "Jovem adulto";
        }
        else if(faixaEtaria >= 16){
            mensagem = "Adulto";
        }
        else {
            mensagem = "Indefinida";
        }
        return mensagem;
    }

    public double desconto(Livro livro, double valorDesconto){
        double precoLivro = livro.getPreco();
        double precoFinal = precoLivro - valorDesconto;
        return precoFinal;
    }
}
