/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B5_Loop.P2_Loop;

import java.awt.BorderLayout;
import java.util.Scanner;

/**
 *
 * @author hangnt
 */
public class Main {

    /**
     * Vong lap dung de lap. 1.while while(dieu kien){ // code } 2.do...while
     * do{ // code }while(dieukien) 3.for for(gia tri khoi tao;dieu kien;buoc
     * nhay){ // code }
     */
    public static void main(String[] args) {
        // BT: In cac so tu 0 toi 10
        // 1.while
        // 0,1,...10
        // => <=10 | < 11 
//        int number = 0;
//        while(number < 11){
//            System.out.println(number);
//            number++;
//        }
        // while => Check roi moi lam
        // 2. do..while
//        int number = 0;
//        do {
//            // code
//            System.out.println(number);
//            number++;
//        } while (number < 11);
//        // do..while => Lam roi moi check 
//        // 3. for 
//        for (int i = 0; i < 11; i++) {
//            System.out.println(i);
//        }
        // Gia tri i chi duoc khoi tao 1 lan duy nhat. 
        // Ngay tai vong lap dau tien
        // BT:
        /**
         * Tao 1 menu gom cac chuc nang sau 
         * 1. Nhap vao 1 so nguyen n. Tinh tong cac so tu 1 toi n.
         * 2. Nhap ma,ten,khu vuc song, can nang,loai cua vat nuoi nha ban. 
         * Va in ra man hinh
         * 3. Nhap vao 1 so nguyen n. Tinh tich cac so tu 1 toi n
         * 4. Nhap vao 1 so nguyen n. Tinh tich cac so chan chia het cho 4 tu 1-n.
         * 5. Thoat
         */ 
         System.out.println("MENU");
         System.out.println("Chon 1");
         System.out.println("Chon 2");
         System.out.println("Chon 3");
         System.out.println("Chon 4");
         System.out.println("Exit");
         Scanner input = new Scanner(System.in);
         int number = input.nextInt();
         
        switch (number) {
            case 1:
                System.out.println("Tong cac so");
                
                
                break;
            case 2:
                System.out.println("Nhap ma: ");
                String ma = input.nextLine();
                input.nextLine();
                   
                System.out.println("Nhap ten: ");
                String ten = input.nextLine();
                System.out.println("Khu vuc song: ");
                String khuvuc = input.nextLine();
                System.out.println("Can nang: ");
                Double can = input.nextDouble();
                input.nextLine();
                System.out.println("Loai: ");
                String loai = input.nextLine();
                
                System.out.println(" Ma: "+ma);
                System.out.println("'Ten: "+ten);
                System.out.println("Khu vuc song: "+khuvuc);
                System.out.println("Can nang: "+can);
                System.out.println("Loai: "+loai);
                
                break;
            case 3:
                System.out.println("Tich cac so tu 1 toi n");
                break;
            case 4:
                System.out.println("Tich cac so chan");
            default:
               System.out.println("Exit");
        }
    }
}
