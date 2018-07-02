
import java.util.ArrayList;
import java.util.List;


public class Edicao {

    private int numero;
    private List<Artigo> artigos = new ArrayList<>();
    
    public Edicao(int edicao) {
        numero = edicao;
    }

    public List<Artigo> getArtigos() {
        return artigos;
    }

    public void addArtigos(Artigo artigo) {
        artigos.add(artigo);
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    
    
}
