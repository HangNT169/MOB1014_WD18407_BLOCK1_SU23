/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B8_MangDong.P2_NhapXuat;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class Main {

    /**
     * Tao class ThucVat gồm các thuộc tính : maTV- String, ten-String,
     * tuoi-int, chieuCao-double, khuVucSong- String và các contrutor, getter,
     * setter và hàm display(): void Tao class Main. Sử dung ArrayList<ThucVat>.
     * Nhap xuat 2 doi tuong Thuc Vat tu ban phim va in ArrayList<ThucVat>
     */
    public static void main(String[] args) {
        ArrayList<ThucVat> lists = new ArrayList<>();
        // B1: Nhap cac thuoc tinh tu ban phim
        // maTV- String, ten-String,tuoi-int, chieuCao-double, khuVucSong- String
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap ma thuc vat:");
        String ma = sc.nextLine();
        System.out.println("nhap ten thuc vat:");
        String ten = sc.nextLine();
        System.out.println("nhap tuoi:");
        int tuoi = sc.nextInt();
        System.out.println("nhap chieu cao:");
        double chieucao = sc.nextDouble();
        sc.nextLine();
        System.out.println("nhap khu vuc song: ");
        String kv = sc.nextLine();
        // B2: Khoi tao doi tuong - contructor
        // C1: contructor khong tham so
//        ThucVat tv = new ThucVat(); 
//        // thay doi gia 
//        tv.setMaTV(ma);
//        // thay doi cac thuoc tinh con lai
//        tv.display();
        // C2: contructor co tham so 
        ThucVat tv1 = new ThucVat(ma, ten, tuoi, chieucao, kv);
//          tv1.display();
        // B3: Add phan tu vao lists
        lists.add(tv1);
        // In ra 
        for (ThucVat tv : lists) {
            tv.display();
        }
    }

}
