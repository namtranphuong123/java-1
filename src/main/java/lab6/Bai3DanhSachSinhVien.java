/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bai3DanhSachSinhVien {
    private ArrayList<Bai3> list = new ArrayList<>();
    
    public void nhap(){
        Scanner s = new Scanner(System.in);
        for (int i = 1; i < 2; i++){
            Bai3 sv = new Bai3();
            sv.nhap(s);
            
            list.add(sv);
        }        
    }
    public void xuat(){
        System.out.println("----------------------------------");
        System.out.println("Danh sach sinh vien");
        for (Bai3 item : list){
            item.xuat();
        }
    }
}
