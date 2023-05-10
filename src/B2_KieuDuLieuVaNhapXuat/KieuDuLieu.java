/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B2_KieuDuLieuVaNhapXuat;

/**
 *
 * @author hangnt
 */
public class KieuDuLieu {

    public static void main(String[] args) {
        //Có 2 loại kiểu dữ liệu trong Java 
        // 1. Kiểu nguyên thuỷ 
        //   - Là những kiểu dữ liệu trong C 
        // (int,float, double,String ....)
        // 2. Kiểu dữ liệu Object 
        // int <=> Integer 
        // float <=> Float 
        // double <=> Double 
        // long <=> Long 
        // boolean <=> Boolean 
        // String <=> String 
        // ....<Có thể tự tạo kiểu dữ liệu Object>
        // => Kiểu dữ liệu Object :
        //     + Chữ cái đầu luôn luôn viết hoa 
        //     + Được khởi tạo bằng từ khoá new 
        //     + Khi chấm thì sổ ra gợi ý 
        // Cách khai báo biến : 
        // kiểu dữ liệu tên của biến;
        // VD: 
//        int number;
//        float numberFirst;
//        String name = "HangNT169";
//        double a;
//        String email = new String();
        // String vừa là kiểu nguyên thuỷ 
        // vừa là kiểu Object
        // BT:
        // 1. Tinh tong cua 2 so nguyen 
        // va in ra man hinh
        int a = 5;
        int b = 3;
        int sum = a + b;
        System.out.println("Sum = " + sum);
        // 5 + 3 = 8 
        // a + b =  sum
        System.out.println(a + "+" + b + " = " + sum);
        // 2. Tinh tong hieu tich thuong cua 2 so nguyen
        // 3. Tinh chu vi, dien tich cua hinh vuong  
        // Bai 1
        int d=5;
        int c=4;
        // C1:
//        float thuong=(float) d/c;
        // C2: 1.0 
        double thuong = 1.0*d/c;
        System.out.println(d+ "+" +c+ "=" +(d+c));
        System.out.println("Hieu bang" +(d-c));
        System.out.println("Tich bang" +(d*c));
        System.out.println("Thuong bang" +thuong);
    }
}
