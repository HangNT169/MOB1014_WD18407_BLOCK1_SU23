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
public class LuyenTap {
    // B1: Nhap mang so nguyen tu ban phim. Tinh tong cac phan tu trong mang
    // B2: Nhap mang so nguyen tu ban phim. Tinh tich cac phan tu trong mang
    // B3: Nhap mang so nguyen tu ban phim. Liet ke cac phan tu o vi tri le 
    
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
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
        int sum = 0;
        // B3: Tinh tong
        for (int i = 0; i < size; i++) {
            if(i%2!=0){
                // liet ke 
                
            }
            sum+=a[i];
//            tich = tich * a[i] <=> tich *=a[i]
        }
        
    }
}
