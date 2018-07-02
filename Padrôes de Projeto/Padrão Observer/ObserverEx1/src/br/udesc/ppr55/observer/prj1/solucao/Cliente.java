package br.udesc.ppr55.observer.prj1.solucao;

public class Cliente {

    public static void main(String[] args) {
        Dados dados = new Dados(7, 3, 1);
        dados.anexar(new Tabela(dados));
        dados.anexar(new GraficoBarra(dados));
        
        dados.setValorA(10);
        dados.setValorB(20);
        dados.setValorC(15);
    }
}
