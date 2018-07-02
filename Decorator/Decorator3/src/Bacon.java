
/**
 *
 * @author Avell
 */
public class Bacon extends SanduicheDecorator{

    public Bacon(Sanduiche sanduiche) {
        super(sanduiche);
    }

    @Override
    public String toString() {
        return "Bacon " + sanduiche.toString();
    }

    @Override
    public double getPreco() {
        return 1.25 + sanduiche.getPreco();
    }
    
}
