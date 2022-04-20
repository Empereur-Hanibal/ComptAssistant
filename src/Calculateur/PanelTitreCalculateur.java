package Calculateur;

import javax.swing.*;

public class PanelTitreCalculateur extends JPanel
{
    private JLabel lblTitre;

    private JPanel panelTitre;

    public PanelTitreCalculateur()
    {
        //Création des composants
        this.lblTitre = new JLabel("Calculateur");

        this.panelTitre = new JPanel();

        //Positionnement des composants
        this.add(this.panelTitre);

        //Elaboration des composants
        this.panelTitre.add(this.lblTitre);
    }
}
