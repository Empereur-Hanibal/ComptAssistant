package Calculateur;

import javax.swing.*;
import java.awt.*;

public class FrameCalculateur extends JFrame
{
    private PanelBtnCalculateur panelBtn;
    private PanelTitreCalculateur panelTitre;

    public FrameCalculateur()
    {
        this.setTitle("Calculateur");
        this.setSize(500,300);
        this.setLocation(10,10);
        this.setLayout(new GridLayout(2,1));

        //Création des composants
        this.panelTitre = new PanelTitreCalculateur();
        this.panelBtn   = new PanelBtnCalculateur();

        //Postionnement des composants
        this.add(this.panelTitre);
        this.add(this.panelBtn);

        this.setVisible(true);
    }

    public static void main(String[] args) {new FrameCalculateur();}
}
