/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class DemoXuatTen {
        public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
        int n;
        
        ArrayList<String> a = new ArrayList<String>();
// mời người dùng nhập vào số sinh viên sau đó gán vào biến n và chuyển từ dạng double sang kiểu string
        System.out.println("nhap vao so sinh vien ban muon nhap: ");
        n = Integer.parseInt(scanner.nextLine());

        
            for (int i = 0; i < n; ++i) {
            System.out.printf("\nnhap du lieu cho sinh vien %d ", i + 1);
            //nhap ten
            System.out.println("nhap ten: ");
            String c = scanner.nextLine();
          
           a.add(c);
       

       
   for(String item : a){
       item = item.trim();
       if(item.startsWith("Tuan")|| item.endsWith("Nguyen")){
           String ho = item.substring(0,item.indexOf(""));
            String ten = item.substring(1,item.lastIndexOf(""));
            String tendem = item.substring(item.indexOf(""),item.lastIndexOf(""));
             
            
            System.out.printf(" ho va ten sinh vien : %s %s %s ",ho.toUpperCase(),tendem,ten.toUpperCase());
       }
   }
               for(String item : a){
      
       if(item.indexOf("My")>0){
           
            System.out.printf(" ho va ten  %s ",item);
       }
   }
            }
}
}
