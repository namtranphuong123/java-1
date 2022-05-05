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
public class lab2Bai1 {

    public static void main(String[] args) {
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
