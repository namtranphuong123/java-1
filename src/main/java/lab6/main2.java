/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.util.ArrayList;

/**
 *
 * @author Admin
 */
public class main2 {
    public static void main(String[] args) {
        ArrayList<Bai2> list = new ArrayList<>();
        
        for(int i = 0; i < 5; i++){
            Bai2 sp = new Bai2();
            sp.nhap();
            
            list.add(sp);          
        }
        for (Bai2 sanPham : list){
            if (sanPham.getHang().equalsIgnoreCase("Nokia"));
            sanPham.xuat();
            System.out.println("");
        }
        
    }
}
