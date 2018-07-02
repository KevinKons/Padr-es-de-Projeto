package empresa;

import java.util.HashSet;
import java.util.Set;
import visitor.FuncionarioVisitor;

public class Setor {

    // usei set para garantir que n�o existam funcionarios repetidos
    private Set<Funcionario> funcionarios = new HashSet<>();

    public void add(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    private Gerente gerente;

    public Gerente getGerente() {
        return gerente;
    }

    public void setGerente(Gerente gerente) {
        this.gerente = gerente;
        funcionarios.add(gerente);
    }
    
    public void accept(FuncionarioVisitor v) {
        for(Funcionario f : funcionarios) {
            f.accept(v);
        }
    }
}
