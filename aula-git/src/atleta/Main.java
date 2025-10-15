import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Atleta atleta = null;
        int opcao;

        do {
            System.out.println("\n--- MENU ATLETA ---");
            System.out.println("1. Cadastrar novo atleta");
            System.out.println("2. Calcular IMC");
            System.out.println("3. Verificar categoria");
            System.out.println("4. Atualizar informações do atleta");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // consumir quebra de linha

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();

                    System.out.print("Modalidade: ");
                    String modalidade = scanner.nextLine();

                    System.out.print("Idade: ");
                    int idade = scanner.nextInt();

                    System.out.print("Peso (kg): ");
                    double peso = scanner.nextDouble();

                    System.out.print("Altura (m): ");
                    double altura = scanner.nextDouble();

                    atleta = new Atleta(nome, modalidade, idade, peso, altura);
                    System.out.println("Atleta cadastrado com sucesso!");
                    break;

                case 2:
                    if (atleta == null) {
                        System.out.println("Cadastre um atleta primeiro.");
                    } else {
                        double imc = atleta.calcularIMC();
                        System.out.printf("IMC do atleta: %.2f\n", imc);
                    }
                    break;

                case 3:
                    if (atleta == null) {
                        System.out.println("Cadastre um atleta primeiro.");
                    } else {
                        String categoria = atleta.classificarCategoria();
                        System.out.println("Categoria do atleta: " + categoria);
                    }
                    break;

                case 4:
                    if (atleta == null) {
                        System.out.println("Cadastre um atleta primeiro.");
                    } else {
                        System.out.println("Atualize os dados do atleta:");
                        System.out.print("Novo nome: ");
                        atleta.setNome(scanner.nextLine());

                        System.out.print("Nova modalidade: ");
                        atleta.setModalidade(scanner.nextLine());

                        System.out.print("Nova idade: ");
                        atleta.setIdade(scanner.nextInt());

                        System.out.print("Novo peso (kg): ");
                        atleta.setPesoEmKg(scanner.nextDouble());

                        System.out.print("Nova altura (m): ");
                        atleta.setAlturaEmMetros(scanner.nextDouble());

                        System.out.println("Dados atualizados com sucesso!");
                    }
                    break;

                case 5:
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

            // Exibir os dados do atleta após cada operação, se houver
            if (atleta != null) {
                atleta.exibirInformacoes();
            }

        } while (opcao != 5);

        scanner.close();
    }
}
