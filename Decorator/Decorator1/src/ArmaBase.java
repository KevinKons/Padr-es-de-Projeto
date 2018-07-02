
public class ArmaBase implements Arma {

    @Override
    public void atirar() {
        System.out.println("Bang!!");
    }

    @Override
    public void alcanceVisao() {
        System.out.println("Alvo localizado ateh 10 metros");
    }

    @Override
    public void atirarComCalma() {
        alcanceVisao();
        atirar();
    }
}
