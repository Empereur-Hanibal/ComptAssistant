package Calculateur.CalculTva;

import javax.swing.*;

public class PanelCalculInitTva extends JPanel
{
    public static JTextField txtPrixInit;
    public static JTextField txtTauxTva;

    private JLabel lblPrixInit;
    private JLabel lblTauxtva;

    private JPanel panelCalculInit;

    public PanelCalculInitTva()
    {
        //Création des composants
        PanelCalculInitTva.txtPrixInit = new JTextField("     ");
        PanelCalculInitTva.txtTauxTva  = new JTextField("     ");

        this.lblPrixInit = new JLabel("Prix initial : ", JLabel.RIGHT);
        this.lblTauxtva  = new JLabel("Taux de TVA : ", JLabel.RIGHT );

        this.panelCalculInit = new JPanel();

        //Positionnement des composants
        this.add(this.panelCalculInit);

        //Elaboration des composants
        this.panelCalculInit.add(this.lblPrixInit);
        this.panelCalculInit.add(PanelCalculInitTva.txtPrixInit);

        this.panelCalculInit.add(this.lblTauxtva);
        this.panelCalculInit.add(PanelCalculInitTva.txtTauxTva);
    }
}
