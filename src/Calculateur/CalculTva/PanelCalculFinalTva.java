package Calculateur.CalculTva;

import Calculateur.CalculEscompte.PanelCalculFinalEscompte;

import javax.swing.*;

public class PanelCalculFinalTva extends JPanel
{
    private JLabel lblprixFinal;
    private JLabel lblPrixTva;

    public static JLabel lblPrixTvaR;
    public static JLabel lblPrixFinalR;

    public JPanel panelCalculFinal;

    public PanelCalculFinalTva()
    {
        //Création des composants
        this.lblprixFinal = new JLabel("Prix finale : ",JLabel.RIGHT);
        this.lblPrixTva   = new JLabel("Prix TVA :", JLabel.RIGHT   );

        PanelCalculFinalTva.lblPrixFinalR = new JLabel();
        PanelCalculFinalTva.lblPrixTvaR   = new JLabel();

        this.panelCalculFinal = new JPanel();

        //Positionnement des composants
        this.add(this.panelCalculFinal);

        //Elaboration des composants
        this.panelCalculFinal.add(this.lblprixFinal);
        this.panelCalculFinal.add(PanelCalculFinalTva.lblPrixFinalR);

        this.panelCalculFinal.add(this.lblPrixTva  );
        this.panelCalculFinal.add(PanelCalculFinalTva.lblPrixTvaR);
    }
}
