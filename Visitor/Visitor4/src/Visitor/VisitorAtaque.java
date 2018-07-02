
package Visitor;

import personagens.Arqueiro;
import personagens.Catapulta;
import personagens.Lanceiro;

/**
 *
 * @author Avell
 */
public interface VisitorAtaque {
    
    public void atacar(Lanceiro lanceiro);
    public void atacar(Arqueiro arqueiro);
    public void atacar(Catapulta catapulta);
    
    
}
