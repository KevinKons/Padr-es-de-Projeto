package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

import control.Controle;
import control.JCollectionsControle;
import control.Observador;

public class JCollections extends JFrame implements Observador{

    private static final long serialVersionUID = 1L;

    private JTable tabela;
    private JTextField tfTexto;
    private JTextField tfNumero;
    private JCheckBox cbBoolean;
    private CollectionsTableModel tableModel;
    private Controle controle;

    public JCollections() {
        setSize(500, 300);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        setTitle("MVC");

        initComponents();
    }

    private void initComponents() {

        controle = new JCollectionsControle();
        controle.addObservador(this);
        

        JPanel opcoes = new JPanel();

        JPanel pn = new JPanel(new GridLayout(1, 6));
        pn.setBorder(new TitledBorder("Cadastro"));

        pn.add(new JLabel("Texto : "));
        tfTexto = new JTextField();
        pn.add(tfTexto);

        pn.add(new JLabel("Numero : "));
        tfNumero = new JTextField();
        pn.add(tfNumero);

        cbBoolean = new JCheckBox("Gato(a)");
        pn.add(cbBoolean);

        JButton bAdd = new JButton("Add");
        pn.add(bAdd);
        bAdd.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {

                try {
                    if (bAdd.getText().equals("Add")) {
                        tableModel.addLinha(tfTexto.getText(), tfNumero.getText(),
                                cbBoolean.isSelected());
                    } else {
                        tableModel.alterarLinha(tfTexto.getText(), tfNumero.getText(),
                                cbBoolean.isSelected());
                    }
                    bAdd.setText("Add");
                } catch (Exception e) {
                    mostrarErro(e);
                }

            }
        });

        JPanel pnSuperior = new JPanel(new BorderLayout());
        pnSuperior.add(BorderLayout.NORTH, opcoes);
        pnSuperior.add(BorderLayout.CENTER, pn);

        getContentPane().add(BorderLayout.NORTH, pnSuperior);

        tableModel = new CollectionsTableModel();
        tabela = new JTable(tableModel);
        JScrollPane scroll = new JScrollPane(tabela);
        getContentPane().add(BorderLayout.CENTER, scroll);
        tableModel.setControle(controle);

        tabela.addMouseListener(new MouseListener() {

            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    controle.carregarLinha(tabela.getSelectedRow());
                    bAdd.setText("Alterar");
                }

            }

            @Override
            public void mouseEntered(MouseEvent arg0) {
            }

            @Override
            public void mouseExited(MouseEvent arg0) {
            }

            @Override
            public void mousePressed(MouseEvent arg0) {

            }

            @Override
            public void mouseReleased(MouseEvent arg0) {
            }
        });

        JPanel pnInferior = new JPanel();

        JButton bSize = new JButton("Size");
        bSize.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                try {
                    JOptionPane.showMessageDialog(null, tableModel.getItens()
                            .size());
                } catch (Exception e) {
                    mostrarErro(e);
                }
            }
        });
        pnInferior.add(bSize);

        getContentPane().add(BorderLayout.SOUTH, pnInferior);
    }

    protected void mostrarErro(Exception e) {
        JOptionPane.showMessageDialog(null, e, "Erro",
                JOptionPane.ERROR_MESSAGE);
    }

    public static void main(String[] args) {
        JCollections jan = new JCollections();
        jan.setVisible(true);

    }

    @Override
    public void carregarCampos(String texto, String numero, boolean booleano) {
        tfTexto.setText(texto);
        tfNumero.setText(numero);
        cbBoolean.setSelected(booleano);
    }

}
