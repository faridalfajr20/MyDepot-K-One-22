/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author User
 */
public class Memesan {
    int nopesanan;
    String id_p;
    String id_k;
    String id_air;
    String tglpesanan;
    double biaya;
    int diskon;
    String voucher;
    
    public int getNopesanan() {
        return nopesanan;
    }
    
    public void setNopesanan(int nopesanan) {
        this.nopesanan = nopesanan;
    }

    public String getId_p() {
        return id_p;
    }
    
    public void setId_p(String id_p) {
        this.id_p = id_p;
    }
    
     public String getId_k() {
        return id_k;
    }
    
    public void setId_k(String id_k) {
        this.id_k = id_k;
    }
    
    public String getId_air() {
        return id_air;
    }
    
    public void setId_air(String id_air) {
        this.id_air = id_air;
    }
    
    public String getTglpesanan() {
        return tglpesanan;
    }
    
    public void setTglpesanan(String tglpesanan) {
        this.tglpesanan = tglpesanan;
    }
    
    public double getBiaya() {
        return biaya;
    }
    
    public void setBiaya(double biaya) {
        this.biaya = biaya;
    }
    
    public int getDiskon() {
        return diskon;
    }
    
    public void setDiskon(int diskon) {
        this.diskon = diskon;
    }
    
    public String getVoucher() {
        return voucher;
    }
    
    public void setVoucher(String voucher) {
        this.voucher = voucher;
    }
}