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
public class lab2Bai3 {

    public static void main(String[] args) {
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
