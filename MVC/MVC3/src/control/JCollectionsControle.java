
package control;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author Avell
 + Armazanena e gerencia as informações contidas na table em JCollecions.    
 + É uma classe observada pois sempre que as informações contidas nesta classe 
 são alteradas o table necessitada ser avisado para poder se atualizar.
*/
public class JCollectionsControle implements Controle { //Observado

    private List<Observador> observadores = new ArrayList<>();
    private List<Object[]> conteudoLinhas = new ArrayList<>(); 
    private int linhaSelecionada;

    public JCollectionsControle() {
    }
    
    @Override
    public void addLinha(String texto, String numero, boolean booleano) throws Exception {
        conteudoLinhas.add(new Object[]{texto, numero, booleano});
    }

    @Override
    public int getQtasLinhas() {
        return conteudoLinhas.size();
    }

    @Override
    public Object getValor(int row, int col) {
        return conteudoLinhas.get(row)[col];
    }

    @Override
    public Collection<?> getItens() {
        return conteudoLinhas;
    }

    @Override
    public void carregarLinha(int row) {
        Object[] linha = conteudoLinhas.get(row);
        linhaSelecionada = row;
        
        for(Observador o : observadores) {
            o.carregarCampos(linha[0].toString(), linha[1].toString(), linha[2].toString().equals("true"));
        }
    }

    @Override
    public int alterarLinha(String texto, String numero, boolean booleano) {
        conteudoLinhas.set(linhaSelecionada, new Object[]{texto, numero, booleano});
        return linhaSelecionada;
    }

    @Override
    public void addObservador(Observador obs) {
        observadores.add(obs);
    }

    @Override
    public void removeObservador(Observador obs) {
        observadores.remove(obs);
    }
    
}
