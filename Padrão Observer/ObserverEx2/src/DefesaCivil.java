
import dispositivos.DispositivoConsole;
import dispositivos.DispositivoWindow;
import estacao.EstacaoMeteorologica;
import sensores.SensorTemperatura;
import sensores.SensorUmidade;

public class DefesaCivil {

    public void abrir() {

        EstacaoMeteorologica estacao = new EstacaoMeteorologica();
        estacao.setSensorTemp(new SensorTemperatura());
        estacao.setSensorUmidade(new SensorUmidade());

        DispositivoConsole console = new DispositivoConsole();

        DispositivoWindow window = new DispositivoWindow();
        
        estacao.anexar(window);
        estacao.anexar(console);
        
        estacao.ligar();
    }

    public static void main(String[] args) throws InterruptedException {

        DefesaCivil dc = new DefesaCivil();
        dc.abrir();

        while (true) {
            Thread.sleep(2000);
        }
    }

}
