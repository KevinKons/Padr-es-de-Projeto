package dispositivos;

import estacao.EstacaoMeteorologica;
import estacao.ObservadorTempo;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class DispositivoWindow extends JFrame implements ObservadorTempo {

    private static final long serialVersionUID = 1L;

    private JLabel jlTemp;
    private JLabel jlUmidade;

    public DispositivoWindow() {

        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        jlTemp = new JLabel("Temp:");
        getContentPane().add(jlTemp, "North");

        jlUmidade = new JLabel("Umidade:");
        getContentPane().add(jlUmidade, "South");

        pack();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void atualizar(EstacaoMeteorologica estacao) {
        double medicaoTemp = estacao.getSensorTemp().getMedicao();
        double medicaoUmid = estacao.getSensorUmidade().getMedicao();
        jlTemp.setText("Temp: " + medicaoTemp);
        jlUmidade.setText("Umid: " + medicaoUmid);
    }

}
