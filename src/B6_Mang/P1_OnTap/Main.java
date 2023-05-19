/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B6_Mang.P1_OnTap;

import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int chucNang = 0;
        do {
            System.out.println("1. Chuc nang 1");
            System.out.println("2. Chuc nang 2");
            System.out.println("3. Chuc nang 3");
            System.out.println("4. Chuc nang 4");
            System.out.println("0. Thoat");
            System.out.println("Moi nhap");
            chucNang = scan.nextInt();
            // menu => switch case 
            switch (chucNang) {
                case 1: {
                    System.out.println("Chuc nang 1");
                    break;
                }
                case 2: {
                    System.out.println("Chuc nang 1");
                    break;
                }
                case 3: {
                    System.out.println("Chuc nang 1");
                    break;
                }
                case 4: {
                    System.out.println("Chuc nang 1");
                    break;
                }
                case 0: {
                    break;
                }
                default: {
                    System.out.println("Chuc nang khong ton tai");
                    break;
                }
            }
        } while (chucNang != 0);
    }
}
