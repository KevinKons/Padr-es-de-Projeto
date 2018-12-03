package control;

/**
 *
 * @author adilsonv
 */
public interface Observado {
    
    void addObservador(Observador obs);
    void removerObservador(Observador obs);
    
}
