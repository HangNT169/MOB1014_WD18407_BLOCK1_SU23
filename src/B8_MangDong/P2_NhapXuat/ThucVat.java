/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B8_MangDong.P2_NhapXuat;

/**
 *
 * @author hangnt
 */
public class ThucVat {

    private String maTV;
    private String ten; // null
    private int tuoi;// 0
    private double chieuCao; // 0.0
    private String khuVucSong;

    public ThucVat() {
    }

    public ThucVat(String maTV, String ten, int tuoi, double chieuCao, String khuVucSong) {
        this.maTV = maTV;
        this.ten = ten;
        this.tuoi = tuoi;
        this.chieuCao = chieuCao;
        this.khuVucSong = khuVucSong;
    }

    public String getMaTV() {
        return maTV;
    }

    public void setMaTV(String maTV) {
        this.maTV = maTV;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public double getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(double chieuCao) {
        this.chieuCao = chieuCao;
    }

    public String getKhuVucSong() {
        return khuVucSong;
    }

    public void setKhuVucSong(String khuVucSong) {
        this.khuVucSong = khuVucSong;
    }

    public void display() {
        System.out.println("Ma tv la :" + maTV);
        System.out.println("Ten tv la :" + ten);
        System.out.println("Tuoi tv la :" + tuoi);
        System.out.println("Chieu cao tv la :" + chieuCao);
        System.out.println("Khu vuc song la :" + khuVucSong);
    }
}
