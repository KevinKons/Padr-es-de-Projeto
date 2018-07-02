package cartao;

/**
 *
 * @author Avell
 */
public class CartaoBloqueado extends CartaoEstado {

    @Override
    public void entrarPin(String pin) throws Exception {
        throw new Exception("Cartão bloqueado.");
    }

    @Override
    public void fazerPagamento() throws Exception {
        throw new Exception("Cartão bloqueado");
    }
    
}
