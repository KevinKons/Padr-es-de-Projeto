
import java.util.Random;


/**
 *
 * @author Avell
 */
public abstract class Orc {
    
    protected static Random sorteio = new Random();
    
    public abstract double getSaude();
    public abstract void setSaude(double saude);
    public abstract int forcaAtaque();
    public abstract void defender(int ataque);
}
