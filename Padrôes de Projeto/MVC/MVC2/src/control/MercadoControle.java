package control;

import model.Produto;

/**
 *
 * @author adilsonv
 */
public interface MercadoControle extends Observado {

    /**
     * Inicia um novo objeto de venda.
     */
    void iniciarNovaVenda();

    /**
     * Busca um produto da base. Se nao existir dispara uma excecao.
     */
    Produto buscar(int codigo) throws Exception;

    /**
     * Adiciona o produto na venda. Se nao existir dispara uma excecao.
     */
    void adicionar(int codigo) throws Exception;

    /**
     * Salva a venda na base e limpa os campos da tela.
     */
    void finalizarVenda();

    /**
     * Calcula o total das vendas.
     */
    double getTotalGeralVendas();

}
