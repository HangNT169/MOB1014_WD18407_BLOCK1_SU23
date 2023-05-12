/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B3_ReNhanh.P1_OnTap;

import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class Main {
    //B1:  Nhap ten, lop , dia chi, truong hoc, nganh hoc 
    // cua ban than tu ban phim.
    // In ra man hinh
    // B2: Nhap ten , tuoi , diaChi 
    // cua ban than
    // Va in ra man hinh 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Nhap
        System.out.println("Nhap ten:");
        String ten = sc.nextLine();
        System.out.println("Nhap tuoi:");
//        int tuoi = sc.nextInt();
//        // C1: Nhu C : sc.nextLine();
//        sc.nextLine();
        // C2: Coi tat ca moi thu nhap tu ban phim vao
        // luon luon la chuoi (nextLine)
        // Sau do ep kieu ve kieu du lieu tuong ung 
        // B1: Coi la chuoi roi nhap 
//        String tuoiStr = sc.nextLine();
//        // B2: Ep kieu ve kieu du lieu tuong ung 
//        // ep : String => Int: Co 2 cach ep kieu 
//        int tuoi = Integer.valueOf(tuoiStr);
        int tuoi = Integer.valueOf(sc.nextLine());
//        float tuoi1 = Float.valueOf(tuoiStr);
        System.out.println("Nhap dia chi:");
        String diaChi = sc.nextLine();
        // Xuat 
        System.out.println("Ten = " + ten + " Tuoi = " + tuoi);
        System.out.println("Dia chi = " + diaChi);
        // B3: Nhap ten, tuoi, diaChi,
        // que quan, ki hoc,nganh hoc, chieu cao
        // cua nguoi yeu cu va in ra man hinh
    }

}
