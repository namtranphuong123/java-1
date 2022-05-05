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
public class demoToantu {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("xin moi nhap a");

            int a = scanner.nextInt();
            System.out.println("xin moi nhap b");

            int b = scanner.nextInt();
            System.out.println("xin moi nhap c");

            int c = scanner.nextInt();
            int d = a > b ? a : b;
            int max = d > c ? d : c;
            System.out.printf("so lon nhat la %d", max);
        } catch (Exception e) {

            System.out.println("ban nhap vao khong phai so");
        }

    }
    // viết chương trình nhập vào 1 số nguyên kiểm tra số đó là chẵn hay lẻ;
}
