package conta;

public class ContaNegativa extends ContaEstado {

	public ContaNegativa(Conta conta) {
		super(conta);
	}

	@Override
	public String toString() {
		return "ContaNegativa";
	}
	
	@Override
	protected void doDeposito(double valor) throws Exception {
		this.conta.setSaldo(conta.getSaldo() + valor);
	}

	@Override
	protected void doSaque(double valor) throws Exception {
		this.conta.setSaldo(conta.getSaldo() + valor);
		// na verdade a mensagem abaixo deveria ser resolvida com Observer
		System.out.println("Conta negativa, aten\u00E7\u00E3o para o saldo");

	}

}
