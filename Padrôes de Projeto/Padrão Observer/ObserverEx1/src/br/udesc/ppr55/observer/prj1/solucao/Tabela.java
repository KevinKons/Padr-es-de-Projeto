package br.udesc.ppr55.observer.prj1.solucao;

public class Tabela implements Observador {

	private int valorA, valorB, valorC; 
	
	public Tabela(Dados dados) {
		this.valorA = dados.getValorA();
		this.valorB = dados.getValorB();
		this.valorC = dados.getValorC();
	}
	
	private void atualizar() {
        System.out.println("Tabela:\nValor A: " + valorA
                + "\nValor B: " + valorB + "\nValor C: "
                + valorC);
    }

	@Override
	public void atualizarValorA(int valorA) {
		this.valorA = valorA;
		atualizar();
	}

	@Override
	public void atualizarValorB(int valorB) {
		this.valorB = valorB;
		atualizar();
	}

	@Override
	public void atualizarValorC(int valorC) {
		this.valorC = valorC;
		atualizar();
	}

}
