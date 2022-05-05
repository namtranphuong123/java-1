/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class demo4 {

    public static void main(String[] args) {
        System.out.println("moi nhap vao chuoi ky tu so nguyen sau moi ky tu la dau (,)");
        Scanner sc = new Scanner(System.in);
       
        
        String Chuoi =sc.nextLine();
        
        String[] daySo = Chuoi.split(",");
for (String so : daySo) {
            int x = Integer.parseInt(so);
            if (x % 2 == 0) {
                System.out.println("cac so chan");
                 System.out.printf(" %s\n" ,so);
            }
        }
    }
}
