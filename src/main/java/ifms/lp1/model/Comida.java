package ifms.lp1.model;

public class Comida extends Produto{

    private static final double TAXADESERVICO = 0.1;

    public Comida(int codigo, String descricao, double preco) {
        super(codigo, descricao, preco);
    }

    @Override
    public double calcularPrecoFinal() {
        return super.calcularPrecoFinal() + super.calcularPrecoFinal() * TAXADESERVICO;
    }
}
