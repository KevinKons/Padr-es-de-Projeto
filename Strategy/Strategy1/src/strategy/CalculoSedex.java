package strategy;

import pedido.ItemPedido;
import pedido.Pedido;

public class CalculoSedex implements CalculoFrete {

    @Override
    public double calcular(Pedido pedido) {
        double total = 0;
        for (ItemPedido item : pedido.getItensPedido()) {
            total += item.getProduto().getPeso();
        }
        return total * 3;
    }
;

}
