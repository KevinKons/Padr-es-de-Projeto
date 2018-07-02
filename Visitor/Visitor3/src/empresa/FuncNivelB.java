package empresa;

import visitor.FuncionarioVisitor;

public class FuncNivelB extends Funcionario {

    public FuncNivelB(String nome, double salario) {
        super(nome, salario, 30, "B");
    }

    @Override
    public void accept(FuncionarioVisitor visitor) {
        visitor.visit(this);
    }

}
