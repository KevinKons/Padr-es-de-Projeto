
public abstract class ArmaDecorator implements Arma {

    private Arma arma;

    public ArmaDecorator(Arma arma) {
        this.arma = arma;
    }

    @Override
    public void atirarComCalma() {
        alcanceVisao();
        atirar();
    }

    @Override
    public void atirar() {
        this.arma.atirar();
    }

    @Override
    public void alcanceVisao() {
        this.arma.alcanceVisao();
    }

}
