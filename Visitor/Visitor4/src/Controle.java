
import Visitor.LanceiroAtaque;
import Visitor.VisitorAtaque;
import java.util.ArrayList;
import java.util.List;
import personagens.Arqueiro;
import personagens.Catapulta;
import personagens.Lanceiro;
import personagens.Personagem;


/**
 *
 * @author Avell
 */
public class Controle {
    
    public static void main(String[] args) {
        List<Personagem> personagens = new ArrayList<>();
        
        Personagem atacante = new Arqueiro();
        
        personagens.add(atacante);
        personagens.add(new Catapulta());
        personagens.add(new Lanceiro());
        
        VisitorAtaque lanceiroAtaque = new LanceiroAtaque();
        
        for(Personagem p : personagens) {
            
        }
    }
}
