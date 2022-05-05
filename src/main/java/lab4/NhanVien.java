/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class NhanVien {

    String ten;
    int tuoi;
    String diachi;
    double luong;
    int giolam;

    public NhanVien() {
    }

    public NhanVien(String ten, int tuoi, String diachi, double luong, int giolam) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.diachi = diachi;
        this.luong = luong;
        this.giolam = giolam;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    public int getGiolam() {
        return giolam;
    }

    public void setGiolam(int giolam) {
        this.giolam = giolam;
    }

    public void vao() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban  nhap ten");
        ten = scanner.nextLine();
        System.out.println("Moi ban  nhap tuoi");
        tuoi = scanner.nextInt();

        System.out.println("Moi ban  nhap number 1");
        diachi = scanner.nextLine();
        System.out.println("Moi ban  nhap number 2");
        luong = scanner.nextDouble();

        System.out.println("Moi ban  nhap number 1");
        giolam = scanner.nextInt();

    }

    public void ra() {
        System.out.printf("ten nhan vien : %s|tuoi nhan vien:%d|dia chi nhan vien: %s|luong nhan vien %f|gio lam tong cong :%d", ten, tuoi, diachi, luong, giolam);
    }
}
