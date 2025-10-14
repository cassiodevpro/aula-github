import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nome do animal: ");
        String nome = scanner.nextLine();
        System.out.print("Digite a espécie do animal (cachorro/gato): ");
        String especie = scanner.nextLine();
        System.out.print("Digite a idade do animal (em anos): ");
        int idade = scanner.nextInt();
        System.out.print("Digite o peso do animal (em kg): ");
        double peso = scanner.nextDouble();

        Animal animal = new Animal(nome, especie, idade, peso);
        animal.calcularIdadeHumana();
        animal.classificarporte();
        System.out.print("Digite o novo peso do animal (em kg) para atualizar: ");
        double novoPeso = scanner.nextDouble();
        animal.atualizarPeso(novoPeso);
        animal.classificarporte();
    }
}
