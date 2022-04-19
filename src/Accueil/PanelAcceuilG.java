package Accueil;


import javax.swing.*;
import java.awt.event.*;

public class PanelAcceuilG extends JPanel implements ActionListener
{
    private JButton btnStock;

    public PanelAcceuilG()
    {
        //création du bouton de stock,
        this.btnStock = new JButton("Stock");

        //Activation du bouton stock
        btnStock.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == e.getSource())
        {

        }
    }
}
