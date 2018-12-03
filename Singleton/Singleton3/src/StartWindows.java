
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JDialog;

@SuppressWarnings("serial")
public class StartWindows extends JDialog {

    public StartWindows() {
        setResizable(false);
        setTitle("Teste");

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent evt) {
                System.exit(0);
            }
        });

        JButton jb = new JButton("Abrir");

        ActionListener action = new ActionListener() {

            public void actionPerformed(ActionEvent arg) {
                MostraConta jinc = new MostraConta();
                jinc.pack();
            }

        };
        jb.addActionListener(action);

        getContentPane().add(jb);

        pack();
        setLocationRelativeTo(null);
        setVisible(true);

    }

    public static void main(String[] args) {

        new StartWindows();

    }

}
