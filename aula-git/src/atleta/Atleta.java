public class Atleta {
    private String nome;
    private String modalidade;
    private int idade;
    private double pesoEmKg;
    private double alturaEmMetros;

    public Atleta() {}

    public Atleta(String nome, String modalidade, int idade, double pesoEmKg, double alturaEmMetros) {
        this.nome = nome;
        this.modalidade = modalidade;
        this.idade = idade;
        this.pesoEmKg = pesoEmKg;
        this.alturaEmMetros = alturaEmMetros;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getPesoEmKg() {
        return pesoEmKg;
    }

    public void setPesoEmKg(double pesoEmKg) {
        this.pesoEmKg = pesoEmKg;
    }

    public double getAlturaEmMetros() {
        return alturaEmMetros;
    }

    public void setAlturaEmMetros(double alturaEmMetros) {
        this.alturaEmMetros = alturaEmMetros;
    }

    public double calcularIMC() {
        if (alturaEmMetros > 0) {
            return pesoEmKg / (alturaEmMetros * alturaEmMetros);
        } else {
            return 0;
        }
    }

    public String classificarCategoria() {
        if (idade <= 12) {
            return "Infantil";
        } else if (idade <= 17) {
            return "Juvenil";
        } else if (idade <= 35) {
            return "Adulto";
        } else {
            return "Veterano";
        }
    }

    public void exibirInformacoes() {
        System.out.println("\n--- INFORMAÇÕES DO ATLETA ---");
        System.out.println("Nome: " + nome);
        System.out.println("Modalidade: " + modalidade);
        System.out.println("Idade: " + idade);
        System.out.printf("Peso: %.2f kg\n", pesoEmKg);
        System.out.printf("Altura: %.2f m\n", alturaEmMetros);
    }
}
