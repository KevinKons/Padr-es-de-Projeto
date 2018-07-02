
/**
 *
 * @author Avell
 */
public class Main {
 
    public static void main(String[] args) {
        Orc orc = new OrcBasico();
        
        Orc machado = new Machado(orc);
        System.out.println(machado.forcaAtaque());
        
        Orc escudo = new Escudo(machado);
        System.out.println(escudo.forcaAtaque());
        escudo.defender(10);
        System.out.println(orc.getSaude());
        
        Orc joiaDaVida = new JoiaDaVida(escudo);
        joiaDaVida.setSaude(joiaDaVida.getSaude());
        System.out.println(joiaDaVida.getSaude());
    }

}
