/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.util.Scanner;
import static lab3.lab3Bai4.xapxep;

/**
 *
 * @author Admin
 */
public class SinhVien {

    public String HoTen;
    public float Diem;

    public SinhVien() {
    }

    public SinhVien(String HoTen, float Diem) {
        this.HoTen = HoTen;
        this.Diem = Diem;
    }

     
    public void input() {
        Scanner scanner = new Scanner(System.in);

// mời người dùng nhập vào số sinh viên sau đó gán vào biến n và chuyển từ dạng double sang kiểu string
        //nhap ten
        System.out.println("nhap ten: ");
        HoTen = scanner.nextLine();
//nhập điểm 
        System.out.println("nhap diem: ");

        Diem = Float.parseFloat(scanner.nextLine());
        //xuat thong tin

    }

    public void xuat() {
        System.out.println();

        System.out.printf("HO ten sinh vien la: %s", HoTen);
        System.out.println();
        System.out.printf("Diem sinh vien la: %.1f diem  "
                + " hoc luc : %s", Diem , xeploai());
        System.out.println();
    }

    public String xeploai() {
        if (Diem >= 9) {

            System.out.println("Xuat sac");
        } else if (Diem >= 7.5) {
            System.out.println("gioi");
        } else if (Diem >= 6.5) {
            System.out.println("kha");
        } else if (Diem >= 5) {
            System.out.println("trung binh");
        } else {
            System.out.println("yeu");
        }
        return null;
    }
}
