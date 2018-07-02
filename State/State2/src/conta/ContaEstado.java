package conta;

public abstract class ContaEstado {

    protected Conta conta;

    public ContaEstado(Conta conta) {
        this.conta = conta;
    }

    public final void deposito(double valor) throws Exception {
        doDeposito(valor);
        proxEstado();
    }

    public final void saque(double valor) throws Exception {
        doSaque(valor);
        proxEstado();
    }

    protected abstract void doDeposito(double valor) throws Exception;
    protected abstract void doSaque(double valor) throws Exception;

    protected void proxEstado() {
        if (conta.getSaldo() <= -1000) {
            conta.setEstado(new ContaBloqueada(conta));
        } else {
            if (conta.getSaldo() < 0) {
                conta.setEstado(new ContaNegativa(conta));
            } else {
                conta.setEstado(new ContaHabilitada(conta));
            }
        }

    }

}
