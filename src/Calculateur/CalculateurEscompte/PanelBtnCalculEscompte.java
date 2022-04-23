package Calculateur.CalculateurEscompte;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelBtnCalculEscompte extends JPanel implements ActionListener
{
    private JButton btnCalcul;

    private JPanel panelBtnCalcul;

    public PanelBtnCalculEscompte()
    {
        //Création des composants
        this.btnCalcul = new JButton    ("Calculer");

        this.panelBtnCalcul   = new JPanel();

        //Positionnement des composants
        this.add(this.panelBtnCalcul);

        //Elaboration du panel Bouton Calcul
        this.panelBtnCalcul.add(this.btnCalcul);

        //Activation des contrôles
        this.btnCalcul.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        double montant, escompteTaux, escomptePrix, tva;

        montant = Double.parseDouble(PanelCalculInitEscompte.txtPrixInit.getText());
        escompteTaux = Double.parseDouble(PanelCalculInitEscompte.txtTauxEscompte.getText());

        if (e.getSource() == this.btnCalcul)
        {
            escomptePrix = montant * (escompteTaux/ 100);

            montant -= escomptePrix;

            tva = escomptePrix * 0.80;
            tva = escomptePrix - tva;

            PanelCalculFinalEscompte.lblPrixFinalR.setText (String.format("%.2f",montant )+ " €");
            PanelCalculFinalEscompte.lblPrixEscompteR.setText (String.format("%.2f",escomptePrix) + " €");
            PanelCalculFinalEscompte.lblTvaR.setText (String.format("%.2f",tva) + " €");
        }
    }
}
