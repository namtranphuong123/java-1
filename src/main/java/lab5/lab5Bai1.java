/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab5;

import java.util.ArrayList;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class lab5Bai1 {
ArrayList<Double> list = new ArrayList<Double>();
    public  void nhap() {
        
    

        Scanner scanner = new Scanner(System.in);
        
        int y = 1;
        do {
            System.out.println("moi ban nhap vao ");
            double x = scanner.nextDouble();

            System.out.print("\n ban co muon nhap them ?| (1 : tiep tuc / 2 : thoat)? ");
            y = scanner.nextInt();
            list.add(x);
        } while (y == 1);

    }
    public void hien(){
        for (Double x : list ) {
            System.out.printf("" + x);
    }
}
    public  void tong() {
           double sum = 0;
        for (Double item : list) {
            sum += item;

        }
        System.out.printf("" + sum);
    
    }
}
