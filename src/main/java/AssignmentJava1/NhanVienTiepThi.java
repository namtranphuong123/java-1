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
public class NhanVienTiepThi extends NhanVien{
    //khai báo hai trường dùng riêng cho class nhân viên tiếp thị bằng cách khai báo private 
    private double DoanhSo;
    private double HueHong;

     public  NhanVienTiepThi (String manv, String HoTen,  double luong){
        // hàm tạo kế thừa từ lớp cha nhanvien nhưng loại mặc định là tiếp thị
       super(manv, HoTen,"TiepThi",  luong);
   }

    public NhanVienTiepThi() {
        //hàm tạo không tham số
    }
    @Override
    public void nhap(Scanner scanner){
        //bổ sung phương thức nhập của lớp cha và thêm vào nhập hai trường nhận dữ liệu cho hai trường dùng riêng cho lớp 
    super.nhap(scanner);
    System.out.println("nhap doanh so");
    DoanhSo = scanner.nextDouble();
     System.out.println("nhap hoa hong");
    HueHong = scanner.nextDouble();
    scanner.nextLine();
}

    @Override
    public void xuat() {
       // bổ sung vào phương thức xuất của doanhSo và HueHong đồng thời cho kế thừa phương thức xuất của lớp cha 
    super.xuat();
        System.out.printf("doanh so : %s",DoanhSo);
        System.out.printf("hoa hong  : %s",HueHong);
       
        }
    public NhanVienTiepThi( String manv, String HoTen, double luong,double DoanhSo,double HueHong) {
       // hàm tạo có tham số riêng của lớp
        super(manv, HoTen, "TiepThi", luong);
        this.DoanhSo = DoanhSo;
        this.HueHong = HueHong;
    }
// get và set cho hai trường riêng của lớp 
    public double getDoanhSo() {
        return DoanhSo;
    }

    public void setDoanhSo(double DoanhSo) {
        this.DoanhSo = DoanhSo;
    }

    public double getHueHong() {
        return HueHong;
    }

    public void setHueHong(double HueHong) {
        this.HueHong = HueHong;
    }

    @Override
    public double getThuNhap() {
       // phương thức get thu nhập riêng của lớp tiếp thị
return getLuong()+DoanhSo+HueHong/100;   }
     
}
