
public class Repeticao extends ArmaDecorator {

    public Repeticao(Arma arma) {
        super(arma);
    }

    @Override
    public void atirar() {
        for (int i = 1; i <= 5; i++) {
            super.atirar();
        }
    }

}
