/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B7_OverviewOOP;

/**
 *
 * @author hangnt
 */
public class SinhVien {

    /**
     * OOP - Lap Trinh Huong Doi Tuong Object: Co 2 dac trung + thuoc tinh <=>
     * cac bien + phuong thuc <=> cac ham
     *
     *
     */
//    Tạo class SinhVien gồm các thuộc tính :  
//    mssv - String , ten- String, tuoi - int, 
//    gioiTinh - boolean, kyHoc - int, diaChi - String ,
//    matKhauFacebook - String và 
//    các phương thức contructor, getter, setter 
//    và hàm inThongTin(): void. 
    // OOP co 4 dac trung :
    // + Tinh dong goi : Bao ve thong tin ca nhan. 
    // => Khi nhac toi tinh dong goi (Pham vi truy cap)
    // => Access Modifier => Cua Bien Hoac Cua Ham 
    // Co 4 pham vi truy cap (Rong => Hep): 
    //      + public
    //      + protected
    //      + default
    //      + private 
    // Tat ca cac pham vi deu them truoc ham hoac bien . TRU DEFAULT
    // VD: DEFAULT => int number;
    // Thuoc tinh
    private String mssv;
    private String ten;
    private int tuoi;
    private boolean gioiTinh;
    private int kyHoc;
    private String diaChi;
    private String matKhauFacebook;

    // Phuong thuc 
    // Contructor: Dung de khoi tao doi tuong 
    // Co 2 loai contructor 
    //  + Contructor khong tham so
    //  + Contructor co tham so 
    // Dac trung contructor:
    //  + Ten contructor trung voi ten cua class 
    //  + Contructor khong co kieu du lieu tra ve 
    public SinhVien() {
    }

    public SinhVien(String mssv, String ten, int tuoi, boolean gioiTinh, int kyHoc, String diaChi, String matKhauFacebook) {
        this.mssv = mssv;
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.kyHoc = kyHoc;
        this.diaChi = diaChi;
        this.matKhauFacebook = matKhauFacebook;
    }

    // Lay gia tri thuoc tinh MSSV 
    public String getMssv() {
        return mssv;
    }

    // Thay doi gia tri cua thuoc tinh
    public void setMssv(String mssv) {
        this.mssv = mssv;
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

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public int getKyHoc() {
        return kyHoc;
    }

    public void setKyHoc(int kyHoc) {
        this.kyHoc = kyHoc;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getMatKhauFacebook() {
        return matKhauFacebook;
    }

    public void setMatKhauFacebook(String matKhauFacebook) {
        this.matKhauFacebook = matKhauFacebook;
    }

    // Ham inThongTin(): void
    public void inThongTin() {
        System.out.println("MSSV: " + mssv);
        System.out.println("Ten:" + ten);
        System.out.println("kyHoc:" + kyHoc);
        System.out.println("diaChi" + diaChi);
        System.out.println("matKhauFacebook" + matKhauFacebook);
        System.out.println("tuoi:" + tuoi);
    }

}
