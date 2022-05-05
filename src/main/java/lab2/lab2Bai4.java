/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class lab2Bai4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("+ ----------------------------------- +");
        System.out.println("+ 1: giai phuong trinh bac nhat       .");
        System.out.println("+ 2: giai phuong trinh bac hai        .");
        System.out.println("+ 3: tinh tien dien                   .");
        System.out.println("+ 4: ket thuc                         .");
        System.out.println("+ ----------------------------------- +");
boolean cont = true;
		do {
        System.out.println("xin moi chon chuc nang tu 1 toi 4  ");
        int chon = scanner.nextInt();
        
        switch (chon) {
            case 1:

                bai1();
                break;
            case 2:
                bai2();
                break;
            case 3:
                bai3();
                break;
            case 4:
               System.exit(0);
                break;
                 
        }
         } while (cont);
        
    }

    public static void bai1() {
        //muốn nhận dữ liệu từ bàn phím , cần dùng lệnh scanner để nhận 
        Scanner scanner = new Scanner(System.in);

        System.out.println("xin moi a");
        
        int a = scanner.nextInt();
        System.out.println("xin moi b");
        int b = scanner.nextInt();
        if (a == 0) {

            if (b == 0) {
                System.out.println("vo so nghiem");
            } else {
                System.out.println("vo nghiem");
            }
        } else {
            int x;
            x = -b / a;

            System.out.printf("Nghiem cua phuong trinh la: %d ", x);
        }

    }

    public static void bai2() {

         Scanner scanner = new Scanner(System.in);
 double ptbac1, x, x1, x2, delta, canbaca;
        System.out.println("xin moi nhap a");

        double a = scanner.nextDouble();
        System.out.println("xin moi nhap b");

        double b = scanner.nextDouble();
        System.out.println("xin moi nhap c");

        double c = scanner.nextDouble();

        if (a == 0) {
          ptbac1();
        } else if (a != 0) {
            delta = Math.pow(b, 2) - 4 * a * c;

            if (delta < 0) {
                System.out.println("phuong trinh vo nghiem");
            } else if (delta == 0) {
                x = -b / (2 * a);
                System.out.printf("nghiem kep cua phuong trinh la : %f", x);
            } else {
                canbaca = Math.sqrt(delta);
                x1 = (-b + canbaca) / (2 * a);
                x2 = (-b - canbaca) / (2 * a);
                System.out.printf("nghiem x1 cua phuong trinh la : %f", x1);
                System.out.printf("nghiem x1 cua phuong trinh la : %f", x2);

            }

        }
    }
    public static void ptbac1() {
        //muốn nhận dữ liệu từ bàn phím , cần dùng lệnh scanner để nhận 
        Scanner scanner = new Scanner(System.in);

        System.out.println("xin moi nhap a");
       
        int a = scanner.nextInt();
         System.out.println("xin moi nhap b");
        int b = scanner.nextInt();
        if (a == 0) {

            if (b == 0) {
                System.out.println("vo so nghiem");
            } else {
                System.out.println("vo nghiem");
            }
        } else {
            int x;
            x = -b / a;

            System.out.printf(" \n Nghiem cua phuong trinh la: %d ", x,"\n");
        }

    }
    
    
     public static void bai3(){
        int tien;
        Scanner scanner = new Scanner(System.in);

        System.out.println("xin moi nhap so dien cua ban");

        int a = scanner.nextInt();
        if (a < 50) {
            tien = a * 1000;
            System.out.printf("\n tien dien thang nay la: %d vnd", tien, "\n");
        } else {
            tien = 50 * 1000 + (a - 50) * 1200;
            System.out.printf("\n tien dien thang nay la: %d vnd", tien, "\n");
        }
    }
}
