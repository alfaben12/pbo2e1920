

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class RecordData extends javax.swing.JFrame {
    Connection con;
    Statement stat;
    ResultSet rs;
    String sql;
    private DefaultTableModel model;
    
    public RecordData(){
        initComponents();
        koneksi DB = new koneksi();
        DB.config();
        con = DB.con;
        stat = DB.stm;
        
        model = new DefaultTableModel();
        this.jTabelHitung.setModel(model);
        model.addColumn("Angka1");
        model.addColumn("Angka2");
        model.addColumn("Operator");
        model.addColumn("Hasil");
        ambil_data_tabel();
    }
        private void ambil_data_tabel(){
            model.getDataVector().removeAllElements();         
            model.fireTableDataChanged(); 
            
            try {
                Statement s = con.createStatement();   
                String sql = "Select * from tb_hasil";             
                ResultSet r = s.executeQuery(sql); 
                while (r.next()) {                 
                Object o [] = new Object[4];                 
                o[0] = r.getString("angka1");                 
                o[1] = r.getString("angka2");                 
                o[2] = r.getString("operator");                 
                o[3] = r.getString("hasil");                 
                model.addRow(o);             
            }           
               r.close();             
               s.close();         
        } catch (SQLException e) {             
            JOptionPane.showMessageDialog(this,"Terjadi kesalahan " + e.getMessage());         
        }    
    }
           
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTabelHitung = new javax.swing.JTable();
        jButtonBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabelHitung.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTabelHitung);

        jButtonBack.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonBack.setText("Back");
        jButtonBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(151, 151, 151)
                        .addComponent(jButtonBack)))
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonBack)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBackActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButtonBackActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                   new RecordData().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBack;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTabelHitung;
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
