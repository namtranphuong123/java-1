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
public class NhanVienHanhChinh extends NhanVien{
    public NhanVienHanhChinh() {
        // hàm tạo của lớp nhân viên hành chính 
        //dùng super để kế thừ các đặc tính từ hàm tạo của lớp cha nhưng loại thì mặc định là hành chính 
       
        super(null, null,"HanhChinh",0);
    }
    
   public  NhanVienHanhChinh (String manv, String HoTen,   double luong){
       super(manv, HoTen,"HanhChinh",  luong);
   }
//override để sử dụng phương thức getThuNhap() từ lớp abtract nhân viên
    @Override
    public double getThuNhap() {
return getLuong();    }

    

    
 
}
