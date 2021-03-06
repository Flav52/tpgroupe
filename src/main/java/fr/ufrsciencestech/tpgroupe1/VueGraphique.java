
package fr.ufrsciencestech.tpgroupe1;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextArea;

public class VueGraphique extends javax.swing.JFrame implements Observer {

    public VueGraphique() {
        initComponents();
        inc.setName("Plus");
        inc.setText("+");
        dec.setName("Moins");
        jComboBox1.setName("CBfruit");
        this.pack();
        this.setVisible(true);
    }

    public void ajoutControleur(Controleur c) {
        c.getPanier().addObserver(this);
        //affiche.setText(Integer.toString(c.getPanier().getNbElements()));
        inc.addActionListener(c);
        dec.addActionListener(c);
        jComboBox1.addActionListener(c);
    }    
    
    @Override
    public void update(Observable o, Object arg) {
        
        ArrayList<FruitSimple> pan = ((Panier)o).getListe();
        int nbOrange = 0;
        int nbBanane = 0;
        int nbCerise = 0;
        int total=0;
       
        
        for(FruitSimple fru : pan){
            String type = fru.getClass().toString();
            total++;
            switch(type){
                case "class fr.ufrsciencestech.tpgroupe1.Banane":
                        nbBanane++;
                        break;
                    case "class fr.ufrsciencestech.tpgroupe1.Cerise":
                        nbCerise++;
                        break;
                    default:
                        nbOrange++;
                        break;
                }
        }
        
        affiche.setText(" Banane : "+nbBanane+" \n Cerise : "+nbCerise+" \n Orange : "+nbOrange+" \n\n Total : "+total);
    }

    public JTextArea getAffiche() {
        return affiche;
    }

    public JButton getDec() {
        return dec;
    }

    public JButton getInc() {
        return inc;
    }  
    
    public void setAffiche(JTextArea affiche) {
        this.affiche = affiche;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        inc = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel4 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        affiche = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        dec = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new java.awt.BorderLayout());

        jPanel1.setPreferredSize(new java.awt.Dimension(400, 40));
        jPanel1.setLayout(new java.awt.GridLayout(1, 4));
        jPanel1.add(jPanel5);

        inc.setMaximumSize(new java.awt.Dimension(100, 100));
        inc.setMinimumSize(new java.awt.Dimension(0, 0));
        inc.setName("Plus"); // NOI18N
        inc.setPreferredSize(new java.awt.Dimension(30, 25));
        jPanel1.add(inc);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Orange", "Banane", "Cerise" }));
        jComboBox1.setName("CBfruit"); // NOI18N
        jPanel1.add(jComboBox1);
        jPanel1.add(jPanel4);

        getContentPane().add(jPanel1, java.awt.BorderLayout.NORTH);

        jPanel2.setPreferredSize(new java.awt.Dimension(400, 200));
        jPanel2.setLayout(new java.awt.GridLayout(1, 1));

        affiche.setEditable(false);
        affiche.setColumns(20);
        affiche.setRows(5);
        jScrollPane1.setViewportView(affiche);

        jPanel2.add(jScrollPane1);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        jPanel3.setLayout(new java.awt.GridLayout(1, 1));

        dec.setText("-");
        jPanel3.add(dec);

        getContentPane().add(jPanel3, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VueGraphique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VueGraphique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VueGraphique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VueGraphique.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VueGraphique().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea affiche;
    private javax.swing.JButton dec;
    private javax.swing.JButton inc;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables


}
