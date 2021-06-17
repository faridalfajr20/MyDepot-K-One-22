/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExportExcel;

/**
 *
 * @author Kuuhaku
 */

import ExportExcel.FormExport;
import Koneksi.Koneksi;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;


public class ExportData {
    FormExport view;
    Connection con;
    
    public ExportData(FormExport view) {
         try {
            this.view = view;
            Koneksi k= new Koneksi();
            con = k.getKoneksi();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ExportData.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ExportData.class.getName()).log(Level.SEVERE, null, ex);
        }
         
    }

    public void karyawan(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/mydepot_k_one","root","");
            Statement statement = con.createStatement();
            FileOutputStream fileOut;
            fileOut = new FileOutputStream("C:\\MyDepot K'One\\MyDepot K'One\\Laporan\\karyawan.xls");
            HSSFWorkbook workbook = new HSSFWorkbook();
            HSSFSheet worksheet = workbook.createSheet("Sheet 0");
            Row row1 = worksheet.createRow((short)0);
            row1.createCell(0).setCellValue("id_p") ;
            row1.createCell(1).setCellValue("id_k");
            row1.createCell(2).setCellValue("id_p");
            row1.createCell(3).setCellValue("jmlpesanan");
            row1.createCell(4).setCellValue("diskon");
            row1.createCell(7).setCellValue("voucher");
            row1.createCell(8).setCellValue("tglpesanan");
            row1.createCell(9).setCellValue("biaya");
            Row row2 ;
            ResultSet rs = statement.executeQuery("SELECT id_k, id_p, jmlpesanan, diskon, voucher, tglpesanan, biaya FROM memesan ");
            while(rs.next()){
                int a = rs.getRow();
                row2 = worksheet.createRow((short)a);
                row2.createCell(0).setCellValue(rs.getString(1));
                row2.createCell(1).setCellValue(rs.getString(2));
                row2.createCell(2).setCellValue(rs.getString(3));
                row2.createCell(3).setCellValue(rs.getString(4));
                row2.createCell(4).setCellValue(rs.getString(5));
                row2.createCell(5).setCellValue(rs.getString(6));
                row2.createCell(6).setCellValue(rs.getString(7));
                row2.createCell(7).setCellValue(rs.getString(8));
                
                }
                workbook.write(fileOut);
                fileOut.flush();
                fileOut.close();
                rs.close();
                statement.close();
                con.close();
                JOptionPane.showMessageDialog(null,"Export Berhasi! File Tersimpan pada Folder Laporan_Pesanan");
            }catch(ClassNotFoundException e){
                System.out.println(e);
            }catch(SQLException ex){
                System.out.println(ex);
            }catch(IOException ioe){
                System.out.println(ioe);
        }JOptionPane.showMessageDialog(null,"TERIMAKASIH!");
    }
    
   /* public void buku(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/pbo_1911081001","root","");
            Statement statement = con.createStatement();
            FileOutputStream fileOut;
            fileOut = new FileOutputStream("F:\\LAPORAN EXPORT EXCEL PBO\\buku.xls");
            HSSFWorkbook workbook = new HSSFWorkbook();
            HSSFSheet worksheet = workbook.createSheet("Sheet 0");
            Row row1 = worksheet.createRow((short)0);
            row1.createCell(0).setCellValue("kodebuku") ;
            row1.createCell(1).setCellValue("judulbuku");
            row1.createCell(2).setCellValue("penerbit");
            row1.createCell(3).setCellValue("tahunterbit");
            Row row2 ;
            ResultSet rs = statement.executeQuery("SELECT kodebuku,judulbuku,penerbit,tahunterbit FROM buku ");
            while(rs.next()){
                int a = rs.getRow();
                row2 = worksheet.createRow((short)a);
                row2.createCell(0).setCellValue(rs.getString(1));
                row2.createCell(1).setCellValue(rs.getString(2));
                row2.createCell(2).setCellValue(rs.getString(3));
                row2.createCell(3).setCellValue(rs.getString(4));
                }
                workbook.write(fileOut);
                fileOut.flush();
                fileOut.close();
                rs.close();
                statement.close();
                con.close();
                JOptionPane.showMessageDialog(null,"Export Berhasi! File Tersimpan Di Folder LAPORAN");
            }catch(ClassNotFoundException e){
                System.out.println(e);
            }catch(SQLException ex){
                System.out.println(ex);
            }catch(IOException ioe){
                System.out.println(ioe);
        }JOptionPane.showMessageDialog(null,"TERIMAKASIH!");
    }
    public void peminjaman(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/pbo_1911081001","root","");
            Statement statement = con.createStatement();
            FileOutputStream fileOut;
            fileOut = new FileOutputStream("F:\\LAPORAN EXPORT EXCEL PBO\\peminjaman.xls");
            HSSFWorkbook workbook = new HSSFWorkbook();
            HSSFSheet worksheet = workbook.createSheet("Sheet 0");
            Row row1 = worksheet.createRow((short)0);
            row1.createCell(0).setCellValue("kodeanggota") ;
            row1.createCell(1).setCellValue("tglpinjam");
            row1.createCell(2).setCellValue("tglkembali");
            row1.createCell(3).setCellValue("status");
            Row row2 ;
            ResultSet rs = statement.executeQuery("SELECT kodeanggota,tglpinjam,tglkembali,status FROM peminjaman ");
            while(rs.next()){
                int a = rs.getRow();
                row2 = worksheet.createRow((short)a);
                row2.createCell(0).setCellValue(rs.getString(1));
                row2.createCell(1).setCellValue(rs.getString(2));
                row2.createCell(2).setCellValue(rs.getString(3));
                row2.createCell(3).setCellValue(rs.getString(4));
                }
                workbook.write(fileOut);
                fileOut.flush();
                fileOut.close();
                rs.close();
                statement.close();
                con.close();
                JOptionPane.showMessageDialog(null,"Export Berhasi! File Tersimpan Di Folder LAPORAN");
            }catch(ClassNotFoundException e){
                System.out.println(e);
            }catch(SQLException ex){
                System.out.println(ex);
            }catch(IOException ioe){
                System.out.println(ioe);
        }JOptionPane.showMessageDialog(null,"TERIMAKASIH!");
    }
    public void pengembalian(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/pbo_1911081001","root","");
            Statement statement = con.createStatement();
            FileOutputStream fileOut;
            fileOut = new FileOutputStream("F:\\LAPORAN EXPORT EXCEL PBO\\pengembalian.xls");
            HSSFWorkbook workbook = new HSSFWorkbook();
            HSSFSheet worksheet = workbook.createSheet("Sheet 0");
            Row row1 = worksheet.createRow((short)0);
            row1.createCell(0).setCellValue("kodeanggota") ;
            row1.createCell(1).setCellValue("kodebuku");
            row1.createCell(2).setCellValue("tglpinjam");
            row1.createCell(3).setCellValue("terlambat");
            row1.createCell(4).setCellValue("denda");
            Row row2 ;
            ResultSet rs = statement.executeQuery("SELECT kodeanggota,kodebuku,tglpinjam,terlambat,denda FROM pengembalian ");
            while(rs.next()){
                int a = rs.getRow();
                row2 = worksheet.createRow((short)a);
                row2.createCell(0).setCellValue(rs.getString(1));
                row2.createCell(1).setCellValue(rs.getString(2));
                row2.createCell(2).setCellValue(rs.getString(3));
                row2.createCell(3).setCellValue(rs.getString(4));
                row2.createCell(4).setCellValue(rs.getString(5));
                }
                workbook.write(fileOut);
                fileOut.flush();
                fileOut.close();
                rs.close();
                statement.close();
                con.close();
                JOptionPane.showMessageDialog(null,"Export Berhasi! File Tersimpan Di Folder LAPORAN");
            }catch(ClassNotFoundException e){
                System.out.println(e);
            }catch(SQLException ex){
                System.out.println(ex);
            }catch(IOException ioe){
                System.out.println(ioe);
        }
        JOptionPane.showMessageDialog(null,"TERIMAKASIH!");
    }*/
    
    
    public void viewTable1(){
        try {
            DefaultTableModel tabelModel =
                    (DefaultTableModel) view.getTabelDB().getModel();
            tabelModel.setRowCount(0);
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/mydepot_k_one","root","");
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM karyawan");
            while(rs.next()){
                Object[] data={
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4)
                };
                tabelModel.addRow(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ExportData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /*public void viewTable2(){
        try {
            DefaultTableModel tabelModel =
                    (DefaultTableModel) view.getTabelDB().getModel();
            tabelModel.setRowCount(0);
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/pbo_1911081001","root","");
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM buku");
            while(rs.next()){
                Object[] data={
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4)
                };
                tabelModel.addRow(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ExportData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void viewTable3(){
        try {
            DefaultTableModel tabelModel =
                    (DefaultTableModel) view.getTabelDB().getModel();
            tabelModel.setRowCount(0);
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/pbo_1911081001","root","");
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM peminjaman");
            while(rs.next()){
                Object[] data={
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5)
                };
                tabelModel.addRow(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ExportData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void viewTable4(){
        try {
            DefaultTableModel tabelModel =
                    (DefaultTableModel) view.getTabelDB().getModel();
            tabelModel.setRowCount(0);
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/pbo_1911081001","root","");
            Statement statement = con.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM pengembalian");
            while(rs.next()){
                Object[] data={
                    rs.getString(1),
                    rs.getString(2),
                    rs.getString(3),
                    rs.getString(4),
                    rs.getString(5),
                    rs.getString(6)
                };
                tabelModel.addRow(data);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ExportData.class.getName()).log(Level.SEVERE, null, ex);
        }
    }*/
}
