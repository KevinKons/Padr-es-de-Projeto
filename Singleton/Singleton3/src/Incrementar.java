
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Avell
 */
public class Incrementar {
    
    private Incrementar(){}
    
    private static Incrementar instance;
    
    public synchronized static Incrementar getInstance() {
        if(instance == null) 
            instance = new Incrementar();
        
        return instance;
    }
    
    private int conta = 0;
    private List<Observador> obss = new ArrayList<>();
    
    public void addObservador(Observador o) {
        obss.add(o);
    }
    
    public void inc() {
        conta++;
        for(Observador o : obss) {
            o.atualizar(conta);
        }
    }

    public int getConta() {
        return conta;
    }
    
}
