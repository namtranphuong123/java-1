/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai2 {
    
    private String tenSp;
    private double donGia;
    private String hang;

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public void nhap() {
        Scanner s = new Scanner(System.in);
        System.out.print("Ten Sp:");
        tenSp = s.nextLine();

        System.out.print("Nhap don gia:");
        donGia = s.nextDouble();

        s.nextLine();
        System.out.println("Nhap hang:");
        hang = s.nextLine();
    }

    public void xuat() {
        System.out.printf("Ten: %s - Don gia: %f - Hang: %s", tenSp, donGia, hang);
    }

}
