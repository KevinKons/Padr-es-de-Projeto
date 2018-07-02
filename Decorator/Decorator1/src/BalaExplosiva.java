
public class BalaExplosiva extends ArmaDecorator {

    public BalaExplosiva(Arma arma) {
        super(arma);
    }

    @Override
    public void atirar() {
        super.atirar();
        System.out.println("KABUUUUUMMMMMM!");
    }
}
