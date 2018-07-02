/**
 *
 * @author Avell
 */
public class Hamburguer extends SanduicheDecorator {

    public Hamburguer(Sanduiche sanduiche) {
        super(sanduiche);
    }
    

    @Override
    public String toString() {
        return "Hamburguer " + sanduiche.toString();
    }

    @Override
    public double getPreco() {
        return 2 + sanduiche.getPreco();
    }
    
}
