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
public class SinhVienIT extends SinhVien{
public double diemJava,diemCss;

    public SinhVienIT() {
    }
public void nhap(){
    super.nhap();
    System.out.println("xin mơi nhap diem java");
     diemJava= sc.nextDouble();
    System.out.println("xin mơi nhap diem css");
    diemCss = sc.nextDouble();
}
public void xuat(){
  
        super.xuat();
        System.out.printf("diem java : %f | diem css: %f | \n",diemJava,diemCss);
        
}
    public SinhVienIT(String HoTen,double diemJava, double diemCss) {
        this.HoTen = HoTen;
        this.diemJava = diemJava;
        this.diemCss = diemCss;
    }

    public double getDiemJava() {
        return diemJava;
    }

    public void setDiemJava(double diemJava) {
        this.diemJava = diemJava;
    }

    public double getDiemCss() {
        return diemCss;
    }

    public void setDiemCss(double diemCss) {
        this.diemCss = diemCss;
    }

    public String getHoTen() {
        return HoTen;
    }

    public void setHoTen(String HoTen) {
        this.HoTen = HoTen;
    }

    @Override
    public double getDiemTB() {
return (2*this.diemJava+this.diemCss)/3;
    }
    
}
