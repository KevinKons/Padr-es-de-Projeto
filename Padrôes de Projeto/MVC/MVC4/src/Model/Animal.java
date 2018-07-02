
package Model;

/**
 *
 * @author Avell
 */
public class Animal {
    
    private long id;
    private String nome;
    private String dono;

    public Animal(long id, String nome, String dono) {
        this.id = id;
        this.nome = nome;
        this.dono = dono;
    }

    public Animal() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }
    
    
}
