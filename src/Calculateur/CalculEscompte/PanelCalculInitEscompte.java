package Calculateur.CalculEscompte;

import javax.swing.*;
import java.awt.*;

public class PanelCalculInitEscompte extends JPanel
{
    public static JTextField txtPrixInit;
    public static JTextField txtTauxEscompte;

    private JLabel lblPrixInit;
    private JLabel lblTauxEscompte;

    private JPanel panelCalculInit;

    public PanelCalculInitEscompte()
    {
        //Création des composants
        this.txtPrixInit     = new JTextField("        ");
        this.txtTauxEscompte = new JTextField("        ");

        this.lblPrixInit     = new JLabel("prix initial : ", Label.RIGHT   );
        this.lblTauxEscompte = new JLabel("taux d'escompte : ",Label.RIGHT );

        this.panelCalculInit = new JPanel();

        //Positionnement des composants
        this.add(this.panelCalculInit );

        //Elaboration du panel Calcul Initial
        this.panelCalculInit.add(this.lblPrixInit);
        this.panelCalculInit.add(PanelCalculInitEscompte.txtPrixInit);

        this.panelCalculInit.add(this.lblTauxEscompte);
        this.panelCalculInit.add(PanelCalculInitEscompte.txtTauxEscompte);
    }
}
