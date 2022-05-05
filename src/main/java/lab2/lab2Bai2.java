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
public class lab2Bai2 {

    public static void main(String[] args) {
        

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
        } else {

            delta = Math.pow(b, 2) - 4 * a * c;
            if (delta < 0) {
                System.out.println("phuong trinh vo nghiem");
            } else if (delta == 0) {
                x = -b / (2 * a);
                System.out.printf("nghiem kep cua phuong trinh la : %f", x);
            }else{
            canbaca = Math.sqrt(delta);
            x1 = (-b + canbaca) / (2 * a);
            x2 = (-b - canbaca) / (2 * a);
            System.out.printf(" \n nghiem x1 cua phuong trinh la : %f", x1);
            System.out.printf(" \n nghiem x2 cua phuong trinh la : %f", x2);

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

            System.out.printf("Nghiem cua phuong trinh la: %d ", x);
        }

    }
}
