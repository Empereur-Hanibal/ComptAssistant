package Stock;

import javax.swing.table.AbstractTableModel;

public class GrilleDonneesModelStock extends AbstractTableModel
{
    private String[] tabEntetes;
    private Object[][] tabDonnees;

    public GrilleDonneesModelStock() {
        this.tabEntetes = new String[]{"Dates", "Etats", "Quantité", "Prix Unitaire", "Montant"};
        this.tabDonnees = new Object[][]{};
    }

    public int getRowCount() {return this.tabDonnees.length;}

    public int getColumnCount() {return this.tabEntetes.length;}

    public Object getValueAt(int rowIndex, int columnIndex) {return this.tabDonnees[rowIndex][columnIndex];}

    public Class getColumnClass(int columnIndex) {return getValueAt(0,columnIndex).getClass();}

    public String getColumnName(int columnIndex) {return this.tabEntetes[columnIndex];}
}
