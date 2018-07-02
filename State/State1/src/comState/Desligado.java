package comState;

public class Desligado extends EstadoVentilador {

    public Desligado(Ventilador ventilador) {
        super(ventilador);
        System.out.println("Desligado");
    }

    @Override
    public void proxVelocidade() {
        ventilador.setEstadoAtual(new BaixaVelocidade(ventilador));
    }

}
