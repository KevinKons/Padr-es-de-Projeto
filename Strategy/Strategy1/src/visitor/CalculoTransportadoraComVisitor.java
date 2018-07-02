package visitor;

import pedido.Pedido;
import strategy.CalculoFrete;

public class CalculoTransportadoraComVisitor implements CalculoFrete {

    @Override
    public double calcular(Pedido pedido) throws Exception {
        TotalDimensoesVisitor tdv = new TotalDimensoesVisitor();
        TotalPesoVisitor tpv = new TotalPesoVisitor();

        pedido.accept(tdv);
        pedido.accept(tpv);

        return (tdv.getValor() * 0.3) + (tpv.getValor() * 1.2);
    }

}
