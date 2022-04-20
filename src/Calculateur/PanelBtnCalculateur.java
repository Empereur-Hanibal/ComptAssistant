package Calculateur;

import Calculateur.CalculTva.FrameCalculTva;
import Calculateur.CalculEscompte.FrameCalculEscompte;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelBtnCalculateur extends JPanel implements ActionListener
{
    private JButton btnEscompte;
    private JButton btnTva;

    private JPanel panelCalculateur;

    private FrameCalculTva frameCalculTva;
    private FrameCalculEscompte frameCalculEscompte;
    private FrameCalculateur frameCalculateur;

    PanelBtnCalculateur()
    {
        //Création des composants
        this.btnEscompte = new JButton("Escompte");
        this.btnTva      = new JButton("TVA"     );

        this.panelCalculateur = new JPanel();

        this.frameCalculEscompte = new FrameCalculEscompte();
        this.frameCalculTva      = new FrameCalculTva();
        this.frameCalculateur    = new FrameCalculateur();

        //Positionnement des composants
        this.add(this.panelCalculateur);

        //Elaboration des composants
        this.panelCalculateur.add(this.btnEscompte);
        this.panelCalculateur.add(this.btnTva     );

        //Activation des controles
        this.btnTva.addActionListener     (this);
        this.btnEscompte.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == this.btnTva)
        {
            frameCalculTva.setVisible(true);
        }

        if (e.getSource() == this.btnEscompte)
        {
            frameCalculEscompte.setVisible(true);
        }
    }
}
