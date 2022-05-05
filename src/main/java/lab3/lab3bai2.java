/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Admin
 */
public class lab3bai2 {

    public static void main(String[] args) {
        int i = 1, tong, x = 1;

        for (i = 1; i <= 10; i++) {
            System.out.println("");
            for (x = 1; x <= 10; x++) {
                System.out.printf("%d x %d = %d", x, i, x * i);
                System.out.println();
            }
        }

    }
}
