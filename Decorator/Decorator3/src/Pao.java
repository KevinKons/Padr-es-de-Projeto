
/**
 *
 * @author Avell
 */
public class Pao extends SanduicheDecorator {

    public Pao(Sanduiche sanduiche) {
        super(sanduiche);
    }

    @Override
    public String toString() {
        return "pao " + sanduiche.toString();
    }

    @Override
    public double getPreco() {
        return 0.5 + sanduiche.getPreco();
    }
    
}
