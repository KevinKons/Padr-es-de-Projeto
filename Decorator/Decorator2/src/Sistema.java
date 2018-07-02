
public class Sistema {

    public static void main(String[] args) {

        Texto texto = new TextoSimples("Teste do Decoratorz");
//        System.out.println(texto);

        Maiusculas maiusculas = new Maiusculas(texto);
//        System.out.println(maiusculas);

        Sublinhador sublinhador = new Sublinhador(maiusculas);
//        System.out.println(sublinhador);

        Inversor inversor = new Inversor(sublinhador);
        System.out.println(inversor);

        Cripto cripto = new Cripto(inversor);
//        System.out.println(cripto);
    }

}
