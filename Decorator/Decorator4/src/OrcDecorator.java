
/**
 *
 * @author Avell
 */
public class OrcDecorator extends Orc {
    
    protected Orc orc;

    public OrcDecorator(Orc orc) {
        this.orc = orc;
    }

    @Override
    public double getSaude() {
        return orc.getSaude();
    }

    @Override
    public void setSaude(double saude) {
        orc.setSaude(saude);
    }

    @Override
    public int forcaAtaque() {
        return orc.forcaAtaque();
    }

    @Override
    public void defender(int ataque) {
        orc.defender(ataque);
    }
    
}
