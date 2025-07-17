package entities;

public class ItemsPedido {

    private Integer quantidade;
    private Double preco;

    public ItemsPedido() {
    }

    public ItemsPedido(Integer quantidade, Double preco) {
        this.quantidade = quantidade;
        this.preco = preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public double subTotal(){
        return quantidade * preco;
    }
}
