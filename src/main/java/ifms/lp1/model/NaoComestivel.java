package ifms.lp1.model;

public class NaoComestivel extends Produto{
    private static final double TAXADESERVICO = 0.0;

    public NaoComestivel(int codigo, String descricao, double preco) {
        super(codigo, descricao, preco);
    }
}
