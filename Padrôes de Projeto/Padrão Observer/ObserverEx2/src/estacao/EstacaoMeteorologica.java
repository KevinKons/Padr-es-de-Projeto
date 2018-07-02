package estacao;

import java.util.ArrayList;
import java.util.List;

import sensores.SensorTemperatura;
import sensores.SensorUmidade;

public class EstacaoMeteorologica {

    private List<ObservadorTempo> observadores = new ArrayList<>();
    private SensorTemperatura sensorTemp;
    private SensorUmidade sensorUmidade;

    public SensorTemperatura getSensorTemp() {
        return sensorTemp;
    }

    public void setSensorTemp(SensorTemperatura sensorTemp) {
        this.sensorTemp = sensorTemp;
    }

    public SensorUmidade getSensorUmidade() {
        return sensorUmidade;
    }

    public void setSensorUmidade(SensorUmidade sensorUmidade) {
        this.sensorUmidade = sensorUmidade;
    }

    public double getTemperatura() {
        return temp;
    }

    public double getUmidade() {
        return umid;
    }

    private double umid;
    private double temp;

    public void ligar() {
        Thread t = new Thread() {

            @Override
            public void run() {
                while (true) {
                    temp = sensorTemp.getMedicao();
                    umid = sensorUmidade.getMedicao();

                    notificar();
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }

        };
        t.start();
    }

    public void notificar() {
        for(ObservadorTempo ot : observadores) {
            ot.atualizar(this);
        }
    }
    
    public void anexar(ObservadorTempo ot) {
        observadores.add(ot);
    }
    
    public void desanexar(ObservadorTempo ot) {
        observadores.remove(ot);
    }
}
