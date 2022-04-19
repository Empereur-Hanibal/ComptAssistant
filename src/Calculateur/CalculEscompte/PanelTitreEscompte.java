package Calculateur.CalculEscompte;

import javax.swing.*;

public class PanelTitreEscompte extends JPanel
{
    private JLabel lblTitre;

    private JPanel panelTitre;

    public PanelTitreEscompte()
    {
        // Création des composants
        this.lblTitre = new JLabel("Calcul d'escompte");

        this.panelTitre = new JPanel();

        //Positionnement des composants
        this.add(this.panelTitre);

        //Elaboration du panel Titre
        this.panelTitre.add(this.lblTitre);
    }
}
