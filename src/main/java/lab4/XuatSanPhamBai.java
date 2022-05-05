/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author Admin
 */
public class XuatSanPhamBai {
    public static void main(String[] args) {

         SanPhamBai3 sp1 = new SanPhamBai3("iphone",40000,2000);
        
       
        sp1.xuat();
        String ten =sp1.getTenSP();
        System.out.println("TenSP  "+ten);
        sp1.setTenSP("iphoneX");
        sp1.xuat();
        SanPhamBai3 sp2;
        sp2 = new SanPhamBai3("iphone11",6000000);
        
        sp2.xuat();
        
        
      
    }
}
