/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import java.util.Scanner;

/**
 *
 * @author Admin^
 */
public class Lab1Bai1 {

    // muốn chạy được mọi chương trình đều phải cần phương thức main
    public static void main(String[] args) {
        //muốn nhận dữ liệu từ bàn phím , cần dùng lệnh scanner để nhận 
        Scanner scanner = new Scanner(System.in);

        System.out.println("xin moi nhap ten");
        System.out.println("xin moi diem");
        String hoTen = scanner.nextLine();
        System.out.printf("Full name : %s ", hoTen, "\n");

        double diemTB = scanner.nextDouble();
        System.out.printf("Point: %.2f ", diemTB);

    }

}
