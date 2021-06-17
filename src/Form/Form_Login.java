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

import java.sql.*;
import javax.swing.*;
import Controller.KaryawanController;
import java.awt.Color;

public class Form_Login extends javax.swing.JFrame {

    /**
     * Creates new form Form_Login
     */
    
    Connection conn;
    Statement st;
    KaryawanController controller;
    
    public Form_Login() {
        initComponents();
        dispose();
        controller = new KaryawanController(this);
        panel_bground2.setBackground(new Color(0,204,255,204));
    }
    
    public javax.swing.JTextField getTxt_id_login(){
        return txt_id_login;
    }
    
    public javax.swing.JTextField getTxt_password_login(){
        return txt_password_login;
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
        txt_id_login = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_login = new javax.swing.JButton();
        txt_password_login = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btn_registrasi = new javax.swing.JButton();
        lbl_bground1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        panel_bground2.setBackground(new java.awt.Color(0, 204, 255));
        panel_bground2.setPreferredSize(new java.awt.Dimension(1044, 646));

        txt_id_login.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel4.setText("ID");

        jLabel5.setFont(new java.awt.Font("Roboto", 1, 48)); // NOI18N
        jLabel5.setText("LOGIN");

        btn_login.setBackground(new java.awt.Color(53, 221, 80));
        btn_login.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        btn_login.setForeground(new java.awt.Color(255, 255, 255));
        btn_login.setText("LOGIN");
        btn_login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_loginActionPerformed(evt);
            }
        });

        txt_password_login.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel7.setText("Password");

        btn_registrasi.setBackground(new java.awt.Color(53, 221, 80));
        btn_registrasi.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        btn_registrasi.setForeground(new java.awt.Color(255, 255, 255));
        btn_registrasi.setText("REGISTRASI");
        btn_registrasi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_registrasiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_bground2Layout = new javax.swing.GroupLayout(panel_bground2);
        panel_bground2.setLayout(panel_bground2Layout);
        panel_bground2Layout.setHorizontalGroup(
            panel_bground2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_bground2Layout.createSequentialGroup()
                .addGap(0, 138, Short.MAX_VALUE)
                .addGroup(panel_bground2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(panel_bground2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(117, 117, 117)
                        .addComponent(txt_id_login, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_bground2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txt_password_login, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(155, 155, 155))
            .addGroup(panel_bground2Layout.createSequentialGroup()
                .addGap(441, 441, 441)
                .addComponent(jLabel5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_bground2Layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(btn_registrasi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_login)
                .addGap(176, 176, 176))
        );
        panel_bground2Layout.setVerticalGroup(
            panel_bground2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_bground2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel5)
                .addGroup(panel_bground2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_bground2Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addGroup(panel_bground2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txt_id_login, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(75, 75, 75)
                        .addGroup(panel_bground2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_password_login, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(59, 273, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_bground2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panel_bground2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_registrasi)
                            .addComponent(btn_login))
                        .addGap(74, 74, 74))))
        );

        jPanel1.add(panel_bground2);
        panel_bground2.setBounds(200, 170, 1044, 646);

        lbl_bground1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/LOGIN.jpg"))); // NOI18N
        lbl_bground1.setText("jLabel1");
        jPanel1.add(lbl_bground1);
        lbl_bground1.setBounds(0, 0, 1480, 1020);

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

    private void btn_registrasiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_registrasiActionPerformed
        // TODO add your handling code here:
        
        Form_Registrasi f = new Form_Registrasi();
        f.setVisible(true);
        f.toFront();
    }//GEN-LAST:event_btn_registrasiActionPerformed

    private void btn_loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_loginActionPerformed
        // TODO add your handling code here:
        if(controller.onClickBtnLogin()){
            Form_MenuUtama f = new Form_MenuUtama();
            f.setVisible(true);
            f.toFront();
        }
    }//GEN-LAST:event_btn_loginActionPerformed

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
            java.util.logging.Logger.getLogger(Form_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_login;
    private javax.swing.JButton btn_registrasi;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_bground1;
    private javax.swing.JPanel panel_bground2;
    private javax.swing.JTextField txt_id_login;
    private javax.swing.JTextField txt_password_login;
    // End of variables declaration//GEN-END:variables
}
