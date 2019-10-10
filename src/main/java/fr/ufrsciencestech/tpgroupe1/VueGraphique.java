
package fr.ufrsciencestech.tpgroupe1;

import java.util.Observable;
import java.util.Observer;
import javax.swing.JButton;
import javax.swing.JLabel;

public class VueGraphique extends javax.swing.JFrame implements Observer {

    public VueGraphique() {
        initComponents();
        inc.setName("Plus");
        dec.setName("Moins");
        this.pack();
        this.setVisible(true);
    }

    public void ajoutControleur(Controleur c) {
        c.getPanier().addObserver(this);
        affiche.setText(Integer.toString(c.getPanier().getNbElements()));
        inc.addActionListener(c);
        dec.addActionListener(c);
    }    
    
    @Override
    public void update(Observable o, Object arg) {
        affiche.setText(Integer.toString(((Panier) o).getNbElements()));
    }

    public JLabel getAffiche() {
        return affiche;
    }

    public JButton getDec() {
        return dec;
    }

    public JButton getInc() {
        return inc;
    }  
    
    public void setAffiche(JLabel affiche) {
        this.affiche = affiche;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        inc = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        affiche = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        dec = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(400, 100));
        jPanel1.setLayout(new java.awt.GridLayout(1, 1));

        inc.setText("+");
        inc.setMaximumSize(new java.awt.Dimension(39, 25));
        inc.setMinimumSize(new java.awt.Dimension(39, 25));
        inc.setPreferredSize(new java.awt.Dimension(39, 25));
        jPanel1.add(inc);

        getContentPane().add(jPanel1, java.awt.BorderLayout.NORTH);

        jPanel2.setPreferredSize(new java.awt.Dimension(400, 200));
        jPanel2.setLayout(new java.awt.GridLayout(1, 1));

        affiche.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel2.add(affiche);

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
    private javax.swing.JLabel affiche;
    private javax.swing.JButton dec;
    private javax.swing.JButton inc;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables


}
