public class Animal {

    private String nome;
    private String especie;
    private int idade;
    private double peso;

    public Animal(String nome, String especie, int idade, double peso) {
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public String getEspecie() {
        return especie;
    }

    public int getIdade() {
        return idade;
    }

    public double getPeso() {
        return peso;
    }
    public void calcularIdadeHumana(){
        int idadeHumana = 0;
        if (especie.equalsIgnoreCase("cachorro")) {
            idadeHumana = idade * 7;
        } else if (especie.equalsIgnoreCase("gato")) {
            idadeHumana = idade * 6;
        } else {
            System.out.println("Especie desconhecida para calcular idade humana.");
            return;
        }
        System.out.println("A idade humana de " + nome + " é: " + idadeHumana + " anos.");
    }
    public void atualizarPeso(double novoPeso){
        if (novoPeso > 0) {
            this.peso = novoPeso;
            System.out.println("Peso atualizado para: " + novoPeso + " kg.");
        } else {
            System.out.println("Peso inválido. O peso deve ser maior que zero.");
        }
    }
    public void classificarporte(){
        String porte;
        if (peso < 5) {
            porte = "Pequeno";
        } else if (peso <= 20) {
            porte = "Médio";
        } else {
            porte = "Grande";
        }
        System.out.println("O porte de " + nome + " é: " + porte);
    }   

}
