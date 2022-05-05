/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class DanhSachSP {

    private ArrayList<lab5Bai3> list = new ArrayList<>();
    Scanner s = new Scanner(System.in);

    public void nhap() {
        System.out.println("nhap danh sach san pham ");
        Scanner s = new Scanner(System.in);
        int i = 1;
        do {
            System.out.println("nhap ten san pham ");
            String ten = s.nextLine();
            if (ten == null || ten.equals("")) {
                break;

            }
            System.out.println("nhap giasan pham ");
            double gia = s.nextDouble();
            list.add(new lab5Bai3(ten, gia));
            s.nextLine();
            i++;
        } while (true);
    }

    public void xuat() {
        System.out.println("danh sach san pham ");
        System.out.println("Ten\t\t|gia\t\t");
        for (lab5Bai3 lb : list) {
            System.out.printf("%20s | %.2f \n", lb.getTen(), lb.getGia());
        }
    }

    public void xapxep() {
        Collections.sort(list, (a, b) -> (int) (a.getGia() - b.getGia()));
        System.out.println("danh sach san pham da xap xep ");
        xuat();
    }

    public void timkiem() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap san pham can xoa");
        String ten = scanner.nextLine();
        lab5Bai3 found = null;
        for (lab5Bai3 lb : list) {
            if (lb.getTen().equals(ten)) {
                found = lb;
            }
            break;
        }
        if (found != null) {
            list.remove(found);
            System.out.println("san pham da duoc xoa");
        } else {
            System.out.println("san pham khong ton tai");
        }
    }

    public void tinhtrungbinh() {
        double vag = 0, sum = 0;
        for (lab5Bai3 lb : list) {
            sum += lb.getGia();
        }
        vag = sum / list.size();
        System.out.println("gia trung binh cua cac san pham la " + vag);
    }

    public void menu() {
        System.out.println("-------------------------------------");
        System.out.println("MENU CHUC NANG");
        System.out.println("1: nhap danh sach");
        System.out.println("2: hien thi danh sach");
        System.out.println("3: xap xep danh sach");

        System.out.println("4: tim kiem va xoa theo ten");
        System.out.println("5: timgia trung binh");
        System.out.println("6: thoatch uong trinh");
        System.out.println("chuc nang ban chon");
        int a = s.nextInt();
        switch (a) {
            case 1:
                nhap();
                break;

            case 2:
                xuat();
                break;
            case 3:
                xapxep();
                break;
            case 4:
                timkiem();
                break;
            case 5:
                tinhtrungbinh();
                break;
        }
    }
}
