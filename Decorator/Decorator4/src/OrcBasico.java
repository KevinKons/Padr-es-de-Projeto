
import java.util.Random;

public class OrcBasico extends Orc {

    public OrcBasico() {
        setSaude(100);
    }

    private static Random sorteio = new Random();

    private double saude;

    @Override
    public double getSaude() {
        return saude;
    }

    @Override
    public void setSaude(double saude) {
        this.saude = saude;
    }

    @Override
    public int forcaAtaque() {
        return sorteio.nextInt(6);
    }

    @Override
    public void defender(int ataque) {
        int porrada = ataque - sorteio.nextInt(2);
        if (porrada > 0) {
            saude -= porrada;
        }
    }


}
