/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B11_KeThuaVaString.P1_KeThua;

/**
 *
 * @author hangnt
 */
public class Nguoi {

    private String ten;
    private int tuoi;
    private int gioiTinh;
    private String queQuan;
    private String sdt;
    private String gmail;

    public Nguoi(String ten, int tuoi, int gioiTinh, String queQuan, String sdt, String gmail) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.queQuan = queQuan;
        this.sdt = sdt;
        this.gmail = gmail;
    }

    public Nguoi() {
    }
    
    public String getTen() {
        return ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public String getSdt() {
        return sdt;
    }

    public String getGmail() {
        return gmail;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public void display() {
        System.out.println(" ten:" + ten);
        System.out.println(" tuoi : " + tuoi);
        System.out.println(" Gioi tinh: " + gioiTinh);
        System.out.println(" Que quan: " + queQuan);
        System.out.println(" SDT: " + sdt);
        System.out.println(" Gmail: " + gmail);
    }
}
