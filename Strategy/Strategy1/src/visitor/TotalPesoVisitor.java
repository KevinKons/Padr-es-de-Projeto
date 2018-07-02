package visitor;

import pedido.ItemPedido;

public class TotalPesoVisitor implements Visitor {

    private double valor;

    @Override
    public void visit(ItemPedido itemPedido) throws Exception {
        valor += itemPedido.getProduto().getPeso();
    }

    public double getValor() {
        return valor;
    }

}
