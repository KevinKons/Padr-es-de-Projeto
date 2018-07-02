
public class MiraTelescopica extends ArmaDecorator {

	public MiraTelescopica(Arma arma) {
		super(arma);
	}

	@Override
	public void alcanceVisao() {
		super.alcanceVisao();
		System.out.println("Alvo localizado ateh 50 metros");
	}
}
