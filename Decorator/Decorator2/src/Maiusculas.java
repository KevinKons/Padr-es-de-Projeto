
public class Maiusculas extends TextoDecorator {

    public Maiusculas(Texto texto) {
        super(texto);
    }

    @Override
    public String getTexto() {
        String retorno = super.getTexto().toUpperCase(); 
        System.out.println(retorno + " maisculas");
        return retorno;
    }

}
