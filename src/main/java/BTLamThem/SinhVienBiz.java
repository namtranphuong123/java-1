/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BTLamThem;

/**
 *
 * @author Admin
 */
public class SinhVienBiz extends SinhVien {
public double diemkeToan,maketing,banHang;

    public SinhVienBiz() {
        
    }

    public SinhVienBiz(double diemkeToan, double maketing, double banHang) {
        
        this.diemkeToan = diemkeToan;
        this.maketing = maketing;
        this.banHang = banHang;
    }
public void nhap(){
    super.nhap();
    System.out.println("xin mơi nhap diem diem ke toan");
     diemkeToan= sc.nextDouble();
    System.out.println("xin mơi nhap mkt");
    maketing = sc.nextDouble();
    System.out.println("xin mơi nhap ban hang");
    banHang = sc.nextDouble();
}
public void xuat(){
  
        super.xuat();
       
         System.out.printf("ke toan: %f | maketing : %f |ban hang : %f | \n",diemkeToan,maketing,banHang);
}
    public double getDiemkeToan() {
        return diemkeToan;
    }

    public void setDiemkeToan(double diemkeToan) {
        this.diemkeToan = diemkeToan;
    }

    public double getMaketing() {
        return maketing;
    }

    public void setMaketing(double maketing) {
        this.maketing = maketing;
    }

    public double getBanHang() {
        return banHang;
    }

    public void setBanHang(double banHang) {
        this.banHang = banHang;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    @Override
    public double getDiemTB() {
       return(this.diemkeToan+this.maketing+this.banHang)/3;
    }

}
