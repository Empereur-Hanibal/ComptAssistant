package Calculateur;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelBtnCalculateur extends JPanel implements ActionListener
{
    private JButton btnEscompte;
    private JButton btnTva;

    private JPanel panelCalculateur;

    public PanelBtnCalculateur()
    {
        //Création des composants
        this.btnEscompte = new JButton("Escompte");
        this.btnTva      = new JButton("TVA"     );

        this.panelCalculateur = new JPanel();

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

    }
}
