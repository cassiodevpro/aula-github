package livros;

public class Main {
    public static void main(String[] args) {
        Livro livro = new Livro("", "", 0, 0);
        livro.exibirInformacoes();
        livro.calcularTempoLeitura();
    }
}

