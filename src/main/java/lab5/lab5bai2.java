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
public class lab5bai2 {

    ArrayList<String> arr = new ArrayList<String>();
Scanner sc = new Scanner(System.in);
    public void nhap() {
        
        do {
            System.out.println("moi bạn nhap ho ten");
            String x = sc.nextLine();
            if (x.isEmpty()) {
                break;
            }
            arr.add(x);
        } while (true);
    }

    public void xuat() {
        System.out.println("danh sach ho ten");

        for (String item : arr) {
            System.out.printf("danh sach ho ten " + item);
        }
    }

    public void xuatngaunhien() {
        Collections.shuffle(arr);
        xuat();
    }

    public void xapxep() {
        Collections.sort(arr, (a, b) -> a.compareTo(b));
        xuat();
    }

    public void timvaxoa() {
             
        System.out.println("nhap ho ten can tim va xoa");
        String hoten = sc.nextLine();
        for (String item : arr) {
            if (item.equals(hoten)) {
                arr.remove(item);
                break;
            }
        }
    }

    public void menu() {
        System.out.println("-------------------------------------");
        System.out.println("MENU CHUC NANG");
        System.out.println("1: nhap danh sach");
        System.out.println("2: hien thi danh sach");
        System.out.println("3: xap xep danh sach");
        System.out.println("4: hien thi ngau nhien");
        System.out.println("5: tim kiem va xoa theo ten");
        System.out.println("6: thoatch uong trinh");
        System.out.println("chuc nang ban chon");
        int a = sc.nextInt();
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
                xuatngaunhien();
                break;
            case 5:
                timvaxoa();
                break;
            case 6:
                System.exit(0);
                break;

        }
    }
}
