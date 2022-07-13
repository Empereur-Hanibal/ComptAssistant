package vue;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class panelAcceuil extends JPanel implements ActionListener
{
    private JButton btnCalculateur;
    private JButton btnStock;
    private JButton btnfacture;

    public panelAcceuil()
    {
        this.setLayout(new GridLayout(4,4,10,10));

        this.btnCalculateur = new JButton("Calculateur");
        this.btnStock       = new JButton("Fiche de stocks");
        this.btnfacture     = new JButton("Factures");

        this.add(this.btnStock);
        this.add(this.btnfacture);
        this.add(this.btnCalculateur);

        btnStock.addActionListener(this);
        btnfacture.addActionListener(this);
        btnStock.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {

    }
}
