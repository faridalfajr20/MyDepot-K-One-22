/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

/**
 *
 * @author User
 */

import Controller.KaryawanController;
import java.awt.Color;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
public class Form_Registrasi extends javax.swing.JFrame {

    /**
     * Creates new form Form_Registrasi
     */
    
    KaryawanController controller;
    public Form_Registrasi() {
        initComponents();
        dispose();
        controller = new KaryawanController(this);
        panel_bground2.setBackground(new Color(0,204,255,204));
    }
        public javax.swing.JTextField getTxt_id_registrasi(){
        return txt_id_registrasi;
    }
    
    public javax.swing.JTextField getTxt_nama_registrasi(){
        return txt_nama_registrasi;
    }
    
    public javax.swing.JTextField getTxt_nohp_registrasi(){
        return txt_nohp_registrasi;
    }
    
    public JTextField getTxtPassword() {
        return txtPassword;
    }
    
    public JComboBox<String> getCbo_k() {
        return cbo_k;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        panel_bground2 = new javax.swing.JPanel();
        txt_id_registrasi = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt_nohp_registrasi = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_simpan = new javax.swing.JButton();
        txt_nama_registrasi = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cbo_k = new javax.swing.JComboBox<>();
        txtPassword = new javax.swing.JPasswordField();
        lbl_bground1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        panel_bground2.setBackground(new java.awt.Color(0, 204, 255));
        panel_bground2.setPreferredSize(new java.awt.Dimension(1044, 646));

        txt_id_registrasi.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        txt_id_registrasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_id_registrasiActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel1.setText("ID");

        jLabel2.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel2.setText("Sebagai");

        txt_nohp_registrasi.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        txt_nohp_registrasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nohp_registrasiActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel3.setText("No. Hp");

        jLabel4.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        jLabel4.setText("REGISTRASI");

        btn_simpan.setBackground(new java.awt.Color(53, 221, 80));
        btn_simpan.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        btn_simpan.setForeground(new java.awt.Color(255, 255, 255));
        btn_simpan.setText("SIMPAN");
        btn_simpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_simpanActionPerformed(evt);
            }
        });

        txt_nama_registrasi.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        txt_nama_registrasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_nama_registrasiActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel5.setText("Nama");

        jLabel6.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel6.setText("Password");

        cbo_k.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        cbo_k.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Owner", "Karyawan" }));
        cbo_k.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbo_kActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_bground2Layout = new javax.swing.GroupLayout(panel_bground2);
        panel_bground2.setLayout(panel_bground2Layout);
        panel_bground2Layout.setHorizontalGroup(
            panel_bground2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_bground2Layout.createSequentialGroup()
                .addGroup(panel_bground2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_bground2Layout.createSequentialGroup()
                        .addGap(385, 385, 385)
                        .addComponent(jLabel4))
                    .addGroup(panel_bground2Layout.createSequentialGroup()
                        .addGap(211, 211, 211)
                        .addGroup(panel_bground2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_bground2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_bground2Layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addGap(51, 51, 51))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_bground2Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addGap(18, 18, 18)))
                            .addGroup(panel_bground2Layout.createSequentialGroup()
                                .addGroup(panel_bground2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(panel_bground2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(cbo_k, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_nama_registrasi, javax.swing.GroupLayout.DEFAULT_SIZE, 638, Short.MAX_VALUE)
                            .addComponent(txt_nohp_registrasi)
                            .addComponent(txt_id_registrasi)
                            .addComponent(txtPassword))))
                .addContainerGap(71, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_bground2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btn_simpan)
                .addGap(425, 425, 425))
        );
        panel_bground2Layout.setVerticalGroup(
            panel_bground2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_bground2Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel4)
                .addGap(41, 41, 41)
                .addGroup(panel_bground2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nama_registrasi, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(23, 23, 23)
                .addGroup(panel_bground2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_id_registrasi, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(29, 29, 29)
                .addGroup(panel_bground2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_nohp_registrasi, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGroup(panel_bground2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_bground2Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(jLabel6))
                    .addGroup(panel_bground2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addGroup(panel_bground2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbo_k, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(btn_simpan)
                .addGap(43, 43, 43))
        );

        jPanel1.add(panel_bground2);
        panel_bground2.setBounds(200, 170, 1044, 646);

        lbl_bground1.setBackground(new java.awt.Color(51, 204, 255));
        lbl_bground1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/LOGIN.jpg"))); // NOI18N
        lbl_bground1.setText("jLabel2");
        jPanel1.add(lbl_bground1);
        lbl_bground1.setBounds(0, 0, 1440, 1020);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1440, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1020, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_nohp_registrasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nohp_registrasiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nohp_registrasiActionPerformed

    private void btn_simpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_simpanActionPerformed
        // TODO add your handling code here:
        
        if(txt_nama_registrasi.getText().equals("") || txt_id_registrasi.getText().equals("") || txt_nohp_registrasi.getText().equals("") || txtPassword.getPassword().equals("") || cbo_k.getSelectedItem().equals(""))
            {                 
                JOptionPane.showMessageDialog(rootPane, "Username / Password is Empty", "Message", JOptionPane.ERROR_MESSAGE);
                    txt_nama_registrasi.requestFocus();                 
                               
            }
            else
            {     //controller.IdCheck();
                  controller.onClickBtnCreate();
                  dispose();
            }
            Form_Login f = new Form_Login();
            f.setVisible(true);
            f.toFront();
    }//GEN-LAST:event_btn_simpanActionPerformed

    private void cbo_kActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbo_kActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbo_kActionPerformed

    private void txt_nama_registrasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_nama_registrasiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_nama_registrasiActionPerformed

    private void txt_id_registrasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_id_registrasiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_id_registrasiActionPerformed

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
            java.util.logging.Logger.getLogger(Form_Registrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_Registrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_Registrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_Registrasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_Registrasi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_simpan;
    private javax.swing.JComboBox<String> cbo_k;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_bground1;
    private javax.swing.JPanel panel_bground2;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txt_id_registrasi;
    private javax.swing.JTextField txt_nama_registrasi;
    private javax.swing.JTextField txt_nohp_registrasi;
    // End of variables declaration//GEN-END:variables
}
