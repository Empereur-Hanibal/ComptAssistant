package CalculEscompte;

import javax.swing.*;

public class FrameCalculEscompte extends JFrame
{
    private PanelCalculEscompte panelCalculEscompte;

    public FrameCalculEscompte()
    {
        this.setTitle("CalculEscompte");
        this.setLocation(10,10);

        this.panelCalculEscompte = new PanelCalculEscompte();
        this.add(this.panelCalculEscompte);

        this.pack();
        this.setVisible(true);
    }

    public static void main(String[] args) {new FrameCalculEscompte();}
}