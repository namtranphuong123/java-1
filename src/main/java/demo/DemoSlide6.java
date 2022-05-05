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
public class DemoSlide6 {
    public static void main(String[] args) {
      
       Scanner sc = new Scanner(System.in);
       System.out.println("xin moi nhap ten");
       String fullname = sc.nextLine();
       System.out.println("xin moi nhap pass");
       String pass = sc.nextLine();
    
    if(fullname.equalsIgnoreCase("hello") && pass.length() > 6){
         System.out.println("Dang nhap thanh cong");
    }
        

else{
 System.out.println("ten hoac mat khau cua ban sai yeu cau");
}
}
}
