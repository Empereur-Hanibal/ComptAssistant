package Calculateur.CalculateurEscompte;

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

    public PanelCalculFinalEscompte()
    {
        //Création des composants
        this.lblprixFinal     = new JLabel("prix final : ", Label.RIGHT     );
        this.lblPrixEscompte  = new JLabel("prix d'escompte : ",Label.RIGHT);
        this.lblPrixTva       = new JLabel("prix de la TVA : ",Label.RIGHT );

        PanelCalculFinalEscompte.lblPrixFinalR    = new JLabel();
        PanelCalculFinalEscompte.lblPrixEscompteR = new JLabel();
        PanelCalculFinalEscompte.lblTvaR          = new JLabel();

        //Positionnement des composants
        this.add(this.lblPrixEscompte);
        this.add(PanelCalculFinalEscompte.lblPrixEscompteR);

        this.add(this.lblPrixTva);
        this.add(PanelCalculFinalEscompte.lblTvaR);

        this.add(this.lblprixFinal);
        this.add(PanelCalculFinalEscompte.lblPrixFinalR);
    }
}
