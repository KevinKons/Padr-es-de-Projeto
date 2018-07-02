
/**
 *
 * @author Avell
 */
public class JoiaDaVida extends OrcDecorator {

    public JoiaDaVida(Orc orc) {
        super(orc);
    }

    @Override
    public void setSaude(double saude) {
        orc.setSaude(orc.getSaude() * 0.20 + orc.getSaude());
    }

}
