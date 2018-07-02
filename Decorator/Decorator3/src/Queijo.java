
/**
 *
 * @author Avell
 */
public class Queijo extends SanduicheDecorator {

    public Queijo(Sanduiche sanduiche) {
        super(sanduiche);
    }

    @Override
    public String toString() {
        return "Queijo " + sanduiche.toString();
    }

    @Override
    public double getPreco() {
        return 0.75 + sanduiche.getPreco();
    }
    
}
