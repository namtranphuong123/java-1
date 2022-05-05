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
public class TruongPhong extends NhanVien{
    private double luongTrachNhiem;
// private trường dữ liệu riêng của lớp 
    public TruongPhong() {
        // hàm tạo không tham số
    }
public TruongPhong(String manv, String HoTen, double luong) {
   // hàm tạo kế thừa từ lớp cha
        super(manv, HoTen,"Truongphong", luong);
        
    }
    public TruongPhong(String manv, String HoTen, double luong,double luongTrachNhiem) {
       // hàm tạo có trường riêng của lớp 
        super(manv, HoTen,"Truongphong", luong);
        this.luongTrachNhiem = luongTrachNhiem;
    }
    @Override
    public void nhap(Scanner scanner){
      //  phương thức nhập có bổ sung thêm biến nhận dữ liệu riêng của lớp
    super.nhap(scanner);
    System.out.println("nhap Luong trach nhiem");
    luongTrachNhiem= scanner.nextDouble();
    scanner.nextLine();
    
}
    @Override
    public void xuat() {
        // xuất kế thừa từ lớp cha đồng thời bổ xung thêm xuất lương trách nhiệm
        super.xuat();
           System.out.printf("luong trach nhiem %s",luongTrachNhiem);
        }
   // các phương thức get và set của trường lương trách nhiệm 
    public double getLuongTrachNhiem() {
        return luongTrachNhiem;
    }

    public void setLuongTrachNhiem(double luongTrachNhiem) {
        this.luongTrachNhiem = luongTrachNhiem;
    }

    @Override
    public double getThuNhap() {
        //toán tử tính riêng của phương thức getThuNhap của lớp trưởng phòng
return getLuong()+luongTrachNhiem;    }
    
}
