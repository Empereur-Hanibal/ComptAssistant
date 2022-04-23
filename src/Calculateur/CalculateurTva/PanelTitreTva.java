package Calculateur.CalculateurTva;

import javax.swing.*;

public class PanelTitreTva extends JPanel
{
    private JLabel lblTitre;

    public PanelTitreTva()
    {
        //Création des composants
        lblTitre = new JLabel("Calcul TVA");


        //Positionnement des composants
        this.add(this.lblTitre );
    }
}
