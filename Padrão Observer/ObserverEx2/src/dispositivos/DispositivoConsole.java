package dispositivos;

import estacao.EstacaoMeteorologica;
import estacao.ObservadorTempo;

public class DispositivoConsole implements ObservadorTempo {

    @Override
    public void atualizar(EstacaoMeteorologica estacao) {
        double medicaoTemp = estacao.getSensorTemp().getMedicao();
        double medicaoUmid = estacao.getSensorUmidade().getMedicao();
        System.out.println("Temp: " + medicaoTemp);
        System.out.println("Umid: " + medicaoUmid);
    }

    
    
}
