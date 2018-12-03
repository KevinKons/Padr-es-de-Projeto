package control;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author adilsonv77
 */
public class CalculadoraSimples implements CalculadoraControl {

    private List<Observador> observadores = new ArrayList<>();

    @Override
    public int somar(int val1, int val2) {
        int res = val1 + val2;
        
        for (Observador obs:observadores)
            obs.notificar(res);
        
        return res;
    }

    @Override
    public void addObservador(Observador obs) {
        this.observadores.add(obs);
    }

    @Override
    public void removerObservador(Observador obs) {
        this.observadores.remove(obs);
    }
    
}
