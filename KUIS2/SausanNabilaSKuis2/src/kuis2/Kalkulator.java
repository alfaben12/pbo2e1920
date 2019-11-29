/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis2;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author salsa
 */
public class Kalkulator extends javax.swing.JFrame {
    private static Connection koneksi2;
    double a, b, c;

    
    /**
     * Creates new form Kalkulator
     */
    public Kalkulator() {
        initComponents();
    }
    
    private static void buka_koneksi() {
        if(koneksi2 == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/database_quiz_2?zeroDateTimeBehavior=convertToNull [root on Default schema]";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi2 = (Connection) DriverManager.getConnection(url, user, password);
            }catch(SQLException t) {
                System.out.println("Error membuat koneksi");
            }
        }
    }
    
 

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelAngka1 = new javax.swing.JLabel();
        jLabelOperator = new javax.swing.JLabel();
        jLabelAngka2 = new javax.swing.JLabel();
        JTAngka1 = new javax.swing.JTextField();
        JTAngka2 = new javax.swing.JTextField();
        jComboBoxOperator = new javax.swing.JComboBox<>();
        jLabelHasil = new javax.swing.JLabel();
        JTHasil = new javax.swing.JTextField();
        BtnNext = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelAngka1.setText("Angka1");

        jLabelOperator.setText("Operator");

        jLabelAngka2.setText("Angka2");

        JTAngka1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTAngka1ActionPerformed(evt);
            }
        });

        JTAngka2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTAngka2ActionPerformed(evt);
            }
        });

        jComboBoxOperator.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pilih Operasi","+", "*", "/", "-" }));
        jComboBoxOperator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxOperatorActionPerformed(evt);
            }
        });

        jLabelHasil.setText("Hasil");

        JTHasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTHasilActionPerformed(evt);
            }
        });

        BtnNext.setText("Next");
        BtnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(JTHasil, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BtnNext))
                        .addGap(188, 188, 188))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelAngka1)
                                .addGap(94, 94, 94)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelOperator)
                                        .addGap(91, 91, 91)
                                        .addComponent(jLabelAngka2))
                                    .addComponent(jComboBoxOperator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelHasil)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JTAngka1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(213, 213, 213)
                                .addComponent(JTAngka2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(19, 19, 19))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAngka1)
                    .addComponent(jLabelOperator)
                    .addComponent(jLabelAngka2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JTAngka1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTAngka2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxOperator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addComponent(jLabelHasil)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JTHasil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(BtnNext)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JTAngka1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTAngka1ActionPerformed
        // TODO add your handling code here:
        JTAngka1.setText("");
    }//GEN-LAST:event_JTAngka1ActionPerformed

    private void JTHasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTHasilActionPerformed

         
    }//GEN-LAST:event_JTHasilActionPerformed

    private void JTAngka2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTAngka2ActionPerformed
        // TODO add your handling code here:
        JTAngka2.setText("");
    }//GEN-LAST:event_JTAngka2ActionPerformed

    private void jComboBoxOperatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxOperatorActionPerformed
        // TODO add your handling code here
        a = Double.parseDouble(JTAngka1.getText());
        b = Double.parseDouble(JTAngka2.getText());
        
        if (jComboBoxOperator.getSelectedItem().equals("+")){
            c = a + b;
            String hasil = String.valueOf(c);
            JTHasil.setText(hasil);
        }else if (jComboBoxOperator.getSelectedItem().equals("-")){
            c = a - b;
            String hasil2 = String.valueOf(c);
            JTHasil.setText(hasil2);
        } else if (jComboBoxOperator.getSelectedItem().equals("*")){
            c = a * b;
            String hasil3 = String.valueOf(c);
            JTHasil.setText(hasil3);
        } else if (jComboBoxOperator.getSelectedItem().equals("/")) {
            c = a / b;
            String hasil4 = String.valueOf(c);
            JTHasil.setText(hasil4);
        }
    }//GEN-LAST:event_jComboBoxOperatorActionPerformed

    private void BtnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNextActionPerformed
        // TODO add your handling code here:
        new Kalkulator().setVisible(true);
        buka_koneksi();         
        String sqlkode="Insert into operasi (Angka1,Angka2,Operator,Hasil) " + "values ('"+this.JTAngka1.getText()+"'," + "'"+this.JTAngka2.getText()+"'," + "'"+this.JTHasil.getText()+ "'"+this.JTHasil.getText()+"')";                  
        try { 
            PreparedStatement mStatement = (PreparedStatement) koneksi2.prepareStatement(sqlkode);            
            mStatement.executeUpdate();             
            mStatement.close();             
            JOptionPane.showMessageDialog(this,"Data Berhasil Ditambah");         
        } catch (SQLException ex) {             
            JOptionPane.showMessageDialog(this,"Terjadi Kesalahan "+ex.getMessage());        
        } 
    }//GEN-LAST:event_BtnNextActionPerformed

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
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kalkulator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kalkulator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnNext;
    private javax.swing.JTextField JTAngka1;
    private javax.swing.JTextField JTAngka2;
    private javax.swing.JTextField JTHasil;
    private javax.swing.JComboBox<String> jComboBoxOperator;
    private javax.swing.JLabel jLabelAngka1;
    private javax.swing.JLabel jLabelAngka2;
    private javax.swing.JLabel jLabelHasil;
    private javax.swing.JLabel jLabelOperator;
    // End of variables declaration//GEN-END:variables
}
