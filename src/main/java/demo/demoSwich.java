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
public class demoSwich {
  

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("+ ----------------------------------- +");
        System.out.println("+ 1: cong                             .");
        System.out.println("+ 2: tru                              .");
        System.out.println("+ 3: thoat                            .");
        System.out.println("+ ----------------------------------- +");
boolean cont = true;
		do {
        System.out.println("      xin moi chon chuc nang tu 1 toi 3  ");
        int chon = scanner.nextInt();
        
        switch (chon) {
            case 1:

                bai1();
                break;
            case 2:
                bai2();
                break;
            case 3:
               System.exit(0);
                break;
            
                 
        }
         } while (cont);
    }
        
        
    public static void bai1() {
        //muốn nhận dữ liệu từ bàn phím , cần dùng lệnh scanner để nhận 
        Scanner scanner = new Scanner(System.in);

        System.out.println("xin moi a");
        System.out.println("xin moi b");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
       int tong =a+b;
System.out.printf("\ntong = : %d", tong,"/n");
    }

    public static void bai2() {

          //muốn nhận dữ liệu từ bàn phím , cần dùng lệnh scanner để nhận 
        Scanner scanner = new Scanner(System.in);

        System.out.println("xin moi a");
        System.out.println("xin moi b");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
       int tong =a-b;
System.out.printf("\n  tong =^: %d", tong,"\n");
    }
   
    }


