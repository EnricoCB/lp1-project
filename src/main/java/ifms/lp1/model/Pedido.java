package ifms.lp1.model;

public class Pedido {
    private Produto produto;
    private int quantidade;


    public Produto getProduto() {
        return produto;
    }


    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
