import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Produtos produto = null;
        int opcao;

        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Cadastrar novo produto");
            System.out.println("2. Adicionar estoque");
            System.out.println("3. Remover estoque");
            System.out.println("4. Calcular valor total do estoque");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1:
                    System.out.print("Nome do produto: ");
                    String nome = scanner.nextLine();

                    System.out.print("Código do produto: ");
                    String codigo = scanner.nextLine();

                    System.out.print("Quantidade inicial: ");
                    int quantidade = scanner.nextInt();

                    System.out.print("Preço unitário: ");
                    double preco = scanner.nextDouble();

                    produto = new Produtos(nome, codigo, quantidade, preco);
                    System.out.println("Produto cadastrado com sucesso!");
                    break;

                case 2:
                    if (produto == null) {
                        System.out.println("Cadastre um produto primeiro.");
                        break;
                    }
                    System.out.print("Quantidade a adicionar: ");
                    int adicionar = scanner.nextInt();
                    produto.adicionarEstoque(adicionar);
                    System.out.println("Estoque atualizado.");
                    break;

                case 3:
                    if (produto == null) {
                        System.out.println("Cadastre um produto primeiro.");
                        break;
                    }
                    System.out.print("Quantidade a remover: ");
                    int remover = scanner.nextInt();
                    produto.removerEstoque(remover);
                    System.out.println("Estoque atualizado.");
                    break;

                case 4:
                    if (produto == null) {
                        System.out.println("Cadastre um produto primeiro.");
                        break;
                    }
                    double valorTotal = produto.calcularValorEstoque();
                    System.out.printf("Valor total do estoque: R$%.2f\n", valorTotal);
                    break;

                case 5:
                    System.out.println("Encerrando o programa. Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

            // Impressão a cada loop
            if (produto != null) {
                System.out.println("\n--- DADOS ATUAIS DO PRODUTO ---");
                System.out.println("Nome: " + produto.getNome());
                System.out.println("Código: " + produto.getCodigo());
                System.out.println("Quantidade em estoque: " + produto.getQuantidade());
                System.out.printf("Preço unitário: R$%.2f\n", produto.getPrecoUnitario());
                System.out.printf("Valor total em estoque: R$%.2f\n", produto.calcularValorEstoque());
            }

            System.out.println(""); // Linha em branco para separar os loops

        } while (opcao != 5 && opcao != 0);

        if (produto != null) {
            System.out.println("\n--- DADOS FINAIS DO PRODUTO ---");
            System.out.println("Nome: " + produto.getNome());
            System.out.println("Código: " + produto.getCodigo());
            System.out.println("Quantidade em estoque: " + produto.getQuantidade());
            System.out.printf("Preço unitário: R$%.2f\n", produto.getPrecoUnitario());
            System.out.printf("Valor total em estoque: R$%.2f\n", produto.calcularValorEstoque());
        } else {
            System.out.println("\nNenhum produto foi cadastrado.");
        }

        scanner.close();
    }
}
