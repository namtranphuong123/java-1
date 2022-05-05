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
public class SanPham {
    private String tenSP;
    private double donGia;
    private double giamGia;

     public SanPham(String tensp, double dongia){
        this.tenSP = tensp;
        this.donGia = dongia;
        this.giamGia = 0;
}
      public SanPham(String tensp, double dongia, double giamgia){
          tenSP = tensp; donGia = dongia; giamGia = giamgia;
      }
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
        System.out.println("Hoa don thanh toan");
        System.out.println("Ten san pham la: " + tenSP);
        System.out.println("Don gia san pham la: " + donGia);
        System.out.println("Muc giam gia la: " + giamGia);
        System.out.println("Thue nhap khau la: " + getThue());
        System.out.println("Tong tien phai tra =  " + (donGia - giamGia + getThue()));
        System.out.println("--------------------------------------------------------");
        
    }
     
}
