package Calculateur.CalculEscompte;

import javax.swing.*;
import java.awt.*;

public class FrameCalculEscompte extends JFrame
{
    private PanelBtnCalculEscompte panelBtnCalcul;
    private PanelCalculInitEscompte panelCalculInit;
    private PanelCalculFinalEscompte panelCalculFinal;
    private PanelTitreEscompte panelTitre;

    public FrameCalculEscompte()
    {
        this.setTitle("Calcul Escompte");
        this.setSize(500,300);
        this.setLocation(10,10);
        this.setLayout(new GridLayout(4,1));

        //Création des composants
        this.panelBtnCalcul   = new PanelBtnCalculEscompte();
        this.panelCalculFinal = new PanelCalculFinalEscompte();
        this.panelCalculInit  = new PanelCalculInitEscompte();
        this.panelTitre       = new PanelTitreEscompte();

        //Positionnement des composants
        this.add(this.panelTitre);
        this.add(this.panelCalculInit);
        this.add(this.panelCalculFinal);
        this.add(this.panelBtnCalcul);

        this.setVisible(true);
    }

    public static void main(String[] args) {new FrameCalculEscompte();}
}