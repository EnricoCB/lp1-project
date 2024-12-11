package ifms.lp1.model;

import java.util.List;

public class Mesa {
    private int numero;
    private List<Pedido> pedidos;
    private boolean aberta;

    public void adicionarPedido(Pedido pedido) {
            pedidos.add(pedido);
    }

    public double calcularValorParcial(){
        double valor = 0;
        for (Pedido pedido : pedidos) {
            valor += pedido.getProduto().calcularPrecoFinal();
        }
        return valor;
    }

    public double fecharMesa(){
        return calcularValorParcial();
    }
}
