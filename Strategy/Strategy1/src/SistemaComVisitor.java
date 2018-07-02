
import pedido.ItemPedido;
import pedido.Pedido;
import pedido.Produto;
import visitor.CalculoSedexComVisitor;
import visitor.CalculoTransportadoraComVisitor;

public class SistemaComVisitor {

    public static void main(String[] args) throws Exception {

        Produto p1 = new Produto("Chocolate", 0.1, 0.01);
        Produto p2 = new Produto("Leite", 1, 0.3);

        Pedido p = new Pedido(new CalculoSedexComVisitor());
        p.addItemPedido(new ItemPedido(p1, 10, 0.9));
        p.addItemPedido(new ItemPedido(p2, 24, 1.5));

        System.out.println(p.calcularFrete());

        p.setCalculoFrete(new CalculoTransportadoraComVisitor());
        System.out.println(p.calcularFrete());
    }

}
