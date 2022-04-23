package Calculateur.CalculateurEscompte;

import javax.swing.*;

public class PanelTitreEscompte extends JPanel
{
    private JLabel lblTitre;

    public PanelTitreEscompte()
    {
        // Création des composants
        this.lblTitre = new JLabel("Calcul d'escompte");

        //Positionnement des composants
        this.add(this.lblTitre);
    }
}
