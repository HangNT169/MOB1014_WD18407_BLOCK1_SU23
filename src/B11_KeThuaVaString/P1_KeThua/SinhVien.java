/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B11_KeThuaVaString.P1_KeThua;

/**
 *
 * @author hangnt
 */
public class SinhVien extends Nguoi {

    // Class SinhVien ke thua tu class Nguoi 
    // Ke thua => 2 doi tuong tro len. Class Cha va Class Con 
    // Con se ke thua duoc cac thuoc tinh va phuong thuc cua Cha 
    // TRU THUOC TINH VA PHUONG THUC - PRIVATE 
    // => KHONG KE THUA DUOC 
    // Ke thua : extends 
    private double diem;
    private String tenLop;
    // SV => 7 thuoc tinh 

    public SinhVien() {
    }

    public SinhVien(double diem, String tenLop, String ten, int tuoi, int gioiTinh, String queQuan, String sdt, String gmail) {
        super(ten, tuoi, gioiTinh, queQuan, sdt, gmail);
        this.diem = diem;
        this.tenLop = tenLop;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }

    public String getTenLop() {
        return tenLop;
    }

    public void setTenLop(String tenLop) {
        this.tenLop = tenLop;
    }

    public void display() {
        // SV => 8 : ten - String , tuoi - int, gioiTinh - int (1-Nam, 0- Nữ), 
        // queQuan - String , sdt - String , email - String , diem, tenLop
        System.out.println("Diem: "+diem);
        System.out.println("Ten lop hoc : "+tenLop);
//        // Muon lay thuoc tinh/phuong thuc Cha : supper
//        System.out.println("Ten: "+super.getTen());
//        System.out.println("Tuoi: "+super.getTuoi());
//        System.out.println("Gioi tinh: "+super.getGioiTinh());
//        System.out.println("Que quan: "+super.getQueQuan());
//        System.out.println("So dien thoai: "+super.getSdt());
//        System.out.println("Email: "+super.getGmail());
        super.display();
    }
}
