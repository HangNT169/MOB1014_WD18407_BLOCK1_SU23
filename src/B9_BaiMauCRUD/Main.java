/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B9_BaiMauCRUD;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author My LAPTOP
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DienThoaiService service = new DienThoaiService(); // Goi lop service 
        ArrayList<DienThoai> lists = new ArrayList<>(); // Khoi tao 1 arraylist
        int chucNang;
        do {
            System.out.println("**********MENU**********");
            System.out.println("1.Nhap thong tin dien thoai");
            System.out.println("2.In cac thong tin ra man hinh");
            System.out.println("3.Tim cac dien thoai co gia nhap tu ban phim");
            System.out.println("4.Nhap vao bo nho tu ban phim. Liet ke");
            System.out.println("5.Sap xep dien thoai giam dan theo ten");
            System.out.println("6.Sap xep dien thoai tang dan theo gia");
            System.out.println("7.Xoa dien thoai theo vi tri nhap tu ban phim");
            System.out.println("8.Xoa dien thoai theo ma nhap tu ban phim");
            System.out.print("Moi nhap chuc nang:");
            chucNang = Integer.valueOf(sc.nextLine());
            switch (chucNang) {
                case 0: {
                    System.out.println("Thoat");
                    break;
                }
                case 1: {
                    service.nhapDienThoai(lists); // Goi ham nhap tu service sang
                    break;
                }
                case 2: {
                    service.inThongTinListDienThoai(lists);
                    break;
                }
                case 3: {
                    System.out.print("Moi nhap vao bo nho muon search:");
                    int boNho = Integer.valueOf(sc.nextLine());
                    service.searchDienThoaiTheoBoNho(lists, boNho);
                    break;
                }
                case 4: {
                    System.out.print("Moi nhap vao gia muon search:");
                    int gia = Integer.valueOf(sc.nextLine());
                    service.searchDienThoaiTheoGia(lists, gia);
                    break;
                }
                case 5: {
                    service.sortByName(lists);
                    System.out.println("List sau khi sap xep:");
                    service.inThongTinListDienThoai(lists);
                    break;
                }
                case 6: {
                    service.sortByPrice(lists);
                    System.out.println("List sau khi sap xep:");
                    service.inThongTinListDienThoai(lists);
                    break;
                }
                case 7: {
                    System.out.print("Moi nhap vao vi tri muon xoa");
                    int viTri = Integer.valueOf(sc.nextLine());
                    service.xoaDienThoaiViTri(lists, viTri);
                    break;
                }
                case 8: {
                    System.out.print("Moi nhap vao ma muon xoa");
                    int ma = Integer.valueOf(sc.nextLine());
                    service.xoaDienThoaiTheoMa(lists, ma);
                    break;
                }
                default: {
                    System.out.println("Chuc nang k ton tai:");
                    break;
                }
            }
        } while (chucNang != 0);
    }
}
