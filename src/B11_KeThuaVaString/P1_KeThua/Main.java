/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B11_KeThuaVaString.P1_KeThua;

import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // SV => 8 : ten - String , tuoi - int, gioiTinh - int (1-Nam, 0- Nữ), 
        // queQuan - String , sdt - String , email - String , diem, tenLop
        System.out.println("Ten");
        String ten = sc.nextLine();
        System.out.println("Tuoi");
        int tuoi = Integer.valueOf(sc.nextLine());
        System.out.println("Gioi Tinh");
        int gioiTinh = Integer.valueOf(sc.nextLine());
        System.out.println("Que Quan");
        String queQuan = sc.nextLine();
        System.out.println("SDT");
        String sdt = sc.nextLine();
        System.out.println("Email");
        String email = sc.nextLine();
        System.out.println("Diem");
        double diem = Double.valueOf(sc.nextLine());
        System.out.println("Lop");
        String lop = sc.nextLine();
        SinhVien sinhVien = new SinhVien();
        sinhVien.setTen(ten);
        sinhVien.setTuoi(tuoi);
        sinhVien.setGioiTinh(gioiTinh);
        sinhVien.setQueQuan(queQuan);
        sinhVien.setDiem(diem);
        sinhVien.setGmail(email);
        sinhVien.setSdt(sdt);
        sinhVien.setTenLop(lop);
        sinhVien.display();
    }
}
