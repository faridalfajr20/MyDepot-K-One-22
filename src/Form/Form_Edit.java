/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Form;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.TableColumn;
import javax.swing.JLabel;

/**
 *
 * @author USER
 */
public class Form_Edit extends javax.swing.JFrame {


    /**
     * Creates new form Form_MenuUtama
     */
    public Form_Edit() {
        initComponents();
        panel_bground2.setBackground(new Color(27,22,22,127));
        paneljudul_table.setBackground(new Color(0,204,255,204));
        table.setBackground(new Color(255,255,255,0));
        table.setDefaultRenderer(Object.class, new table_warna(new Color(0,204,255,229), new Color(0,204,255,178)));
        LebarKolom();
        table.setRowHeight(40);
        
    }
    
    public void LebarKolom(){ 
        TableColumn column;
        table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF); 
        column = table.getColumnModel().getColumn(0); 
        column.setPreferredWidth(122);
        column = table.getColumnModel().getColumn(1); 
        column.setPreferredWidth(117); 
        column = table.getColumnModel().getColumn(2); 
        column.setPreferredWidth(118); 
        column = table.getColumnModel().getColumn(3); 
        column.setPreferredWidth(118); 
        column = table.getColumnModel().getColumn(4); 
        column.setPreferredWidth(117);
        column = table.getColumnModel().getColumn(5); 
        column.setPreferredWidth(118); 
        column = table.getColumnModel().getColumn(6); 
        column.setPreferredWidth(107); 
        column = table.getColumnModel().getColumn(7); 
        column.setPreferredWidth(128); 
        column = table.getColumnModel().getColumn(8); 
        column.setPreferredWidth(118); 
    }
    
    public JLabel getJId() {
        return jId;
    }
    public JLabel getJNama() {
        return jName;
    }
    public JLabel getJNohp() {
        return jNohp;
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
        panel_judul = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        panel_menu = new javax.swing.JPanel();
        jLabel_nohp = new javax.swing.JLabel();
        jLabel_id = new javax.swing.JLabel();
        jLabel_nama = new javax.swing.JLabel();
        btn_logout = new javax.swing.JButton();
        btn_caridata = new javax.swing.JButton();
        btn_laporan = new javax.swing.JButton();
        btn_refresh = new javax.swing.JButton();
        btn_input = new javax.swing.JButton();
        jName = new javax.swing.JLabel();
        jId = new javax.swing.JLabel();
        jNohp = new javax.swing.JLabel();
        btn_batalkan = new javax.swing.JButton();
        btn_simpanperubahan = new javax.swing.JButton();
        table = new javax.swing.JTable();
        judultable_id = new javax.swing.JLabel();
        judultable_idk = new javax.swing.JLabel();
        judultable_idgalonman = new javax.swing.JLabel();
        judultable_nama = new javax.swing.JLabel();
        judultable_jmlpesanan = new javax.swing.JLabel();
        judultable_diskon = new javax.swing.JLabel();
        judultable_voucher = new javax.swing.JLabel();
        judultable_tglpesanan = new javax.swing.JLabel();
        judultable_jmlpembayaran = new javax.swing.JLabel();
        paneljudul_table = new javax.swing.JPanel();
        panel_bground2 = new javax.swing.JPanel();
        panel_galon = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        panel_judul.setPreferredSize(new java.awt.Dimension(1440, 115));
        panel_judul.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CARI DATA");
        panel_judul.add(jLabel1);
        jLabel1.setBounds(452, 20, 679, 60);

        jPanel1.add(panel_judul);
        panel_judul.setBounds(0, 0, 1478, 115);

        panel_menu.setBackground(new java.awt.Color(48, 179, 235));
        panel_menu.setLayout(null);

        jLabel_nohp.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel_nohp.setText("NO HP :");
        panel_menu.add(jLabel_nohp);
        jLabel_nohp.setBounds(30, 230, 101, 45);

        jLabel_id.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel_id.setText("ID :");
        panel_menu.add(jLabel_id);
        jLabel_id.setBounds(30, 130, 101, 45);

        jLabel_nama.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        jLabel_nama.setText("NAMA :");
        panel_menu.add(jLabel_nama);
        jLabel_nama.setBounds(30, 180, 101, 45);

        btn_logout.setBackground(new java.awt.Color(227, 247, 255));
        btn_logout.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        btn_logout.setText("LOGOUT");
        btn_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_logoutActionPerformed(evt);
            }
        });
        panel_menu.add(btn_logout);
        btn_logout.setBounds(50, 830, 262, 96);

        btn_caridata.setBackground(new java.awt.Color(227, 247, 255));
        btn_caridata.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        btn_caridata.setText("CARI DATA");
        panel_menu.add(btn_caridata);
        btn_caridata.setBounds(50, 310, 262, 96);

        btn_laporan.setBackground(new java.awt.Color(227, 247, 255));
        btn_laporan.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        btn_laporan.setText("LAPORAN");
        panel_menu.add(btn_laporan);
        btn_laporan.setBounds(50, 570, 262, 96);

        btn_refresh.setBackground(new java.awt.Color(227, 247, 255));
        btn_refresh.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        btn_refresh.setText("REFRESH");
        panel_menu.add(btn_refresh);
        btn_refresh.setBounds(50, 700, 262, 96);

        btn_input.setBackground(new java.awt.Color(227, 247, 255));
        btn_input.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        btn_input.setText("INPUT");
        btn_input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_inputActionPerformed(evt);
            }
        });
        panel_menu.add(btn_input);
        btn_input.setBounds(50, 440, 262, 96);

        jName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jName.setText("Name");
        panel_menu.add(jName);
        jName.setBounds(160, 180, 180, 45);

        jId.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jId.setText("ID");
        panel_menu.add(jId);
        jId.setBounds(160, 130, 180, 45);

        jNohp.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jNohp.setText("Nohp");
        panel_menu.add(jNohp);
        jNohp.setBounds(160, 230, 180, 45);

        jPanel1.add(panel_menu);
        panel_menu.setBounds(0, 2, 359, 1020);

        btn_batalkan.setBackground(new java.awt.Color(48, 179, 235));
        btn_batalkan.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        btn_batalkan.setText("BATALKAN");
        btn_batalkan.setBorder(null);
        btn_batalkan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_batalkanActionPerformed(evt);
            }
        });
        jPanel1.add(btn_batalkan);
        btn_batalkan.setBounds(852, 874, 262, 96);

        btn_simpanperubahan.setBackground(new java.awt.Color(48, 179, 235));
        btn_simpanperubahan.setFont(new java.awt.Font("Roboto", 0, 24)); // NOI18N
        btn_simpanperubahan.setText("SIMPAN PERUBAHAN");
        btn_simpanperubahan.setBorder(null);
        jPanel1.add(btn_simpanperubahan);
        btn_simpanperubahan.setBounds(1154, 874, 262, 96);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID Pelanggan", "ID Karyawan", "ID Galonman", "Nama Pelanggan", "Jumlah Pesanan", "Diskon", "Voucher", "Tanggal Pesanan", "Jumlah Pembayaran"
            }
        ));
        table.setGridColor(new java.awt.Color(0, 0, 0));
        jPanel1.add(table);
        table.setBounds(367, 237, 1063, 280);

        judultable_id.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        judultable_id.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        judultable_id.setText("ID Pelanggan");
        jPanel1.add(judultable_id);
        judultable_id.setBounds(367, 163, 122, 57);

        judultable_idk.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        judultable_idk.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        judultable_idk.setText("ID Karyawan");
        judultable_idk.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(judultable_idk);
        judultable_idk.setBounds(489, 163, 117, 57);

        judultable_idgalonman.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        judultable_idgalonman.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        judultable_idgalonman.setText("ID Galonman");
        judultable_idgalonman.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(judultable_idgalonman);
        judultable_idgalonman.setBounds(606, 163, 118, 57);

        judultable_nama.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        judultable_nama.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        judultable_nama.setText("Nama Pelanggan");
        judultable_nama.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(judultable_nama);
        judultable_nama.setBounds(724, 163, 118, 57);

        judultable_jmlpesanan.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        judultable_jmlpesanan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        judultable_jmlpesanan.setText("Jumlah Pesanan");
        judultable_jmlpesanan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(judultable_jmlpesanan);
        judultable_jmlpesanan.setBounds(842, 163, 117, 57);

        judultable_diskon.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        judultable_diskon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        judultable_diskon.setText("Diskon");
        judultable_diskon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(judultable_diskon);
        judultable_diskon.setBounds(959, 163, 117, 57);

        judultable_voucher.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        judultable_voucher.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        judultable_voucher.setText("Voucher");
        judultable_voucher.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(judultable_voucher);
        judultable_voucher.setBounds(1077, 163, 107, 57);

        judultable_tglpesanan.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        judultable_tglpesanan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        judultable_tglpesanan.setText("Tanggal Pesanan");
        judultable_tglpesanan.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(judultable_tglpesanan);
        judultable_tglpesanan.setBounds(1184, 163, 128, 57);

        judultable_jmlpembayaran.setFont(new java.awt.Font("Roboto", 1, 12)); // NOI18N
        judultable_jmlpembayaran.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        judultable_jmlpembayaran.setText("Jumlah Pembayaran");
        judultable_jmlpembayaran.setToolTipText("");
        judultable_jmlpembayaran.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(judultable_jmlpembayaran);
        judultable_jmlpembayaran.setBounds(1312, 163, 118, 57);

        paneljudul_table.setLayout(null);
        jPanel1.add(paneljudul_table);
        paneljudul_table.setBounds(367, 163, 1063, 57);

        panel_bground2.setBackground(new java.awt.Color(255, 255, 255));
        panel_bground2.setLayout(null);
        jPanel1.add(panel_bground2);
        panel_bground2.setBounds(358, 113, 1082, 911);

        panel_galon.setMinimumSize(new java.awt.Dimension(893, 861));
        panel_galon.setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gambar/GALON.jpg"))); // NOI18N
        jLabel2.setPreferredSize(new java.awt.Dimension(893, 163));
        jLabel2.setRequestFocusEnabled(false);
        jLabel2.setVerifyInputWhenFocusTarget(false);
        panel_galon.add(jLabel2);
        jLabel2.setBounds(0, 0, 893, 861);

        jPanel1.add(panel_galon);
        panel_galon.setBounds(431, 163, 893, 861);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1440, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1020, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_inputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_inputActionPerformed
        // TODO add your handling code here:
        new Form_Input().show();
    }//GEN-LAST:event_btn_inputActionPerformed

    private void btn_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_logoutActionPerformed
        // TODO add your handling code here:
        
        int response = JOptionPane.showConfirmDialog(null, "Apakah anda yakin ingin keluar ?", "LOGOUT", JOptionPane.YES_NO_OPTION);
            
        if(response == JOptionPane.YES_OPTION){
                    new Form_Login().show();
        }                                          
        else if(response==JOptionPane.NO_OPTION){
            
        }

    }//GEN-LAST:event_btn_logoutActionPerformed

    private void btn_batalkanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_batalkanActionPerformed
        // TODO add your handling code here:
        
        int response = JOptionPane.showConfirmDialog(null, "Yakin ingin Batalkan ?", "BATALKAN", JOptionPane.YES_NO_OPTION);
            
        if(response == JOptionPane.YES_OPTION){
            // Isi fungsinya disini ...        
        }                                          
        else if(response==JOptionPane.NO_OPTION){
            // Isi fungsinya disini ...
        }
        new Form_Caridata().show();
    }//GEN-LAST:event_btn_batalkanActionPerformed

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
            java.util.logging.Logger.getLogger(Form_MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Form_MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Form_MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Form_MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Form_Caridata().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_batalkan;
    private javax.swing.JButton btn_caridata;
    private javax.swing.JButton btn_input;
    private javax.swing.JButton btn_laporan;
    private javax.swing.JButton btn_logout;
    private javax.swing.JButton btn_refresh;
    private javax.swing.JButton btn_simpanperubahan;
    private javax.swing.JLabel jId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_id;
    private javax.swing.JLabel jLabel_nama;
    private javax.swing.JLabel jLabel_nohp;
    private javax.swing.JLabel jName;
    private javax.swing.JLabel jNohp;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel judultable_diskon;
    private javax.swing.JLabel judultable_id;
    private javax.swing.JLabel judultable_idgalonman;
    private javax.swing.JLabel judultable_idk;
    private javax.swing.JLabel judultable_jmlpembayaran;
    private javax.swing.JLabel judultable_jmlpesanan;
    private javax.swing.JLabel judultable_nama;
    private javax.swing.JLabel judultable_tglpesanan;
    private javax.swing.JLabel judultable_voucher;
    private javax.swing.JPanel panel_bground2;
    private javax.swing.JPanel panel_galon;
    private javax.swing.JPanel panel_judul;
    private javax.swing.JPanel panel_menu;
    private javax.swing.JPanel paneljudul_table;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables
}
