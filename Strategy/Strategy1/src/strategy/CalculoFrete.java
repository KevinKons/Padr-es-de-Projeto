package strategy;

import pedido.Pedido;

public interface CalculoFrete {

    double calcular(Pedido pedido) throws Exception;

}
