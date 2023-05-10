/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B2_KieuDuLieuVaNhapXuat;

import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class NhapVaXuat {

    public static void main(String[] args) {
        // Nhap xuat thong tin 
        // 1. Nhap thong tin tu ban phim 
        // Trong C : scanf("","")
        // Trong Java : Scanner 
//        Scanner tenBien khai bao = new...
        Scanner sc = new Scanner(System.in);
        // Nhap so nguyen 
//        System.out.println("Nhap vao so nguyen: ");
//        int number = sc.nextInt(); // nhap vao so nguyen
//        float a = sc.nextFloat();// nhap float
//        double b = sc.nextDouble(); // nhap double
        // Nhap vao chuoi 
        // Co 2 cach de nhap 1 chuoi tu ban phim
        // sc.next()
        // sc.nextLine()
//        System.out.println("Nhap name: ");
//        String name = sc.next(); // Co nhap chuoi. Nhung gap dau cach => Dung 
        System.out.println("Nhap name1: ");
        String name1 = sc.nextLine();
        // 2. Xuat 
//        System.out.println("Name  : " + name);
        System.out.println("Name1  : " + name1);
//        System.out.println("So = " + number);
        // Nhap ten, lop , dia chi cua ban than tu ban phim.
        // In ra man hinh
    }
}
