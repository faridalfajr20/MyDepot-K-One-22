package Controller;

/**
 *
 * @author GF63-622
 */
import Dao.KaryawanDao;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import Koneksi.Koneksi;
import Model.Karyawan;
import Form.Form_Login;
import Form.Form_Registrasi;

public class KaryawanController {
    Form_Login view;
    Form_Registrasi viewR;
    Karyawan karyawan;
    KaryawanDao karyawandao;
    Connection con;
    Statement stat;
    ResultSet rs;
    String sql;
    
    public KaryawanController(Form_Login view) {
        try {
            this.view = view;
            Koneksi k= new Koneksi();
            con = k.getKoneksi();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(KaryawanController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(KaryawanController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public KaryawanController(Form_Registrasi view) {
        try {
            this.viewR = view;
            Koneksi k = new Koneksi();
            con = k.getKoneksi();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(KaryawanController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(KaryawanController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void clearView(){
        view.getTxt_id_login().setText("");
        view.getTxt_password_login().setText("");
    }
    
    public void clearViewR(){
        viewR.getTxt_id_registrasi().setText("");
        viewR.getTxt_nama_registrasi().setText("");
        viewR.getTxt_nohp_registrasi().setText("");
        viewR.getTxtPassword().setText("");
        
    }
    
    public void isiComboK(){
        viewR.getCbo_k().removeAllItems();
        viewR.getCbo_k().addItem("Owner");
        viewR.getCbo_k().addItem("Karyawan");
    }
    
    public boolean onClickBtnLogin(){
        try {
            String username = view.getTxt_id_login().getText();
            karyawan = karyawandao.getKaryawan(con,username);
            if(view.getTxt_password_login().getText().equals(karyawan.getPassword())){
                JOptionPane.showMessageDialog(null, "Login Berhasil!");
                return true;
            }
            else{
                JOptionPane.showMessageDialog(null, "Password Salah");
                return false;
            }
        }catch (SQLException ex) {
            Logger.getLogger(Karyawan.class.getName()).log(Level.SEVERE, null, ex);
        }catch (NullPointerException ex){
            JOptionPane.showMessageDialog(view, "Username atau Password salah!");
            clearView();
        }
        return false;
    }
    
    public String getPasswordAttempt(){
        if(viewR.getTxtPassword().getText().equals("")){
            return "0";
        }else if(viewR.getTxtPassword().getText().length() < 5){
            return "-1";
        }else{
            return viewR.getTxtPassword().getText();
        }
    }
    
    public boolean IdCheck(){
        try{
            String id = viewR.getTxt_id_registrasi().getText();
            karyawan = karyawandao.getKaryawan(con,id);
            if(karyawan == null) return true;
        }catch (SQLException ex) {
            Logger.getLogger(KaryawanController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean NamaCheck(){
        try{
            String nama = viewR.getTxt_nama_registrasi().getText();
            karyawan = karyawandao.getKaryawan(con,nama);
            if(karyawan == null) return true;
        }catch (SQLException ex) {
            Logger.getLogger(KaryawanController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean NohpCheck(){
        try{
            String nohp = viewR.getTxt_nohp_registrasi().getText();
            karyawan = karyawandao.getKaryawan(con,nohp);
            if(karyawan == null) return true;
        }catch (SQLException ex) {
            Logger.getLogger(KaryawanController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    /*public boolean KeteranganCheck(){
        try{
            String keterangan = viewR.getCbo_k().addItem().getComboBox();
            karyawan = karyawandao.getKaryawan(con,keterangan);
            if(karyawan == null){
                String keterangan = karyawan.toString();//return true;
                Foo(keterangan);
            }
        }catch (SQLException ex) {
            Logger.getLogger(KaryawanController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }*/
    
    public boolean passwordCheck(){
        try{
            String password = viewR.getTxtPassword().getText();
            karyawan = karyawandao.getKaryawan(con,password);
            if(karyawan == null) return true;
        }catch (SQLException ex) {
            Logger.getLogger(KaryawanController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public void onClickBtnCreate(){
        if(getPasswordAttempt() == "0"){
            javax.swing.JOptionPane.showMessageDialog(viewR, "Password tidak boleh kosong!");
        }else if(getPasswordAttempt() == "-1"){
            javax.swing.JOptionPane.showMessageDialog(viewR, "Password minimal 5 Karakter!");
        }else if(getPasswordAttempt() == "1"){
            javax.swing.JOptionPane.showMessageDialog(viewR, "Password tidak sama!");
        }else{
            karyawan = new Karyawan();
            karyawan.setId_k(viewR.getTxt_id_registrasi().getText());
            karyawan.setNama_k(viewR.getTxt_nama_registrasi().getText());
            //karyawan.setKeterangan(viewR.getTxt_keterangan_registrasi().getText());
            karyawan.setNohp_k(viewR.getTxt_nohp_registrasi().getText());
            karyawan.setKeterangan(viewR.getCbo_k().getSelectedItem().toString()); 
            karyawan.setPassword(getPasswordAttempt());
            
            try {
                KaryawanDao.insert(con, karyawan);
                JOptionPane.showMessageDialog(viewR, "Berhasil Register");
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(viewR, "Error e "+ex.getMessage()); 
            }
        }
    } 
}