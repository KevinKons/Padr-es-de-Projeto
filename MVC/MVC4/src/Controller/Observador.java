
package Controller;

import Model.Animal;
import Model.Consulta;
import java.util.List;

/**
 *
 * @author Avell
 */
public interface Observador {
    
    void notificaDataEscolhida(String linha);
    
    void limparCampos();
    
    void setInformacoes(Animal animal);

    public void notificarHorarioOcupado();
    
    void notificarInicioDeConsulta();
    
    
}
