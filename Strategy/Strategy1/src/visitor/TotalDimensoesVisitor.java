package visitor;

import pedido.ItemPedido;

public class TotalDimensoesVisitor implements Visitor {

    private double valor;

    @Override
    public void visit(ItemPedido itemPedido) throws Exception {
        valor += itemPedido.getProduto().getDimensoes();
    }

    public double getValor() {
        return valor;
    }

}
