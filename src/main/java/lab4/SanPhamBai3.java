/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class SanPhamBai3 {
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Admin
 */

     private  String tenSP;
   private double donGia;
    private double giamGia;

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public SanPhamBai3(String tenSP, double donGia, double giamGia) {
        this.tenSP = tenSP;
        this.donGia = donGia;
        this.giamGia = giamGia;
    }

    public SanPhamBai3(String tenSP,double donGia) {
         this.tenSP = tenSP;
        this.donGia = donGia;
        this.giamGia = 0;
    }

    

    
   
   private double getThue(){
        return (donGia - giamGia)*0.1;
    }
    public void nhap(){
        Scanner Sc = new Scanner(System.in);
        System.out.println("Nhap ten san pham: ");
        tenSP = Sc.next();
        System.out.println("Nhap gia san pham: ");
        donGia = Sc.nextDouble();
        System.out.println("Nhap ma giam gia: ");
        giamGia = Sc.nextDouble();
    }
    public void xuat(){
       
        System.out.println("Ten san pham la: " + tenSP);
        System.out.println("Don gia san pham la: " + donGia);
        System.out.println("Muc giam gia la: " + giamGia);
        System.out.println("Thue nhap khau la: " + getThue());
        System.out.println("Tong tien phai tra =  " + (donGia - giamGia + getThue()));
        System.out.println("--------------------------------------------------------");
        
    }
     
}


