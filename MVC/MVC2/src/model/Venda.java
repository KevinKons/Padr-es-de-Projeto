package model;

import java.util.HashMap;
import java.util.Map;

public class Venda {

    private Map<Produto, Double> produtos = new HashMap<>();

    public void addProduto(Produto produto) {
        Double qtant = produtos.get(produto);
        if (qtant == null) {
            produtos.put(produto, 1.0);
        } else {
            produtos.put(produto, qtant + 1.0);
        }
    }

    public Double getTotal() {
        double total = 0;
        for (Produto p : produtos.keySet()) {
            total += p.getPrecoUnit() * produtos.get(p);
        }
        return total;
    }

}
