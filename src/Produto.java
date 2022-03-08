import java.math.BigDecimal;

public class Produto {

    private String nome;
    private String marca;
    private String origem;
    private String codigo;
    private int quantidade;
    private BigDecimal preco;

    public Produto(String nome, String marca, String origem, String codigo, int quantidade, BigDecimal preco) {
        this.nome = nome;
        this.marca = marca;
        this.origem = origem;
        this.codigo = codigo;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getCodigo() {
        return codigo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getPreco() {
        return preco;
    }

    public void setPreco(BigDecimal preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", marca='" + marca + '\'' +
                ", origem='" + origem + '\'' +
                ", codigo='" + codigo + '\'' +
                ", quantidade=" + quantidade +
                ", preco=" + preco +
                '}';
    }
}