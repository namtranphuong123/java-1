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
public abstract class Student {

    int ID;
    String Name;

    public Student() {
    }
    Scanner scanner = new Scanner(System.in);

    public Student(int ID, String Name) {
        this.ID = ID;
        this.Name = Name;
    }

    public void inputInformation() {
        System.out.println("nhap id");
        this.ID = scanner.nextInt();
        System.out.println("nhap ho ten");
        this.Name = scanner.nextLine();
        scanner.nextLine();

    }

    public void outputInformation() {
        System.out.printf("ID student  :     %d     | Student Name :     %s     |averageMark :     %s    \n",
                 ID, Name, getaverageMark());

    }

    public abstract double getaverageMark( 
            );

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }


}
