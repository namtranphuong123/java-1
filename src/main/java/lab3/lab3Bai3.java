/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class lab3Bai3 {
   public static void main(String[] args) {
    int n , sum =0 , number;
    float avgNumber;
    
    Scanner scanner = new Scanner(System.in);
    // làm tròn đến 2 chữ số thập phân
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
         
    do {
        System.out.println("nhap vao so phan tu cua mang: ");
        n = scanner.nextInt();
    } while (n < 0);
         
    int A[] = new int[n];
         
    System.out.println("nhap cac phan tu cho mang: ");
    for (int i = 0; i < n; i++) {
        System.out.println("nhap phan tu thu  " + i + ": ");
        A[i] = scanner.nextInt();
          sum += A[i];
    }
         
    // Xuất giá trị các phần tử của mảng
    System.out.println("\nMang ban dau la: ");
    for (int i = 0; i < n; i++) {
        System.out.print(A[i] + "\t");
    }
         
    // Tìm phần tử có giá trị lớn nhất, nhỏ nhất
    int max = A[0]; // khởi tạo phần tử lớn nhất là phần tử đầu tiên
    int min = A[0]; // khởi tạo phần tử bé nhất là phần tử đầu tiên
         
    for (int i = 0; i < n; i++) {
        if (A[i] < min) {
            min = A[i];
        }
             
        if (A[i] > max) {
            max = A[i];
        }
    }
    
    System.out.print("\nphan tu nho nhat trong mang la " + min);
         
    // Đếm số phần tử là số chẵn
    avgNumber = (float) sum / n;
        System.out.println("\ntrung binh cong = " + decimalFormat.format(avgNumber));
}
   
        
}
