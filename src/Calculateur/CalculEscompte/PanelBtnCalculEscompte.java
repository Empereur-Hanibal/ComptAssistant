package Calculateur.CalculEscompte;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

public class PanelCalculEscompte extends JPanel implements ActionListener
{
    private JButton btnCalcul;
    
    private JLabel lblprixFinal;
    private JLabel lblPrixEscompte;
    private JLabel lblTauxEscompte;
    private JLabel lblPrixTva;
    private JLabel lblPrixEscompteR;
    private JLabel lblTvaR;
    private JLabel lblPrixFinalR;

    private JPanel panelCalculInit;
    private JPanel panelCalculFinal;
    private JPanel panelBtnCalcul;

    public PanelCalculEscompte()
    {
        //Création des composants//
        this.btnCalcul = new JButton    ("Calculer");


        this.lblPrixInit     = new JLabel     ("prix initial : ",Label.RIGHT   );
        this.lblprixFinal    = new JLabel     ("prix final : ",Label.RIGHT     );
        this.lblTauxEscompte = new JLabel     ("taux d'escompte : ",Label.RIGHT);
        this.lblPrixEscompte = new JLabel     ("prix d'escompte : ",Label.RIGHT);
        this.lblPrixTva      = new JLabel     ("prix de la TVA : ",Label.RIGHT );
        this.lblPrixFinalR    = new JLabel ();
        this.lblPrixEscompteR = new JLabel ();
        this.lblTvaR           = new JLabel ();


        this.panelCalculInit  = new JPanel();
        this.panelCalculFinal = new JPanel();
        this.panelBtnCalcul   = new JPanel();


        //Positionnement des composants//

        this.add(this.panelCalculInit );
        this.add(this.panelCalculFinal);
        this.add(this.panelBtnCalcul);

        //Elaboration du panel Calcul Initial
        this.panelCalculInit.add(this.lblPrixInit);
        this.panelCalculInit.add(this.txtPrixInit);

        this.panelCalculInit.add(this.lblTauxEscompte);
        this.panelCalculInit.add(this.txtTauxEscompte);

        //Elaboration du panel Calcul Final
        this.panelCalculFinal.add(this.lblPrixEscompte);
        this.panelCalculFinal.add(this.lblPrixEscompteR);

        this.panelCalculFinal.add(this.lblPrixTva);
        this.panelCalculFinal.add(this.lblTvaR);

        this.panelCalculFinal.add(this.lblprixFinal);
        this.panelCalculFinal.add(this.lblPrixFinalR);

        //Elaboration du panel Bouton Calcul
        this.panelBtnCalcul.add(this.btnCalcul);

        //Activation des contrôles
        this.btnCalcul.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        double montant, escompteTaux, escomptePrix, tva;
        DecimalFormat df = new DecimalFormat("0.00");

        montant = Double.parseDouble(this.txtPrixInit.getText());
        escompteTaux = Double.parseDouble(this.txtTauxEscompte.getText());

        if (e.getSource() == this.btnCalcul)
        {
            escomptePrix = montant * (escompteTaux/ 100);

            montant -= escomptePrix;

            tva = escomptePrix * 0.80;
            tva = Math.round(escomptePrix - tva);

            this.lblPrixFinalR.setText (String.format("%.2f",montant )+ " €");
            this.lblPrixEscompteR.setText (String.format("%.2f",escomptePrix) + " €");
            this.lblTvaR.setText (String.format("%.2f",tva) + " €");
        }
    }
}
