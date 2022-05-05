/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class lab3bai1 {

    public static void main(String[] args) {

        boolean ok = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println(" moi ban nhap so");
        int N = scanner.nextInt();
        for (int i = 2; i < N - 1; i++) {
// N là số nhập từ bàn phím
            if (N % i == 0) {
                ok = false;
                break;
            }

        }
        if (ok == true) {
            System.out.println("" + N + " la so nguyen to");
        } else {
            System.out.println("" + N + "  khong phai so nguyen to");
        }

    }
}
