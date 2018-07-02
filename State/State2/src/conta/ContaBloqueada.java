package conta;

public class ContaBloqueada extends ContaEstado {

    public ContaBloqueada(Conta conta) {
        super(conta);
    }

    @Override
    public String toString() {
        return "ContaBloqueada";
    }

    @Override
    protected void doDeposito(double valor) throws Exception {
        this.conta.setSaldo(conta.getSaldo() + valor);
    }

    @Override
    protected void doSaque(double valor) throws Exception {
        throw new Exception("Conta bloqueada, n\u00E3o \u00E9 poss\u00EDvel fazer saque");

    }

}
