package personagens;

import Visitor.VisitorAtaque;

public abstract class Personagem {

    private int pontoVida;
    private int forcaAtaque;

    public Personagem(int pontoVida, int forcaAtaque) {
        this.pontoVida = pontoVida;
        this.forcaAtaque = forcaAtaque;
    }

    public int getPontoVida() {
        return pontoVida;
    }

    public void setPontoVida(int pontoVida) {
        this.pontoVida = pontoVida;
    }

    public int getForcaAtaque() {
        return forcaAtaque;
    }

    public abstract void receberAtaque(VisitorAtaque visitor);
}
