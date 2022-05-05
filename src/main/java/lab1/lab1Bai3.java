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
public class lab1Bai3 {

    public static void main(String[] args) {
        int thetich;
        Scanner scanner = new Scanner(System.in);

        System.out.println("xin moi nhap vao canh");

        int a = scanner.nextInt();
        thetich = a * a * a;
        System.out.printf("\n"
                + "the tich cua khoi lap phuong  la: %d", thetich, "\n");

    }
}
