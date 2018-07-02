package empresa;

import visitor.FuncionarioVisitor;

public class Gerente extends Funcionario {

    public Gerente(String nome, double salario) {
        super(nome, salario, 25, "G");
    }

    @Override
    public void accept(FuncionarioVisitor visitor) {
        visitor.visit(this);
    }

}
