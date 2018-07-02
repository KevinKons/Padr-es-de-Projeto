package empresa;

import visitor.FuncionarioVisitor;

public abstract class Funcionario {

    private String nome;
    private double salario;
    private int feriasAGozar;
    private String tipo;

    public Funcionario(String nome, double salario, int feriasAGozar, String tipo) {
        this.nome = nome;
        this.salario = salario;
        this.feriasAGozar = feriasAGozar;
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }
    
    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getFeriasAGozar() {
        return feriasAGozar;
    }

    public void setFeriasAGozar(int feriasAGozar) {
        this.feriasAGozar = feriasAGozar;
    }
    
    public abstract void accept(FuncionarioVisitor visitor);
}
