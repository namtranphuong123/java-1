/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AssignmentJava1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public abstract class NhanVien {
// các trường và kiểu dữ liệu của nó
     String manv;
     String HoTen,loai;
     double luong;
     
     
public abstract double getThuNhap(
// phương thức abtract dùng để get thu nhập của từng lớp nhân viên , nếu muốn sử dụng cần phải oriver các phương thức ở lớp khác 
);

    public NhanVien() {
        // hàm tạo không tham số
    }
public void nhap(Scanner scanner){
    //phương thức nhập ở lớp nhân viên dùng chung cho các lớp nhân viên khác . dùng sanner để nhận dữ liệu từ bàn phím
    System.out.println("nhap ma");
    this.manv = scanner.nextLine();
      System.out.println("nhap ho ten");
    this.HoTen = scanner.nextLine();
      System.out.println("nhap luong");
    this.luong = scanner.nextDouble();
    scanner.nextLine();
    
}
public void xuat() {
    // phương thức xuất dùng chung cho các lớp nhân viên
        System.out.printf("ma nv  :     %s     | ho ten nhan vien :     %s     | loai nhan vien :    %s   | luong :    %s    |  thu nhap nhan vien :     %.2f    \n"
                ,manv,HoTen,loai,luong,getThuNhap());
//        System.out.printf("\n");
//        System.out.printf("\n");
//        System.out.printf("\n");
//        System.out.printf(" \n");
        }
    public NhanVien(String manv, String HoTen, String loai, double luong) {
        // hàm tạo có tham số
        this.manv = manv;
        this.HoTen = HoTen;
        this.loai = loai;
        this.luong = luong;
    }
// các hàm getter , setter cho các trường đã định nghĩa
    public String getManv() {
        return manv;
    }

    public void setManv(String manv) {
        this.manv = manv;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    public String getLoai() {
        return loai;
    }

    public void setLoai(String loai) {
        this.loai = loai;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }

    

    
}
