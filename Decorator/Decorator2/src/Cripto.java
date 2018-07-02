
/**
 *
 * @author Avell
 */
public class Cripto extends TextoDecorator {
    
    public Cripto(Texto texto) {
        super(texto);
    }
    
    @Override
    public String getTexto() {
        String texto = super.getTexto();
        String retorno = "";
        for(char c : texto.toCharArray()) {
            int ascii = c;
            char novoChar = (char) (c + 1); 
            retorno += novoChar;
        }
        
        return retorno;
    }
    
}
