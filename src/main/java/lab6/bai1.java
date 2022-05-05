/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class bai1 {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ho ten: ");
        String hoten = sc.nextLine();
        
        String[] ars = hoten.split(" ");
        String ho = ars[0];
        String ten = ars[ars.length -1];
        
        ho = ho.toUpperCase();
        ten = ten.toUpperCase();
        
        
        System.out.println("\n Ho va ten da duoc dinh dang");
        System.out.print(ten +" "+ ho +" ");
        for (int i =1; i < ars.length -1; i++) {
            System.out.print(ars[i] + " ");
        }
    } 
}
