/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class arl {

   /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

    public static void main(String[] args) {
    int n;
    Scanner scanner = new Scanner(System.in);
         
    do {
        System.out.println("Nhập vào số phần tử của mảng: ");
        n = scanner.nextInt();
    } while (n < 0);
         
    int A[] = new int[n];
         
    System.out.println("Nhập các phần tử cho mảng: ");
    for (int i = 0; i < n; i++) {
        System.out.print("Nhập phần tử thứ " + i + ": ");
        A[i] = scanner.nextInt();
    }
         
    // Xuất giá trị các phần tử của mảng
    System.out.println("\nMảng ban đầu: ");
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
    System.out.print("\nPhần tử lớn nhất trong mảng là " + max);
    System.out.print("\nPhần tử nhỏ nhất trong mảng là " + min);
         
    // Đếm số phần tử là số chẵn
    int soPhanTuChan = 0;
    for (int i = 0; i < n; i++) {
        if (A[i] % 2 == 0) {
            soPhanTuChan++;
        }
    }
    System.out.println("\nSố phần tử chẵn có trong mảng = " + soPhanTuChan);
         
    // Sắp xếp măng tăng dần
    // Java cung cấp cho chúng ta một thư viện có sẵn
    // để sắp xếp mảng, đó là thư viện sort của lớp Arrays
    // mặc định thư viện này sẽ sắp xếp mảng tăng dần
    Arrays.sort(A);
    System.out.println("\nMảng sau khi sắp xếp: ");
    for (int i = 0; i < n; i++) {
        System.out.print(A[i] + "\t");
    }
}
    }

