
public class Sublinhador extends TextoDecorator {

    public Sublinhador(Texto texto) {
        super(texto);
    }

    @Override
    public String getTexto() {
        String original = super.getTexto();
        char[] array = original.toCharArray();
        StringBuffer buffer = new StringBuffer();
        for (int i = 0; i < array.length; i++) {
            buffer.append(array[i]).append('_');
        }
        System.out.println(buffer.toString() + " Sublinhador");
        return buffer.toString();
    }

}
