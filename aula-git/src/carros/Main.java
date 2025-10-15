import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Veiculo veiculo = null;
        int opcao;

        do {
            System.out.println("\n--- MENU VEÍCULO ---");
            System.out.println("1. Cadastrar veículo");
            System.out.println("2. Atualizar quilometragem");
            System.out.println("3. Calcular idade do veículo");
            System.out.println("4. Exibir informações do veículo");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar buffer

            switch (opcao) {
                case 1:
                    System.out.print("Modelo: ");
                    String modelo = scanner.nextLine();

                    System.out.print("Marca: ");
                    String marca = scanner.nextLine();

                    System.out.print("Ano: ");
                    int ano = scanner.nextInt();

                    System.out.print("Quilometragem: ");
                    double km = scanner.nextDouble();

                    veiculo = new Veiculo(modelo, marca, ano, km);
                    System.out.println("Veículo cadastrado com sucesso!");
                    break;

                case 2:
                    if (veiculo == null) {
                        System.out.println("Cadastre um veículo primeiro.");
                        break;
                    }
                    System.out.print("Informe a nova quilometragem: ");
                    double novaKm = scanner.nextDouble();
                    veiculo.atualizarQuilometragem(novaKm);
                    break;

                case 3:
                    if (veiculo == null) {
                        System.out.println("Cadastre um veículo primeiro.");
                        break;
                    }
                    int idade = veiculo.calcularIdadeVeiculo();
                    System.out.println("Idade do veículo: " + idade + " anos");
                    break;

                case 4:
                    if (veiculo == null) {
                        System.out.println("Cadastre um veículo primeiro.");
                        break;
                    }
                    veiculo.exibirInformacoes();
                    break;

                case 5:
                    System.out.println("Saindo do programa. Até logo!");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 5);

        scanner.close();
    }
}
