
/**
 *
 * @author Avell
 */
public class Inversor extends TextoDecorator {
    
    public Inversor(Texto texto) {
        super(texto);
    }
    
    @Override
    public String getTexto() {
        String texto = super.getTexto();
        String retorno = "";
        
        for(int i = texto.length()-1 ; i >= 0; i--) {
            retorno += texto.charAt(i);
        }
        System.out.println(retorno + " retorno");
        return retorno;
    }
    
}
