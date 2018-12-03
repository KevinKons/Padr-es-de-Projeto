
import java.util.ArrayList;
import java.util.List;


public class Revista {
    
    private String nome;
    private List<ObservadorRevista> observadores = new ArrayList<>();
    private List<Edicao> edicoes = new ArrayList<>();
    
    public Revista(String nome) {
        this.nome = nome;
    }
    
    public void lancarNovaEdicao(int edicao) {
        edicoes.add(new Edicao(edicao));
        notificar();
    }

    public List<Edicao> getEdicoes() {
        return edicoes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void anexar(ObservadorRevista obsRevista) {
        observadores.add(obsRevista);
    }
    
    public void desanexar(ObservadorRevista obsRevista) {
        observadores.remove(obsRevista);
    }
    
    public void notificar() {
        for(ObservadorRevista or : observadores) {
            or.atualizar(this);
        }
    }
}
