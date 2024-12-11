package ifms.lp1.model;

public abstract class Produto {
    private int codigo;
    private String descricao;
    private double preco;

    public Produto(){}

    public Produto(int codigo, String descricao, double preco) {
        this.codigo = codigo;
        this.descricao = descricao;
        this.preco = preco;
    }

    public double calcularPrecoFinal(){
        return preco;
    }
}
