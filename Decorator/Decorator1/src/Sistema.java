
public class Sistema {

    public static void main(String[] args) {
        Arma pistola = new ArmaBase();
//        pistola.atirarComCalma();

//        Arma pistolaCoMira = new MiraTelescopica(pistola);
//        pistolaCoMira.atirarComCalma();
//
//        Arma pistolaExplosiva = new BalaExplosiva(pistola);
//        pistolaExplosiva.atirarComCalma();

        Arma pistolaFerrou = new MiraTelescopica(new BalaExplosiva(pistola));
//         Arma pistolaFerrou = new BalaExplosiva(new MiraTelescopica(pistola)); // mesmo efeito
        pistolaFerrou.atirarComCalma();
//
//        Arma metralhadora = new Repeticao(new MiraTelescopica(new BalaExplosiva(pistola)));
//        metralhadora.atirarComCalma();
    }

}
