package livros;

import java.util.Scanner;

public class Livro {

    private String titulo;
    private String autor;
    private int anoPublicacao;
    private int quantidadePagina;

    public Livro(String titulo, String autor, int anoPublicacao, int quantidadePagina) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.quantidadePagina = quantidadePagina;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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

    public int getQuantidadePagina() {
        return quantidadePagina;
    }

    public void setQuantidadePagina(int quantidadePagina) {
        this.quantidadePagina = quantidadePagina;
    }

    public void exibirInformacoes() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o nome do livro: ");
        this.setTitulo(scanner.nextLine());
        System.out.println("Digite o  autor: ");
        this.setAutor(scanner.nextLine());
        System.out.println("Digite o ano da publicação: ");
        this.setAnoPublicacao(scanner.nextInt());
        System.out.println("Digite o numero de paginas: ");
        this.setQuantidadePagina(scanner.nextInt());
        System.out.println("Autor: " + autor
                + "\ncTitulo: " + titulo
                + "\nAno publicação: " + anoPublicacao
                + "\nQuantidade de paginas:  " + quantidadePagina);
        scanner.close();
    }

    public int calcularTempoLeitura() {
        Scanner teclado = new Scanner(System.in);
        int opcao = 0;
        do {
            System.out.println("### CALCULO DIAS DE LEITURA ###");
            System.out.println("Se ler de 1  paginas por dia digite 1: ");
            System.out.println("Se ler de 4  paginas por dia digite 2: ");
            System.out.println("Se ler de 8  paginas por dia digite 3: ");
            System.out.println("Se ler mais de 10 paginas por dia digite 4: ");
            System.out.println("Se quiser sair 0: ");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Tempo de leitura ====> " + this.quantidadePagina / 1 + " dias");
                    break;
                case 2:
                    System.out.println("Tempo de leitura ====> " + this.quantidadePagina / 4 + " dias");
                    break;
                case 3:
                    System.out.println("Tempo de leitura ====> " + this.quantidadePagina / 8 + " dias");
                    break;
                case 4:
                    System.out.println("Tempo de leitura ====> " + this.quantidadePagina / 10 + " dias");
                    break;
                default:
                    System.out.println("Valor invalido");

            }
        } while (opcao != 0);

        teclado.close();
        return quantidadePagina;
    }
}
