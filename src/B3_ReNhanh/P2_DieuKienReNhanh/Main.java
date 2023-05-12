/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B3_ReNhanh.P2_DieuKienReNhanh;

import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class Main {

    /**
     * 1. if... else if(dieu kien){ // code }else if(dieu kien){ // code } //
     * Khong gioi han else if else{ // ket thuc cua if => Phai la else // code }
     * BAT BUOC PHAI CO : IF VA ELSE O CUOI De bai: Nhap 1 so tu ban phim. Kiem
     * tra so day nhu the nao voi 5 4 => <5  => IF 10 => >5 => ELSE 5 => =5 => CO
     * 1 CAI ELSE IF
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so:");
        int number = sc.nextInt();
        if (number < 5) {
            System.out.println("Day la so be hon 5");
        } else if (number > 5) {
            System.out.println("Day la so lon hon 5");
        } else {
            System.out.println("Day la so 5");
        }
        // B1: Nhap 1 so tu ban phim.
        // Kiem tra xem day la so chan hay so le
        // B2: Nhap 1 so tu ban phim.
        // Kiem tra xem day la so nguyen duong hay khong?
//        >0 => nguyen duong 
    }
}
