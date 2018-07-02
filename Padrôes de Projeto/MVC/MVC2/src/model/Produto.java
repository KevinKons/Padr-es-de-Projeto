package model;

/**
 *
 * @author adilsonv
 */
public class Produto {

    private int codigo;
    private String nome;
    private double precoUnit;

    public Produto(int codigo, String nome, double precoUnit) {
        super();
        this.codigo = codigo;
        this.nome = nome;
        this.precoUnit = precoUnit;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoUnit() {
        return precoUnit;
    }

    public void setPrecoUnit(double precoUnit) {
        this.precoUnit = precoUnit;
    }

}
