/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class lab3Bai4 {

    public static void main(String[] args) {
//khai báo scanner để nhận dữ liệu 
        Scanner scanner = new Scanner(System.in);
        int n;
// mời người dùng nhập vào số sinh viên sau đó gán vào biến n và chuyển từ dạng double sang kiểu string
        System.out.println("nhap vao so sinh vien ban muon nhap: ");
        n = Integer.parseInt(scanner.nextLine());

        String[] c = new String[n];

        double[] a = new double[n];

        for (int i = 0; i < n; ++i) {
            System.out.printf("\nnhap du lieu cho sinh vien %d ", i + 1);
            //nhap ten
            System.out.println("nhap ten: ");
            c[i] = scanner.nextLine();
//nhập điểm 
            System.out.println("nhap diem: ");
            
            a[i] = Double.parseDouble(scanner.nextLine());
            //xuat thong tin

        }
        xuat(c, a, n);
//xắp xếp
xapxep(c, a, n);
//xuất sau xắp xếp
xuat(c, a, n);
    }

    public static void xuat(String[] c, double[] a, int n) {
        System.out.println();
        for (int i = 0; i < n; ++i) {
            System.out.printf("\nho ten : %s ", c[i]);

            System.out.printf("\ndiem: %.1f \n", a[i]);
            if (a[i] >= 9) {

                System.out.println("Xuat sac");
            } else if (a[i] >= 7.5) {
                System.out.println("gioi");
            } else if (a[i] >= 6.5) {
                System.out.println("kha");
            } else if (a[i] >= 5) {
                System.out.println("trung binh");
            } else {
                System.out.println("yeu");
            }
            System.out.println();

        }

    }

    public static void xapxep(String[] c, double[] a, int n) {
        for (int i = 0; i < n - 1; ++i) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    
                   // haosn đổi
                    String s = c[i];
                    c[i] = c[j];
                    c[j]=s;
                    //haons đổi điểm
                    double d = a[i];
                    a[i] = a[j];
                    a[j]=d;
                }
            }

        }
    }
}
