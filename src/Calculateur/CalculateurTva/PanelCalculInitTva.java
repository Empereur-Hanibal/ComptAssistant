package Calculateur.CalculateurTva;

import javax.swing.*;

public class PanelCalculInitTva extends JPanel
{
    public static JTextField txtPrixInit;
    public static JTextField txtTauxTva;

    private JLabel lblPrixInit;
    private JLabel lblTauxtva;

    public PanelCalculInitTva()
    {
        //Création des composants
        PanelCalculInitTva.txtPrixInit = new JTextField("        ");
        PanelCalculInitTva.txtTauxTva  = new JTextField("        ");

        this.lblPrixInit = new JLabel("Prix initial : ", JLabel.RIGHT);
        this.lblTauxtva  = new JLabel("Taux de TVA : ", JLabel.RIGHT );

        //Positionnement des composants
        this.add(this.lblPrixInit);
        this.add(PanelCalculInitTva.txtPrixInit);

        this.add(this.lblTauxtva);
        this.add(PanelCalculInitTva.txtTauxTva);
    }
}
