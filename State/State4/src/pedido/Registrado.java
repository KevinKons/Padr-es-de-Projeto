package pedido;

/**
 *
 * @author Avell
 */
public class Registrado extends State {

    public Registrado(Pedido p) {
        super(p);
    }

    @Override
    public void aprovar() throws Exception {
        throw new Exception("Operação inválida");
    }

    @Override
    public void analisar() throws Exception {
        pedido.setEstado(new EmAnalise(pedido));
    }

    @Override
    public void suspender() throws Exception {
        throw new Exception("Operação inválida");
    }

    @Override
    public void retomar() throws Exception {
        throw new Exception("Operação inválida");
    }

    @Override
    public void cancelar() throws Exception {
        throw new Exception("Operação inválida");
    }

    @Override
    public void atender() throws Exception {
        throw new Exception("Operação inválida");
    }
    
}
