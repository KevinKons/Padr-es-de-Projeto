
import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;

/**
 *
 * @author Avell
 */
public class MostraConta extends JDialog implements Observador {

    private static Random sorteio = new Random();
    private static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    private JLabel jl;
    
    @Override
    public void pack() {
        setResizable(false);
        int x = sorteio.nextInt(screenSize.width - 100);
        int y = sorteio.nextInt(screenSize.height - 100);
        setLocation(x, y);

        final Incrementar inc = Incrementar.getInstance();
        jl = new JLabel(inc.getConta() + "");
        inc.addObservador(this);
        JButton jb = new JButton("Add");
        jb.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                inc.inc();
            }

        });

        getContentPane().add(jl, "North");
        getContentPane().add(jb, "South");

        super.pack();
        setVisible(true);
    }

    @Override
    public void atualizar(int valor) {
        jl.setText(valor + "");
    }

}
