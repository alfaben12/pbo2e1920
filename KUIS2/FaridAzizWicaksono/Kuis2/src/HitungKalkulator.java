import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class HitungKalkulator extends javax.swing.JFrame {
    Connection con;
    Statement stat;
    ResultSet rs;
    String sql;
    
    public HitungKalkulator() {
        initComponents();
        koneksi DB = new koneksi();
        DB.config();
        con = DB.con;
        stat = DB.stm;
        
    try{
        String sqlcode = "Select * from tb_user";
        Statement s = con.createStatement();
        ResultSet r = s.executeQuery(sqlcode);
        while (r.next()){
            String nama = r.getString("nama");
            String telepon = r.getString("no_telepon");
            jLabelJudul.setText("Halo "+nama+" ; Telepon Anda = "+telepon);
        }
    }catch (SQLException e ){
        JOptionPane.showMessageDialog(this,""+e.getMessage());
    }      
    }
    private void clear(){
        jTextAngka1.setText("");
        jTextAngka2.setText("");
        jTextFieldHasil.setText("");
    }
           
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jTextAngka1 = new javax.swing.JTextField();
        jTextAngka2 = new javax.swing.JTextField();
        jComboBoxOperator = new javax.swing.JComboBox<>();
        jLabelText = new javax.swing.JLabel();
        jTextFieldHasil = new javax.swing.JTextField();
        jButtonNext = new javax.swing.JButton();
        jLabelJudul = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Angka 2");

        jTextAngka2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextAngka2ActionPerformed(evt);
            }
        });

        jComboBoxOperator.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "+", "-", "*", "/" }));
        jComboBoxOperator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxOperatorActionPerformed(evt);
            }
        });

        jLabelText.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabelText.setText("Hasil");

        jTextFieldHasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldHasilActionPerformed(evt);
            }
        });

        jButtonNext.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonNext.setText("next");
        jButtonNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNextActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Angka 1");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Operator");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jComboBoxOperator, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextAngka1, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextAngka2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jButtonNext))
                            .addComponent(jTextFieldHasil, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(131, 131, 131))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabelText, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(139, 139, 139))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabelJudul, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextAngka1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextAngka2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxOperator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addComponent(jLabelText, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldHasil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonNext)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextAngka2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextAngka2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextAngka2ActionPerformed

    private void jComboBoxOperatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxOperatorActionPerformed
        // TODO add your handling code here:
        double bill1, bill2, hasil;

        bill1 = Double.parseDouble(this.jTextAngka1.getText());
        bill2 = Double.parseDouble(this.jTextAngka2.getText());

        if(jComboBoxOperator.getSelectedItem()=="+"){
            hasil = bill1+bill2;
            jTextFieldHasil.setText(""+hasil);
        }
        else if(jComboBoxOperator.getSelectedItem()=="-"){
            hasil = bill1-bill2;
            jTextFieldHasil.setText(""+hasil);
        }
        else if(jComboBoxOperator.getSelectedItem()=="*"){
            hasil = bill1*bill2;
            jTextFieldHasil.setText(""+hasil);
        }
        else if(jComboBoxOperator.getSelectedItem()=="/"){
            hasil = bill1/bill2;
            jTextFieldHasil.setText(""+hasil);
        }
    }//GEN-LAST:event_jComboBoxOperatorActionPerformed

    private void jTextFieldHasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldHasilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldHasilActionPerformed

    private void jButtonNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNextActionPerformed
        // TODO add your handling code here:
        String sqlkode="Insert into tb_hasil (angka1,angka2,operator,hasil) "
        + "values ('"+this.jTextAngka1.getText()+"',"
        + "'"+this.jTextAngka2.getText()+"',"
        +"'"+this.jComboBoxOperator.getSelectedItem()+"',"
        + "'"+this.jTextFieldHasil.getText()+"')";

        try{
            PreparedStatement mStatement = con.prepareStatement(sqlkode);
            mStatement.executeUpdate();
            mStatement.close();
            JOptionPane.showMessageDialog(this, "");
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(this, ""+ex.getMessage());
        }
        new RecordData().setVisible(true);
        clear();

    }//GEN-LAST:event_jButtonNextActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HitungKalkulator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonNext;
    private javax.swing.JComboBox<String> jComboBoxOperator;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelJudul;
    private javax.swing.JLabel jLabelText;
    private javax.swing.JTextField jTextAngka1;
    private javax.swing.JTextField jTextAngka2;
    private javax.swing.JTextField jTextFieldHasil;
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
