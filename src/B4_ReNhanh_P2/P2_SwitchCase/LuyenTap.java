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
public class LuyenTap {

    public static void main(String[] args) {
        //B1: Nhap 1 so tu ban phim
        // Kiem tra xem no thuoc thang nao trong nam
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap thang: ");
        int thang = sc.nextInt();
        switch (thang) {
            case 1: {
                System.out.println("Thang Mot");
                break;
            }
            case 2: {
                System.out.println("Thang Hai");
                break;
            }
            // Co 12 case 
            default: {
                System.out.println("Khong ton tai thang trong nam");
                break;
            }
        }
        // B2: Nhap vao 1 so tu ban phim.
        // Kiem tra no thuoc quy nao trong nam
    }
}
