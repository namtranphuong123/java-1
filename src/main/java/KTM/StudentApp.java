/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KTM;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class StudentApp extends Student {

    float html5, java1, java2;
    Scanner scanner = new Scanner(System.in);

    public StudentApp(float html5, float java1, float java2) {
        this.html5 = html5;
        this.java1 = java1;
        this.java2 = java2;
    }

    public StudentApp() {
    }

    public StudentApp(int ID, String Name) {
        super(ID, Name);
    }

    public StudentApp(int ID, String Name, float html5, float java1, float java2) {
        super(ID, Name);
        this.html5 = html5;
        this.java1 = java1;
        this.java2 = java2;
    }

    @Override
    public void inputInformation() {
        super.inputInformation();
        System.out.println("nhap diem html5");
        this.html5 = scanner.nextFloat();
        System.out.println("nhap diem java1");
        this.java1 = scanner.nextFloat();
        System.out.println("nhap diem java2");
        this.java2 = scanner.nextFloat();
        scanner.nextLine();
    }

    @Override
    public void outputInformation() {
        super.outputInformation();
        
        System.out.printf("html5:  %f |  java1 :     %f|  java2:    %f  | ", html5, java1, java2);
    }

    @Override
    public double getaverageMark() {
        return ((html5 + java1 + (java2 * 2))*3/4);
    }

    public float getHtml5() {
        return html5;
    }

    public void setHtml5(float html5) {
        this.html5 = html5;
    }

    public float getJava1() {
        return java1;
    }

    public void setJava1(float java1) {
        this.java1 = java1;
    }

    public float getJava2() {
        return java2;
    }

    public void setJava2(float java2) {
        this.java2 = java2;
    }

}
