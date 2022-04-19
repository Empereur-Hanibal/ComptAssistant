package Calculateur.CalculTva;

import javax.swing.*;
import java.awt.*;

public class FrameCalculTva extends JFrame
{
    private PanelBtnCalculTva   panelBtnCalcul;
    private PanelCalculInitTva  panelCalculInit;
    private PanelCalculFinalTva panelCalculFinal;
    private PanelTitreTva       panelTitre;

    public FrameCalculTva()
    {
        this.setTitle("Calcul Tva");
        this.setSize(400,300);
        this.setLocation(10,10);
        this.setLayout(new GridLayout(4,1));

        //Création des composants
        this.panelBtnCalcul   = new PanelBtnCalculTva();
        this.panelCalculFinal = new PanelCalculFinalTva();
        this.panelCalculInit  = new PanelCalculInitTva();
        this.panelTitre       = new PanelTitreTva();

        //Positionnement des composants
        this.add(this.panelTitre);
        this.add(this.panelCalculInit);
        this.add(this.panelCalculFinal);
        this.add(this.panelBtnCalcul);

        this.setVisible(true);
    }

    public static void main(String[] args) {new FrameCalculTva();}
}
