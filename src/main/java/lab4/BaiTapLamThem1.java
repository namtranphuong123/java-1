/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class BaiTapLamThem1 {

    private double number1;
    private double number2;
    double tong, hieu, tich, thuong;

    public BaiTapLamThem1() {
        System.out.println("ham tao khong tham so");
        number1 = 10;
        number2 = 9;
    }

    public BaiTapLamThem1(double number1, double number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    public double getNumber1() {
        return number1;
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    public void inputInfor() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi ban  nhap number 1");
        number1 = scanner.nextDouble();
        System.out.println("Moi ban  nhap number 2");
        number2 = scanner.nextDouble();
    }

    public void outputInfor() {
       
        System.out.printf("number 1 = " + number1 + "number 2 = " + number2);
    }

    public void addition() {
        tong = number1 + number2;
        System.out.printf("tong hai so ban nhap la : %f", tong);
    }

    public void subtract() {
        hieu = number1 - number2;
        System.out.printf("hieu hai so ban nhap la : %f", hieu);
    }

    public void multi() {
        tich = number1 * number2;
        System.out.printf("hieu hai so ban nhap la : %f", tich);
    }

    public void division() {
        thuong = number1 / number2;
        System.out.printf("hieu hai so ban nhap la : %f", thuong);
    }

}
