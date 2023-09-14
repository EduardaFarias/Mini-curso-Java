package poo.livro;

public class Livro {
    private String nome;
    private String genero;
    private int qtdPaginas;
    private String autor;
    private int anoPublicacao;
    private String editora;
    private double preco;
    private int faixaEtaria;

    public Livro(String nome, String genero, int qtdPaginas, String autor,
                 int anoPublicacao, String editora, double preco, int faixaEtaria) {
        this.nome = nome;
        this.genero = genero;
        this.qtdPaginas = qtdPaginas;
        this. autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.editora = editora;
        this.preco = preco;
        this.faixaEtaria = faixaEtaria;
    }

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getGenero(){
        return this.genero;
    }

    public void setGenero(String genero){
        this.genero = genero;
    }

    public int getQtdPaginas() {
        return qtdPaginas;
    }

    public void setQtdPaginas(int qtdPaginas) {
        this.qtdPaginas = qtdPaginas;
    }
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setFaixaEtaria(int faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }
}
