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
public class demoThue {

    public static void main(String[] args) {
        float luong;
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("xin moi nhap luong");

            float a = scanner.nextFloat();
            System.out.println("xin moi nhap thuong");

            float b = scanner.nextFloat();
            luong = a + b;
            
            
            if (luong < 9000000) {
                System.out.println("khong dong thue");
            } else if( luong == 15000000 && luong >9000000 ) {
                
                
            }else{
                
            }

        } catch (Exception e) {

            System.out.println("ban nhap vao khong phai so");
        }

    }

}
