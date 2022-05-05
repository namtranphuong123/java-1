/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lab4;

import java.util.Scanner;

/**
 *
 * @author Laptop VinhLink
 */
public class DemoNhapSinhVien {
    public String fullname;
    double diemTB;
    
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten: ");
        fullname = sc.nextLine();
        
        System.out.println("Nhap diem trung binh");
        diemTB = sc.nextDouble();
    }
    public void xuat(){
        System.out.println("\n--------------------");
        System.out.printf("Ho ten sinh vien: %s - diem TB: %f - Hoc luc: %s", fullname, diemTB, xepLoai());
    }
    public String xepLoai(){
            if (diemTB < 5) {
                System.out.println("Xep loai yeu");
            } else if (diemTB < 6.5) {
                System.out.println("Xep loai trung binh");
            } else if (diemTB < 7.5) {
                System.out.println("Xep loai kha");
            } else if (diemTB < 9) {
                System.out.println("Xep loai gioi");
            } else if (diemTB >= 9 && diemTB <= 10) {
                System.out.println("Xep loai xuat sac");
            }
        return null ;
    }
}
    

