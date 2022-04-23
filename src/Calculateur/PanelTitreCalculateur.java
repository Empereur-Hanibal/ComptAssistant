package Calculateur;

import javax.swing.*;

public class PanelTitreCalculateur extends JPanel
{
    private JLabel lblTitre;

    public PanelTitreCalculateur()
    {
        //Création des composants
        this.lblTitre = new JLabel("Calculateur");


        //Positionnement des composants
        this.add(this.lblTitre);
    }
}
