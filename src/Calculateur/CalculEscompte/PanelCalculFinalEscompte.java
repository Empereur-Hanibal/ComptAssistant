package Calculateur.CalculEscompte;

import javax.swing.*;
import java.awt.*;

public class PanelCalculFinalEscompte extends JPanel
{
    private JLabel lblprixFinal;
    private JLabel lblPrixEscompte;
    private JLabel lblPrixTva;

    public static JLabel lblPrixEscompteR;
    public static JLabel lblTvaR;
    public static JLabel lblPrixFinalR;

    private JPanel panelCalculFinal;

    public PanelCalculFinalEscompte()
    {
        //Création des composants
        this.lblprixFinal     = new JLabel("prix final : ", Label.RIGHT     );
        this.lblPrixEscompte  = new JLabel("prix d'escompte : ",Label.RIGHT);
        this.lblPrixTva       = new JLabel("prix de la TVA : ",Label.RIGHT );

        PanelCalculFinalEscompte.lblPrixFinalR    = new JLabel();
        PanelCalculFinalEscompte.lblPrixEscompteR = new JLabel();
        PanelCalculFinalEscompte.lblTvaR          = new JLabel();

        this.panelCalculFinal = new JPanel();

        //Positionnement des composants
        this.add(this.panelCalculFinal);

        //Elaboration du panel Calcul Final
        this.panelCalculFinal.add(this.lblPrixEscompte);
        this.panelCalculFinal.add(PanelCalculFinalEscompte.lblPrixEscompteR);

        this.panelCalculFinal.add(this.lblPrixTva);
        this.panelCalculFinal.add(PanelCalculFinalEscompte.lblTvaR);

        this.panelCalculFinal.add(this.lblprixFinal);
        this.panelCalculFinal.add(PanelCalculFinalEscompte.lblPrixFinalR);
    }
}
