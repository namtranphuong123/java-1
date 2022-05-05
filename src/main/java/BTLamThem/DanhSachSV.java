/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BTLamThem;

import AssignmentJava1.NhanVien;
import AssignmentJava1.NhanVienHanhChinh;
import AssignmentJava1.NhanVienTiepThi;
import AssignmentJava1.TruongPhong;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class DanhSachSV {
private ArrayList<SinhVien> list = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    public void nhap() {
        
    

    
        do {            
            System.out.println("xin mơi nhap loai sinh vien \n"
                + "nhap 1 : Sinh vien IT\n"
                + "nhap 2 : Sinh Vien Biz \n"
                + "nhap rong de thoat");
        String Loai = scanner.nextLine();
        if (Loai == null || Loai.equals("")) {
            break;
        }
        int iLoai = Integer.parseInt(Loai);
        switch (iLoai) {
            case 1:
                SinhVienIT it = new SinhVienIT();
                it.nhap();
                list.add(it);
                break;
            case 2:
                SinhVienBiz bz = new SinhVienBiz();
                bz.nhap();
                list.add(bz);
                break;
            
        }

    }

while (true);
    }
    public void xuat() {
        System.out.println("Danh Sach sinh Vien");
        for (SinhVien nhv : list) {
            if(nhv instanceof SinhVienIT){
                ((SinhVienIT)nhv).xuat();
            }else if(nhv instanceof SinhVienBiz){
                ((SinhVienBiz)nhv).xuat();
            }
                
            System.out.println("\n--------------------------");
        }
        
    }
}
