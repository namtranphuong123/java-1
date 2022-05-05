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
public class demo2 {

    public static void main(String[] args) {
        int b;
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("xin moi nhap a");

            int a = scanner.nextInt();

            if (a % 2 == 0) {
                System.out.println("so nhap vao la chan");
            } else {
                System.out.println("so nhap vao la le");
            }

        } catch (Exception e) {

            System.out.println("ban nhap vao khong phai so");
        }

    }
    // viết chương trình nhập vào 1 số nguyên kiểm tra số đó là chẵn hay lẻ;
}
