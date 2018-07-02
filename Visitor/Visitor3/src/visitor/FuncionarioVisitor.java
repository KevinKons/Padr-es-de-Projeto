package visitor;

import empresa.FuncNivelA;
import empresa.FuncNivelB;
import empresa.Gerente;

public interface FuncionarioVisitor {

    void visit(Gerente gerente);

    void visit(FuncNivelA funcionario);

    void visit(FuncNivelB funcionario);
    
    double getTotal();
    
}
