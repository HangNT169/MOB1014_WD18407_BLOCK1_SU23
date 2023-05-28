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
public class DienThoaiService {

    // XU LY LOGIC => VUT TRONG SERVICE
    // 8 chuc nang => it nhat 8 ham phia ben service
    // Ham nhap => CN1
    public void nhapDienThoai(ArrayList<DienThoai> listDienThoai) {
        // B1: Nhap thuoc tinh: ma,ten,hang,mau,bo nho , gia
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã của điện thoại: ");
        int ma = Integer.valueOf(scanner.nextLine());
        System.out.println("Nhập tên của điện thoại: ");
        String ten = scanner.nextLine();
        System.out.println("Nhập hang của điện thoại: ");
        String hang = scanner.nextLine();
        System.out.println("Nhập mau của điện thoại: ");
        String mau = scanner.nextLine();
        System.out.println("Nhập bộ nhớ của điện thoại: ");
        int boNho = Integer.valueOf(scanner.nextLine());
        System.out.println("Nhập giá của điện thoại: ");
        int gia = Integer.valueOf(scanner.nextLine());
//        String ma,ten,diaChi; => KHONG DUOC PHEP KHAI  BAO  NTN
        // B2: Khoi tao doi tuong  <=> Contructor 
        DienThoai dienThoai = new DienThoai(ma, ten, hang, mau, boNho, gia);
        // B3: Add vao lists
        listDienThoai.add(dienThoai);
    }

    // Ham in thong tin arraylist => CN2
    public void inThongTinListDienThoai(ArrayList<DienThoai> lists) {
        // 4 => 3
        // C1: for thuong (for i) => Luon biet duoc vi tri 
        // C2: for each => Biet duoc doi tuong 
        // C3: for each + lamda experssion (J8 do len): ->
        // C4: for each + method refernece (J8 do len): (::)
//        for (DienThoai dt : lists) {
//            dt.inThongTin();
//        }
        lists.forEach(dienThoai -> dienThoai.inThongTin());
    }

    // Ham tim dien thoai co gia nhap tu ban phin => CN3
    public void searchDienThoaiTheoGia(ArrayList<DienThoai> lists, int gia) {
        for (DienThoai dt : lists) {
            if (dt.getGia() == gia) {
                dt.inThongTin();
            }
        }
    }

    // Ham tim dien thoai co bo nho nhap tu ban phin => CN4
    public void searchDienThoaiTheoBoNho(ArrayList<DienThoai> lists, int boNho) {
        for (DienThoai dt : lists) {
            if (dt.getBoNho() == boNho) {
                dt.inThongTin();
            }
        }
    }

    // Ham sap xep dien thoai giam dan theo ten => CN5
    public void sortByName(ArrayList<DienThoai> listDienThoai) {
        // Sort theo lamda
        listDienThoai.sort((o1, o2) -> {
            return o2.getTen().compareTo(o1.getTen()); // SS 2 chuoi => compareTo
        });
        // Theo chieu nguoc lai => Doi cho o1 vs o2
    }

    // Ham sap xep dien thoai tang dan theo gia => CN6
    public void sortByPrice(ArrayList<DienThoai> lists) {
        lists.sort((o1, o2) -> {
            return o1.getGia() - o2.getGia(); // SS 2 so Nguyen => Dau - 
        });
    }

    // Ham xoa dien thoai theo vi tri => CN7
    public void xoaDienThoaiViTri(ArrayList<DienThoai> lists, int viTri) {
        lists.remove(viTri);
    }

    // Ham xoa dien thoai theo ma => CN8
    public void xoaDienThoaiTheoMa(ArrayList<DienThoai> lists, int ma) {
        for (DienThoai dt : lists) {
            // Neu tim thay ma => Xoa 
            if (dt.getMa() == ma) {
                // Xoa 
                lists.remove(dt);
                break;
            }
        }
    }

}
