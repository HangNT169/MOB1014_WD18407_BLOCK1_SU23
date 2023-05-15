/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B4_ReNhanh_P2.P2_SwitchCase;

import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class Menu {

    public static void main(String[] args) {
        // B1: Tao 1 menu gom cac chuc nang sau 
        /**
         * 1. Tinh tong 2 so 2. Tinh hieu 2 so 0. Thoat
         */
        // B2: Tao 1 menu gom cac chuc nang sau
        /**
         * 1. Nhap vao 1 so. Kiem tra do la so chan hay le 2. Nhap
         * ten,tuoi,diaChi, kyHoc, chuyenNganh cua ban than va in ra man hinh
         */
        Scanner sc = new Scanner(System.in);
        System.out.println("1.Tinh tong");
        System.out.println("2.Tinh hieu");
        System.out.println("0.Thoat");
        System.out.print("Nhap chuc nang:");
        int chucNang = sc.nextInt();
        switch (chucNang) {
            case 1: {
                // code chua nang 1 
                System.out.println("Moi nhap a:");
                int a = sc.nextInt();
                System.out.println("Moi nhap b:");
                int b = sc.nextInt();
                int tong = a + b;
                System.out.println("Tong la: " + tong);
                break;
            }
            case 2: {
                // code chua nang 2
                System.out.println("Moi nhap a:");
                int a = sc.nextInt();
                System.out.println("Moi nhap b:");
                int b = sc.nextInt();
                int hieu = a - b;
                System.out.println("Hieu la: " + hieu);
                break;
            }
            case 0: {
                System.out.println("ban da chon thoat");
                break;
            }
            default: {
                System.out.println("Chuc nang khong ton tai");
                break;
            }
        }
    }
}
