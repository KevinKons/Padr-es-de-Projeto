
/**
 *
 * @author Avell
 */
public class HamburguerDeCostela extends SanduicheDecorator {

    public HamburguerDeCostela(Sanduiche sanduiche) {
        super(sanduiche);
    }

    @Override
    public String toString() {
        return "Hamburguer de costela " + sanduiche.toString();
    }

    @Override
    public double getPreco() {
        return 3 + sanduiche.getPreco();
    }
    
}
