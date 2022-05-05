/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class demoSlide17 {
    public static void main(String[] args) {
         ArrayList<String> s = new ArrayList<String>();
    Scanner scanner = new Scanner(System.in);
    int n=5;
      
        
    for(int i = 0 ; i < n ;i++){
         System.out.printf("moi ban nhap cau hoi thu %d: \n",i+1);
         System.out.println(" nhap ");
            String st = scanner.nextLine();
            
            s.add(st);
    }
    
    
    

    for(String list:s){
        Collections.shuffle(s);
                
                 System.out.printf("\n cau hoi cua ban la : %s: ",list);
    
}
   
}

}
