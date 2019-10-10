
package fr.ufrsciencestech.tpgroupe1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

public class Controleur implements ActionListener {
    private Panier p;

    @Override
    public void actionPerformed(ActionEvent e){
        if(((JButton)e.getSource()).getName().equals("Plus")) {
            try {
                p.ajoute();
            } catch (PanierPleinException ex) {
                Logger.getLogger(Controleur.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(((JButton)e.getSource()).getName().equals("Moins")) {
            try {
                p.retire();
            } catch (PanierVideException ex) {
                Logger.getLogger(Controleur.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public Panier getPanier() {
        return p;
    }

    public void setPanier(Panier p) {
        this.p = p;
    }
    
}
