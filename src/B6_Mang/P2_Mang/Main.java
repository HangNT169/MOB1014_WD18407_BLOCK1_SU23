/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B6_Mang.P2_Mang;

import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class Main {

    /**
     * Mảng là tập hợp của tất cả các phần tử cùng kiểu dữ liệu Vị trí trong
     * mảng luôn luôn bắt đầu bằng 0 Cách khai báo mảng: kiểu dữ liệu tên
     * mảng[]; VD:Mang so nguyen gom cac phan tu: 9,-1,3,7 => int a[]
     * ={9,-1,3,7}; Mang : Vi tri && Gia Tri Vi tri se bat tu 0 - (size-1) Vi
     * tri dau tien: 0 Vi tri cuoi cung : size -1 Gia tri cua vi tri dau tien :
     * a[0] Gia tri cua vi tri cuoi cung : a[size-1] Gia tri cua vi tri i bat ki
     * : a[i] => Goi la mang co dinh
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int a[] = {2, 4}; 
        // Cach khai bao 1 mang so nguyen 
        // Nhap 1 mang so nguyen tu ban phim. Va xuat ra man hinh
        // B1: Nhap Size 
        System.out.println("Moi nhap size mang: ");
        int size = sc.nextInt();
        // B2: Nhap cac phan tu vao mang 
        int a[] = new int[size]; // Cach khai bao 1 mang co size phan tu
        for (int i = 0; i < size; i++) {
            a[i] = sc.nextInt();
        }
        // B3: Xuat 
        System.out.println("Xuat cac phan tu");
        for (int i = 0; i < size; i++) {
            System.out.println(a[i]);
        }

    }
}
