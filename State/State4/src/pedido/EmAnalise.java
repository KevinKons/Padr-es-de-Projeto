package pedido;

/**
 *
 * @author Avell
 */
public class EmAnalise extends State {
    
    public EmAnalise(Pedido p) {
        super(p);
    }

    @Override
    public void aprovar() throws Exception {
        pedido.setEstado(new Aprovar(pedido));
    }

    @Override
    public void analisar() throws Exception {
        pedido.setEstado(new EmAnalise(pedido));
    }

    @Override
    public void suspender() throws Exception {
        pedido.setEstado(new Pendente(pedido));
    }

    @Override
    public void retomar() throws Exception {
        throw new Exception("Operação inválida");
    }

    @Override
    public void cancelar() throws Exception {
        pedido.setEstado(new Cancelar(pedido));
    }

    @Override
    public void atender() throws Exception {
        throw new Exception("Operação inválida");
    }
    
}
