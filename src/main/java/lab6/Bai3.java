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
public class Bai3 {
     private String hoTen,email,sdt,cmnd;

    public Bai3() {
    }

    public Bai3(String hoTen, String email, String sdt, String cmnd) {
        this.hoTen = hoTen;
        this.email = email;
        this.sdt = sdt;
        this.cmnd = cmnd;   
    }
    public void xuat(){
        System.out.printf("Ho ten: %s - Email: %s -SDT: %s - CMND: %s \n",
                hoTen,email,sdt,cmnd);
    }
    public void nhap(Scanner s){
        do{
        System.out.println("Ho ten:");
        hoTen = s.nextLine();
        
        if (hoTen == null || hoTen.equals("")){
            System.out.println("Ho ten khong hop le. Vui long nhap lai");
        }else{
                break;
                }
    }while(true);
        Bai3DataValiDator dv = new Bai3DataValiDator();
        do{
        
        System.out.println("Email:");
        email = s.nextLine();
        
        if(dv.isEmail(email)){
            break;
        }
            System.out.println("Email khong hop le. Vui long nhap lai");
        }while(true);
        do {     
            System.out.println("SDT:");
       sdt = s.nextLine();
       
       if(dv.isSDT(sdt)){
           break;
       }
            System.out.println("SDT khong hop le. Vui long nhap lai");           
        } while (true);
        do {
           System.out.println("CMND:");
        cmnd = s.nextLine(); 
        
        if(dv.isCMND(cmnd)){
            break;
        }
            System.out.println("CMND khong ho le. Vui long nhap lai");
        }while(true);
    }
 
 

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getCmnd() {
        return cmnd;
    }

    public void setCmnd(String cmnd) {
        this.cmnd = cmnd;
    }
 
 
    
}
