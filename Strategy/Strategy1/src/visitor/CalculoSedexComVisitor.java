package visitor;

import pedido.Pedido;
import strategy.CalculoFrete;

public class CalculoSedexComVisitor implements CalculoFrete {

    @Override
    public double calcular(Pedido pedido) throws Exception {
        TotalPesoVisitor tpv = new TotalPesoVisitor();
        pedido.accept(tpv);
        return tpv.getValor() * 3;
    }
;

}
