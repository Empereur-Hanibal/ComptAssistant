package Calculateur.CalculTva;

import Calculateur.CalculEscompte.PanelCalculFinalEscompte;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelBtnCalculTva extends JPanel implements ActionListener
{
    private JButton btnCalcul;

    private JPanel panelBtnCalcul;

    public PanelBtnCalculTva()
    {
        //Création des composants
        this.btnCalcul = new JButton("Calculer");

        this.panelBtnCalcul = new JPanel();

        //Positionnement des composants
        this.add(this.panelBtnCalcul);

        //Elaboration des composants
        this.panelBtnCalcul.add(this.btnCalcul);

        //Activation des controles
        this.btnCalcul.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        double montant, tvaPrix, tvaTaux;

        montant = Double.parseDouble(PanelCalculInitTva.txtPrixInit.getText());
        tvaTaux = Double.parseDouble(PanelCalculInitTva.txtTauxTva.getText());

        tvaPrix = montant * (tvaTaux/100);

        montant -= tvaPrix;

        PanelCalculFinalTva.lblPrixFinalR.setText (String.format("%.2f",montant )+ " €");
        PanelCalculFinalTva.lblPrixTvaR.setText (String.format("%.2f",tvaPrix) + " €");
    }
}
