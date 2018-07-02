package Visitor;

import personagens.Arqueiro;
import personagens.Catapulta;
import personagens.Lanceiro;

/**
 *
 * @author Avell
 */
public class LanceiroAtaque implements VisitorAtaque {

    @Override
    public void atacar(Lanceiro lanceiro) {
        
    }

    @Override
    public void atacar(Arqueiro arqueiro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void atacar(Catapulta catapulta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
