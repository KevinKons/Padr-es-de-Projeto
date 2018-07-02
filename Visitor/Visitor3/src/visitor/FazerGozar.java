package visitor;

import empresa.FuncNivelA;
import empresa.FuncNivelB;
import empresa.Gerente;

/**
 *
 * @author Avell
 */
public class FazerGozar implements FuncionarioVisitor {

    private double total = 0;
    
    @Override
    public void visit(Gerente gerente) {
        gerente.setFeriasAGozar(gerente.getFeriasAGozar() - 10);
        total++;
    }

    @Override
    public void visit(FuncNivelA funcionario) {
        if(funcionario.getSalario() >= 5000) {
            funcionario.setFeriasAGozar(funcionario.getFeriasAGozar() - 10);
            total++;
        }           
    }

    @Override
    public void visit(FuncNivelB funcionario) {
        if(funcionario.getSalario() >= 1500) {
            funcionario.setFeriasAGozar(funcionario.getFeriasAGozar() - 5);
            total++;
        }
    }

    @Override
    public double getTotal() {
        return total;
    }

}
