/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BTLamThem;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
abstract public class SinhVien {
    public String HoTen;
Scanner sc = new Scanner(System.in);
    public String getHoTen() {
        return HoTen;
    }
public void nhap(){
    System.out.println("xin mơi nhap vào ten sinh vien");
    String tenSV = sc.nextLine();
}
public void xuat(){
  
        System.out.printf("ho ten sinh vien : %s | diem tb %f \n",HoTen,getDiemTB());
        
}
    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }
    
    abstract public double getDiemTB();
}

