package ifms.lp1.model;

public class Bebida extends Produto {

    private static final double TAXADESERVICO = 0.05;

    public Bebida(int codigo, String descricao, double preco) {
        super(codigo, descricao, preco);
    }

    @Override
    public double calcularPrecoFinal() {
        return super.calcularPrecoFinal() + super.calcularPrecoFinal() * TAXADESERVICO;
    }
}
