import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Login extends javax.swing.JFrame {
    
    Connection con;
    Statement stat;
    ResultSet rs;
    String sql;
    private String nama;
    private String telepon;
    private String password;
    
    public Login() {
    initComponents();
        koneksi DB = new koneksi();
        DB.config();
        con = DB.con;
        stat = DB.stm;
        
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
     public void setTelpn(String telpn){
        this.telepon = telepon;
    }

    public void setPassword(String password){
        this.password = password;
    }

    public String getNama(){
        return nama;
    }

    public String getTelpn(){
        return telepon;
    }

    public String getPassword(){
        return password;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelNama = new javax.swing.JLabel();
        jLabelTelp = new javax.swing.JLabel();
        jLabelPass = new javax.swing.JLabel();
        jTextNama = new javax.swing.JTextField();
        jTextTelp = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jTextPass = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelNama.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelNama.setText("Nama");

        jLabelTelp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelTelp.setText("Telp.");

        jLabelPass.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelPass.setText("Password");

        jTextNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNamaActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButton1.setText("login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabelNama, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelTelp, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelPass, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextTelp, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                            .addComponent(jTextNama)
                            .addComponent(jTextPass))))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNama, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextNama, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextTelp, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE)
                    .addComponent(jLabelTelp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextPass, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPass, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNamaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        // TODO add your handling code here:
        String sqlcode = "Insert into tb_user (nama, no_telepon, password)"
        + "values ('"+this.jTextNama.getText()+"',"
        + "'"+this.jTextTelp.getText()+"',"
        + "'"+this.jTextPass.getText()+"')";
        try{
            PreparedStatement mStatement = con.prepareStatement(sqlcode);
            mStatement.executeUpdate();
            mStatement.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, ""+ex.getMessage());
        }

        new HitungKalkulator().setVisible(true);
        dispose();

    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabelNama;
    private javax.swing.JLabel jLabelPass;
    private javax.swing.JLabel jLabelTelp;
    private javax.swing.JTextField jTextNama;
    private javax.swing.JPasswordField jTextPass;
    private javax.swing.JTextField jTextTelp;
    // End of variables declaration//GEN-END:variables

    private static class koneksi {

        Connection con;
        Statement stm;
    
    
        public void config(){
            try {
                Class.forName("com.mysql.jdbc.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost/pbokuis", "root", "");
                stm = con.createStatement();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "koneksi gagal "+e.getMessage());
            }
        }    
    }
}
