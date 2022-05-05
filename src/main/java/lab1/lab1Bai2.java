/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class lab1Bai2 {

    public static void main(String[] args) {
        int chuvi, dientich, canhnn;
        Scanner scanner = new Scanner(System.in);

        System.out.println("xin moi chieu dai");

        System.out.println("xin moi chieu rong");

        int a = scanner.nextInt();

        int b = scanner.nextInt();
        dientich = a * b;
        chuvi = (a + b) * 2;
        canhnn = Math.min(a, b);
        System.out.printf("chu vi hinh chu nhat la: %d", chuvi);
        System.out.printf("\n dien tich hinh chu nhat la: %d", dientich);
        System.out.printf("\n"
                + "canh nho nhat la: %d", canhnn, "\n");

    }
}
