package KuisPBO;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class Kalkluator extends javax.swing.JFrame {
    private static Connection koneksi;
    private double a, b, c;
    private String hasil;
   
    public Kalkluator() {
        initComponents();
    }
    private static void buka_koneksi() {
        if(koneksi == null) {
            try {
                String url = "jdbc:mysql://localhost:3306/kuisduapbo";
                String user = "root";
                String password = "";
                DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                koneksi = (Connection) DriverManager.getConnection(url, user, password);
            }catch(SQLException t) {
                System.out.println("Error membuat koneksi");
            }
        }
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldAngka1 = new javax.swing.JTextField();
        jTextFieldAngka2 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jTextFieldHasil = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButtonNext = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Angka 1");

        jLabel2.setText("Operator");

        jLabel3.setText("Angka 2");

        jTextFieldAngka1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAngka1ActionPerformed(evt);
            }
        });

        jTextFieldAngka2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldAngka2ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+", "-", "/", "*" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jTextFieldHasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldHasilActionPerformed(evt);
            }
        });

        jLabel4.setText("Hasil");

        jButtonNext.setText("next");
        jButtonNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(47, 47, 47))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextFieldAngka1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4))
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addComponent(jTextFieldAngka2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonNext)
                    .addComponent(jTextFieldHasil, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldAngka1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldAngka2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jTextFieldHasil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonNext)
                .addGap(47, 47, 47))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTextFieldAngka1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAngka1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAngka1ActionPerformed

    private void jTextFieldAngka2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldAngka2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldAngka2ActionPerformed

    private void jTextFieldHasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldHasilActionPerformed
        // TODO add your handling code here:
        a = Double.parseDouble(jTextFieldAngka1.getText());
        b = Double.parseDouble(jTextFieldAngka2.getText());
        
        if (jComboBox1.getSelectedItem().equals("+")) {
            c = a + b;
            hasil = Double.toString(c);
        }else if (jComboBox1.getSelectedItem().equals("-")) {
            c = a - b;
            hasil = Double.toString(c);
            
        }else if (jComboBox1.getSelectedItem().equals("/")) {
            c = a / b;
            hasil = Double.toString(c);
            
        }else if (jComboBox1.getSelectedItem().equals("*")) {
            c = a * b;
            hasil = Double.toString(c);
    }//GEN-LAST:event_jTextFieldHasilActionPerformed
    jTextFieldHasil.setText(hasil+"");
    }
    private void jButtonNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNextActionPerformed
        // TODO add your handling code here:
        new Record().setVisible(true);
        buka_koneksi();         
        String sqlkode = "Insert into kalkulator (angka1, angka2, operator, hasil) "
                + "values ('" + this.jTextFieldAngka1.getText() + "',"
                + "'" + this.jTextFieldAngka2.getText() + "',"
                + "'" + this.jComboBox1.getSelectedItem() + "',"
                + "'" + this.jTextFieldHasil.getText()+"')";                
        try { 
            PreparedStatement mStatement = (PreparedStatement) koneksi.prepareStatement(sqlkode);            
            mStatement.executeUpdate();             
            mStatement.close();             
            JOptionPane.showMessageDialog(this,"Data Berhasil Ditambah");         
        } catch (SQLException ex) {             
            JOptionPane.showMessageDialog(this,"Terjadi Kesalahan "+ex.getMessage());        
        }
        
    }//GEN-LAST:event_jButtonNextActionPerformed

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
            java.util.logging.Logger.getLogger(Kalkluator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Kalkluator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Kalkluator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Kalkluator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Kalkluator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonNext;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextFieldAngka1;
    private javax.swing.JTextField jTextFieldAngka2;
    private javax.swing.JTextField jTextFieldHasil;
    // End of variables declaration//GEN-END:variables
}