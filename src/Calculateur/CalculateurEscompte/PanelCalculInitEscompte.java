package Calculateur.CalculateurEscompte;

import javax.swing.*;
import java.awt.*;

public class PanelCalculInitEscompte extends JPanel
{
    public static JTextField txtPrixInit;
    public static JTextField txtTauxEscompte;

    private JLabel lblPrixInit;
    private JLabel lblTauxEscompte;

    public PanelCalculInitEscompte()
    {
        //Création des composants
        this.txtPrixInit     = new JTextField("        ");
        this.txtTauxEscompte = new JTextField("        ");

        this.lblPrixInit     = new JLabel("prix initial : ", Label.RIGHT   );
        this.lblTauxEscompte = new JLabel("taux d'escompte : ",Label.RIGHT );

        //Positionnement des composants
        this.add(this.lblPrixInit);
        this.add(PanelCalculInitEscompte.txtPrixInit);

        this.add(this.lblTauxEscompte);
        this.add(PanelCalculInitEscompte.txtTauxEscompte);
    }
}
