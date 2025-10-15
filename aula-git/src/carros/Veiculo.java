import java.time.Year;

public class Veiculo {
    private String modelo;
    private String marca;
    private int ano;
    private double quilometragem;

    public Veiculo() {}

    public Veiculo(String modelo, String marca, int ano, double quilometragem) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.quilometragem = quilometragem;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public double getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }

    public int calcularIdadeVeiculo() {
        int anoAtual = Year.now().getValue();
        return anoAtual - ano;
    }

    public void atualizarQuilometragem(double novaQuilometragem) {
        if (novaQuilometragem > this.quilometragem) {
            this.quilometragem = novaQuilometragem;
        } else {
            System.out.println("A nova quilometragem deve ser maior que a atual.");
        }
    }

    public void exibirInformacoes() {
        System.out.println("\n--- INFORMAÇÕES DO VEÍCULO ---");
        System.out.println("Modelo: " + modelo);
        System.out.println("Marca: " + marca);
        System.out.println("Ano: " + ano);
        System.out.printf("Quilometragem: %.2f km\n", quilometragem);
        System.out.println("Idade do veículo: " + calcularIdadeVeiculo() + " anos");
    }
}
