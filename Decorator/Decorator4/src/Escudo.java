
/**
 *
 * @author Avell
 */
public class Escudo extends OrcDecorator {
    
    public Escudo(Orc orc) {
        super(orc);
    }
    
    @Override
    public void defender(int ataque) {
        orc.defender(ataque - 7);
    }
    
    
}
