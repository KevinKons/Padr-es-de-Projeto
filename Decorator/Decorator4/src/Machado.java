
/**
 *
 * @author Avell
 */
public class Machado extends OrcDecorator {
    
    public Machado(Orc orc) {
        super(orc);
    }
    
    @Override
    public int forcaAtaque() {
        return orc.forcaAtaque() + (sorteio.nextInt(4) + 1);
    }
    
    
    
}
