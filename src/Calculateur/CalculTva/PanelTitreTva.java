package Calculateur.CalculTva;

import javax.swing.*;

public class PanelTitreTva extends JPanel
{
    private JLabel lblTitre;

    private JPanel panelTitre;

    public PanelTitreTva()
    {
        //Création des composants
        lblTitre = new JLabel("Calcul TVA");

        panelTitre = new JPanel();

        //Positionnement des composants
        this.add(this.panelTitre);

        //Elaboration des composants
        this.panelTitre.add(this.lblTitre);
    }
}
