package poo.livro;

public class Main {
    public static void main(String[] args) {
        /**
         Livro livro1 = new Livro();
         livro1.setNome("Verity");
         livro1.setAutor("Colleen Hoover");
         livro1.setAnoPublicacao(2019);
         livro1.setEditora("Galera");
         livro1.setGenero("Suspense");
         livro1.setFaixaEtaria(16);
         livro1.setPreco(33.99);
         livro1.setQtdPaginas(307);
         livro1.getAnoPublicacao();
         **/
        ServiceLivro serviceLivro = new ServiceLivro();

        Livro livro1 = new Livro("Verity", "Suspense", 307,
                "Collen Hoover", 2019, "Galera", 33.99, 0);
        Livro livro2 = new Livro("Verity", "Suspense", 307,
                "Collen Hoover", 2019, "Galera", 33.99, 0);

        System.out.println(serviceLivro.apresentaLivro(livro1));
        System.out.println(serviceLivro.categorizaLivro(livro1));
        System.out.println(serviceLivro.desconto(livro1, 1));
    }

}
