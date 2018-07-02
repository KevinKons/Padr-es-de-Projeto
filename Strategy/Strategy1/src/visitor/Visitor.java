package visitor;

import pedido.ItemPedido;

public interface Visitor {

    void visit(ItemPedido itemPedido) throws Exception;

}
