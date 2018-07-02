package empresa;

import visitor.FuncionarioVisitor;

public class FuncNivelA extends Funcionario {

    public FuncNivelA(String nome, double salario) {
        super(nome, salario, 35, "A");
    }

    @Override
    public void accept(FuncionarioVisitor visitor) {
        visitor.visit(this);
    }


}
