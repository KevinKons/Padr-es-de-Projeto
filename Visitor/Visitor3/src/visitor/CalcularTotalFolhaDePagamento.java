package visitor;

import empresa.FuncNivelA;
import empresa.FuncNivelB;
import empresa.Gerente;

/**
 *
 * @author Avell
 */
public class CalcularTotalFolhaDePagamento implements FuncionarioVisitor {
    
    private double total = 0;
    
    @Override
    public void visit(Gerente gerente) {
        total += gerente.getSalario();
    }

    @Override
    public void visit(FuncNivelA funcionario) {
        total += funcionario.getSalario();
    }

    @Override
    public void visit(FuncNivelB funcionario) {
        total += funcionario.getSalario();
    }

    @Override
    public double getTotal() {
        return total;
    }

    
}
