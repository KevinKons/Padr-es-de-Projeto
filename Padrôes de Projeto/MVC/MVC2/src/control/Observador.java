    package control;

/**
 *
 * @author adilsonv
 */
public interface Observador {

    void notificarLimparCampos();

    void notificarProdutoAdicionado(String dadosProduto);

    void notificarTotalVenda(double totalVenda);
}
