
package fr.ufrsciencestech.tpgroupe1;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JComboBox;

public class Controleur implements ActionListener {
    private Panier p;
    private FruitSimple fruit;

    @Override
    public void actionPerformed(ActionEvent e){
        if(((JButton)e.getSource()).getName().equals("Plus")) {
            try {
                JComboBox oui = (JComboBox)((JButton)e.getSource()).getParent().getComponent(2);
                
                String nom = (String)oui.getSelectedItem();
           
                try {
                    switch(nom){
                        case "Banane":
                            fruit = new Banane(0.6, "Madagascar");
                            break;
                        /*case "Cerise":
                            fruit = new Cerise(0.25, "France");
                            break;*/
                        default:
                            fruit = new Orange(0.5, "Espagne");
                            break;
                    }
                } catch (PrixNegatifException ex) {
                    Logger.getLogger(Controleur.class.getName()).log(Level.SEVERE, null, ex);
                }
            
                p.ajoute(fruit);
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
        }else if(((JComboBox)e.getSource()).getName().equals("CBfruit")){
            
        }
    }

    public Panier getPanier() {
        return p;
    }

    public void setPanier(Panier p) {
        this.p = p;
    }
    
}
