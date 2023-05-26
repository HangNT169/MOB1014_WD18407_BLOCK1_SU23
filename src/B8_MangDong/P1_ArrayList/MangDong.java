/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package B8_MangDong.P1_ArrayList;

import java.util.ArrayList;

/**
 *
 * @author hangnt
 */
public class MangDong {

    /**
     * Mang dong - ArrayList, List,Tree,Map....=> Collections Java 1: ArrayList
     * Mảng : 
     *  + vi trí: 0 
     *  + giá trị 
     * => không cần phải quan tâm tới size Cú pháp:
     * ArrayList<KieuDuLieu>tenBien = new ArraryList<>();
     */
    public static void main(String[] args) {
        ArrayList<String> listString = new ArrayList<>();
//        System.out.println(listString.size());
//        // Them phan tu 
        listString.add("SD17317"); // vi tri 0: listString.get(0)
//        System.out.println("Size = " + listString.size());
//        // Them phan tu 
        listString.add("SD17312");// vi tri 1: listString.get(1)
//        System.out.println("Size1 = " + listString.size());
//        // Xoa phan tu 
////        listString.remove("SD17317"); // Xoa theo doi tuong
////        System.out.println("Size3 = " + listString.size());
//        listString.remove(1);
//        System.out.println("Size4 = " + listString.size());
        // In - for 
        // C1: for..thuong(for i)
//        for (int i = 0; i < listString.size(); i++) {
//            // gia tri o i => listString.get(i)
//            System.out.println(listString.get(i));
//        }
        // C2: for-each
        // Cu phap
        /**
         * for(Kieu du lieu tenBien : ten cua list){
         *      code
         * }
         */
//        for (String s : listString) {
//            System.out.println(s);
//        }
        // C3: Java 8 => lamda expression(->), method reference (::)
        // foreach + lamda expression 
        listString.forEach(s->System.out.println(s));
        // C4: for..each + method reference
    }

}
