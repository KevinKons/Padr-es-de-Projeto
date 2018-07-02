package pedido;

public class Pedido {

    private State state;

    public void setEstado(State estado) {
        this.state = estado;
    }

    public Pedido() {

    }

    public void analisar() throws Exception {
        state.analisar();
    }

    public void suspender() throws Exception {
        state.suspender();
    }

    public void retomar() throws Exception {
        state.retomar();
    }

    public void cancelar() throws Exception {
        state.cancelar();
    }

    public void aprovar() throws Exception {
        state.aprovar();
    }

    public void atender() throws Exception {
        state.atender();
    }
}
