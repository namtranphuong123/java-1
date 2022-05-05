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
public class SanPhamBai2 {

    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
     */

    /**
     *
     * @author Admin
     */
    String tenSP;
    double donGia;
    double giamGia;

    double getThue() {
        return (donGia - giamGia) * 0.1;
    }

    void nhap() {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Nhap ten san pham: ");
        tenSP = Sc.next();
        System.out.println("Nhap gia san pham: ");
        donGia = Sc.nextDouble();
        System.out.println("Nhap ma giam gia: ");
        giamGia = Sc.nextDouble();
    }

    void xuat() {
        System.out.println("Hoa don thanh toan");
        System.out.println("Ten san pham la: " + tenSP);
        System.out.println("Don gia san pham la: " + donGia);
        System.out.println("Muc giam gia la: " + giamGia);
        System.out.println("Thue nhap khau la: " + getThue());
        System.out.println("Tong tien phai tra =  " + (donGia - giamGia + getThue()));
        System.out.println("--------------------------------------------------------");

    }

}
