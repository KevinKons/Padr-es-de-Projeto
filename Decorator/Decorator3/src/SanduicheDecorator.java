/**
 *
 * @author Avell
 */
public abstract class SanduicheDecorator extends Sanduiche {
    
    protected Sanduiche sanduiche;  

    public SanduicheDecorator(Sanduiche sanduiche) {
        this.sanduiche = sanduiche;
    }

    @Override
    public abstract String toString();
    
    @Override
    public abstract double getPreco();
}
