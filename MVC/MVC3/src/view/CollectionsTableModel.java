package view;

import java.util.Collection;

import javax.swing.table.AbstractTableModel;

import control.Controle;


public class CollectionsTableModel extends AbstractTableModel {

    private static final long serialVersionUID = 1L;

    /*
    Porque Integer.class aceita caracteres não númericos?
    */
    private String[] titulos = new String[]{"Texto", "Numero", "Booleano"};
    private Class<?>[] classes = new Class<?>[]{String.class, Integer.class, Boolean.class};

    
    private Controle controle;

    public void setControle(Controle controle) {
        this.controle = controle;
    }

    @Override
    public int getColumnCount() {
        return titulos.length;
    }

    @Override
    public String getColumnName(int col) {
        return titulos[col];
    }

    @Override
    public Class<?> getColumnClass(int col) {
        return classes[col];
    }

    @Override
    public int getRowCount() {
        if (controle == null) {
            return 0;
        } else {
            return controle.getQtasLinhas();
        }
    }

    @Override
    public Object getValueAt(int row, int col) {
        if (controle == null) {
            return null;
        }
        return controle.getValor(row, col);
    }

    public void addLinha(String texto, String numero, boolean booleano) throws Exception {
        if (controle != null) {
            controle.addLinha(texto, numero, booleano);
            fireTableRowsInserted(getRowCount(), getRowCount());
        }
    }

    public Collection<?> getItens() {
        if (controle == null) {
            return null;
        } else {
            return controle.getItens();
        }
    }

    public void alterarLinha(String texto, String numero, boolean booleano) {
        if (controle != null) {
            int linha = controle.alterarLinha(texto, numero, booleano);
            fireTableRowsUpdated(linha, linha);
        }

    }
}
