/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.maven_java_project;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Flo0w
 */
public class Modifier extends javax.swing.JFrame {

    /**
     * Creates new form Modifier
     */
    public Modifier() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanelLocal = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jPanelSalle = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanelAppareil = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Modifier un élément");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Modifier");

        jComboBox1.setModel(getComboBoxModelApp());

        jLabel2.setText("Sélectionner ce que vous voulez modifier...");

        jButton1.setText("Valider");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jPanel1.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 545, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 367, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel2, "card2");

        jLabel3.setText("Modifier les propriétés du local");

        jLabel4.setText("Nom du local :");

        jButton2.setText("Valider");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jButton3.setText("Ajouter une salle");

        javax.swing.GroupLayout jPanelLocalLayout = new javax.swing.GroupLayout(jPanelLocal);
        jPanelLocal.setLayout(jPanelLocalLayout);
        jPanelLocalLayout.setHorizontalGroup(
            jPanelLocalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelLocalLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(112, 112, 112))
            .addGroup(jPanelLocalLayout.createSequentialGroup()
                .addGroup(jPanelLocalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelLocalLayout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(jLabel3))
                    .addGroup(jPanelLocalLayout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(jLabel4)
                        .addGap(89, 89, 89)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(150, Short.MAX_VALUE))
        );
        jPanelLocalLayout.setVerticalGroup(
            jPanelLocalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelLocalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(74, 74, 74)
                .addGroup(jPanelLocalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addGroup(jPanelLocalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addContainerGap(155, Short.MAX_VALUE))
        );

        jPanel1.add(jPanelLocal, "local");

        jLabel5.setText("Modifier une salle");

        jLabel6.setText("Nom de la salle :");

        jButton4.setText("Valider");

        jButton5.setText("Ajouter un appareil");

        javax.swing.GroupLayout jPanelSalleLayout = new javax.swing.GroupLayout(jPanelSalle);
        jPanelSalle.setLayout(jPanelSalleLayout);
        jPanelSalleLayout.setHorizontalGroup(
            jPanelSalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSalleLayout.createSequentialGroup()
                .addGroup(jPanelSalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSalleLayout.createSequentialGroup()
                        .addGap(243, 243, 243)
                        .addComponent(jLabel5))
                    .addGroup(jPanelSalleLayout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addGroup(jPanelSalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton5)
                            .addGroup(jPanelSalleLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(76, 76, 76)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(205, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSalleLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(84, 84, 84))
        );
        jPanelSalleLayout.setVerticalGroup(
            jPanelSalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSalleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addGap(63, 63, 63)
                .addGroup(jPanelSalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 224, Short.MAX_VALUE)
                .addGroup(jPanelSalleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addGap(86, 86, 86))
        );

        jPanel1.add(jPanelSalle, "salle");

        jLabel7.setText("Modifier un appareil");

        jLabel8.setText("Nom de l'appareil :");

        jLabel9.setText("Adresse MAC :");

        jLabel10.setText("Emplacement :");

        jTextField5.setText("jTextField5");

        jLabel11.setText("Système d'exploitation :");

        jTextField6.setText("jTextField6");

        jLabel12.setText("Activer / Désactiver :");

        jButton6.setText("Valider");

        jButton7.setText("Ajouter une interface");

        javax.swing.GroupLayout jPanelAppareilLayout = new javax.swing.GroupLayout(jPanelAppareil);
        jPanelAppareil.setLayout(jPanelAppareilLayout);
        jPanelAppareilLayout.setHorizontalGroup(
            jPanelAppareilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAppareilLayout.createSequentialGroup()
                .addGroup(jPanelAppareilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelAppareilLayout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(jLabel7))
                    .addGroup(jPanelAppareilLayout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addGroup(jPanelAppareilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanelAppareilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8)
                                .addComponent(jLabel9)
                                .addComponent(jLabel10)
                                .addComponent(jLabel11)
                                .addComponent(jLabel12))
                            .addGroup(jPanelAppareilLayout.createSequentialGroup()
                                .addComponent(jButton7)
                                .addGap(13, 13, 13)))
                        .addGap(59, 59, 59)
                        .addGroup(jPanelAppareilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField3)
                            .addComponent(jTextField4)
                            .addComponent(jTextField5)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanelAppareilLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(jCheckBox1)))))
                .addContainerGap(167, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelAppareilLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton6)
                .addGap(70, 70, 70))
        );
        jPanelAppareilLayout.setVerticalGroup(
            jPanelAppareilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelAppareilLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelAppareilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCheckBox1)
                    .addGroup(jPanelAppareilLayout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(34, 34, 34)
                        .addGroup(jPanelAppareilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelAppareilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelAppareilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanelAppareilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel12)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addGroup(jPanelAppareilLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6)
                    .addComponent(jButton7))
                .addGap(91, 91, 91))
        );

        jPanel1.add(jPanelAppareil, "appareil");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(151, 151, 151)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(jButton1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(63, 63, 63)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(211, 211, 211)
                                .addComponent(jLabel1)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(29, 29, 29)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(Modifier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modifier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modifier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modifier.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modifier().setVisible(true);
            }
        });
    }

    private ComboBoxModel getComboBoxModelApp(){
   try {
            // TODO add your handling code here:
            BDD bd = new BDD();
            bd.connect();
            ResultSet resultatsL = bd.select("SELECT nomLocal FROM Local");
            String[] locaux = new String[100];
            String[] Salle = new String[100];
            String[] App = new String[100];
            int cptl = 0;
            int cptS = 0;
            int cptA = 0;
            String req;
            while(resultatsL.next())
            {
                locaux[cptl] = resultatsL.getString(1);
                req = "SELECT nomSalle FROM Salle WHERE lieuSalle = '" +locaux[cptl]+"';";
                ResultSet resultatS = bd.select(req);
                Salle[cptS] = locaux[cptl];
                cptS++;
                while(resultatS.next()){
                    Salle[cptS] = "     ".concat(resultatS.getString(1));
                    cptS++;
                }
                cptl++;
            }

            
            String[] item = new String[cptS]; 
            

            
            
            for(int i = 0; i<cptS; i++){
                item[i] = Salle[i];
                System.out.println(item[i]);
            }
            
            return new DefaultComboBoxModel(item);
        } catch (SQLException ex) {
            Logger.getLogger(Ajouter.class.getName()).log(Level.SEVERE, null, ex);
        }
        return new DefaultComboBoxModel();
        
        
        
        
    }
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanelAppareil;
    private javax.swing.JPanel jPanelLocal;
    private javax.swing.JPanel jPanelSalle;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}