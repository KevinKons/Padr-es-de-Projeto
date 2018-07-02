
package Controller;

import Model.Animal;
import Model.Consulta;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Avell
 */
public interface AgendamentosControle extends Observado{
    
    List<String> getAgendamentosDoDia(LocalDate data);
    
    void iniciarAgendamento();
    
    void buscar(long id) throws Exception;
    
    void setData(LocalDate LocalDate);
    
    void finalizaAgendamento(int horarioSelecionado);
    
}
