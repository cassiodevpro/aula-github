package produtos;
public class Produtos {

    private String nome;
    private String codigo;
    private int quantidade;
    private double precoUnitario;

    public Produtos(){

    }

    public Produtos(String nome, String codigo, int quantidade, double precoUnitario) {
        this.nome = nome;
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }
    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            this.quantidade += quantidade;
        } else {
            System.out.println("Quantidade inválida para adicionar.");
        }
    }


    public void removerEstoque(int quantidade) {
        if (quantidade > 0 && quantidade <= this.quantidade) {
            this.quantidade -= quantidade;
        } else {
            System.out.println("Quantidade inválida para remover.");
        }
    }

    public double calcularValorEstoque() {
        return this.quantidade * this.precoUnitario;
    }


    public void exibirProduto() {
        System.out.println("Produto: " + nome);
        System.out.println("Código: " + codigo);
        System.out.println("Quantidade em estoque: " + quantidade);
        System.out.println("Preço unitário: R$ " + precoUnitario);
    }
}
