package pedido;

import java.util.ArrayList;
import java.util.List;

import visitor.Visitor;

public class Pedido {

    private List<ItemPedido> itensPedido = new ArrayList<>();

    public void addItemPedido(ItemPedido itemPedido) {
        itensPedido.add(itemPedido);
    }

    public void accept(Visitor visitor) throws Exception {
        for (ItemPedido item : itensPedido) {
            visitor.visit(item);
        }

    }
}
