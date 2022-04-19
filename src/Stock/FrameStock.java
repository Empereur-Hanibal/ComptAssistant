package Stock;

import javax.swing.*;
import java.awt.*;

public class FrameStock extends JFrame
{
    private PanelStock panelStock;

    public FrameStock()
    {
        this.setTitle("Gestion des stocks");
        setLocation(10,10);

        //Création des composants//
        panelStock = new PanelStock();

        //Positionnement des composants//
        this.add(panelStock);

        this.pack();
        this.setVisible(true);
    }

    public static void main(String[] args) {new FrameStock();}
}
