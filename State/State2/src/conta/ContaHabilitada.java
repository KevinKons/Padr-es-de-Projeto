package conta;

public class ContaHabilitada extends ContaEstado {

    public ContaHabilitada(Conta conta) {
        super(conta);
    }

    @Override
    public String toString() {
        return "ContaHabilitada";
    }

    @Override
    protected void doDeposito(double valor) throws Exception {
        this.conta.setSaldo(conta.getSaldo() + valor);

    }

    @Override
    protected void doSaque(double valor) throws Exception {
        this.conta.setSaldo(conta.getSaldo() - valor);

    }

}
