package Calculateur.CalculateurTva;

import javax.swing.*;

public class PanelCalculFinalTva extends JPanel
{
    private JLabel lblprixFinal;
    private JLabel lblPrixTva;

    public static JLabel lblPrixTvaR;
    public static JLabel lblPrixFinalR;

    public PanelCalculFinalTva()
    {
        //Création des composants
        this.lblprixFinal = new JLabel("Prix finale : ",JLabel.RIGHT);
        this.lblPrixTva   = new JLabel("Prix TVA :", JLabel.RIGHT   );

        PanelCalculFinalTva.lblPrixFinalR = new JLabel();
        PanelCalculFinalTva.lblPrixTvaR   = new JLabel();

        //Positionnement des composants
        this.add(this.lblprixFinal);
        this.add(PanelCalculFinalTva.lblPrixFinalR);

        this.add(this.lblPrixTva  );
        this.add(PanelCalculFinalTva.lblPrixTvaR);
    }
}
