package pedido;


import pedido.Pedido;

/**
 *
 * @author Avell
 */
public abstract class State {
    
    protected Pedido pedido;
    
    public State(Pedido p) {
        this.pedido = p;
    }
    
    public abstract void aprovar() throws Exception;
    public abstract void analisar() throws Exception;
    public abstract void suspender() throws Exception;
    public abstract void retomar() throws Exception;
    public abstract void cancelar() throws Exception;
    public abstract void atender() throws Exception;
}
