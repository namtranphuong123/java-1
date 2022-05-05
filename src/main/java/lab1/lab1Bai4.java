/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author Admin
 */
public class lab1Bai4 {

    public static void main(String[] args) {
        double canbaca, delta;
        Scanner scanner = new Scanner(System.in);

        System.out.println("xin moi nhap a");

        double a = scanner.nextDouble();
        System.out.println("xin moi nhap b");

        double b = scanner.nextDouble();
        System.out.println("xin moi nhap c");

        double c = scanner.nextDouble();

        delta = Math.pow(b, 2) - 4 * a * c;

        canbaca = Math.sqrt(delta);
        System.out.printf("\n can bac hai  la: %f", canbaca, "\n");

    }
}
