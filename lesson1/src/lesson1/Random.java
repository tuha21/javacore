/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson1;

import java.util.Scanner;

/**
 *
 * @author tudev21
 */
public class Random {

    public static Scanner sc = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        nhap();
//        hinhchunhat();
//        lapphuong();
//        candelta();
    }

    public static double random(int min, int max) {
        return Math.floor(Math.random() * (max - min)) + min;
    }

    //bai1 nhap xuat
    public static void nhap() {
        System.err.println("Nhap xuat diem trung binh");
        String name = "";
        while (true) {
            System.out.println("Nhap ho va ten: ");
            name = sc.nextLine();
            if(!name.equals("")){
                break;
            }
        }
        double diemTB = nhapdouble("Nhap diem trung binh: ", "Diem phai la so lon hon 0", true);
        System.err.println("Ho va ten: " + name + "-" + diemTB);
    }

    //Bai2 tinh dien tich hinh chu nhat
    public static void hinhchunhat() {
        System.err.println("Chu vi dien tich hinh chu nhat");
        double canh1 = nhapdouble("Nhap canh thu nhat: ", "Canh phai la so lon hon 0", true);
        double canh2 = nhapdouble("Nhap canh thu hai: ", "Canh phai la so lon hon 0", true);
        double chuvi = (canh1 + canh2) * 2;
        double dientich = canh1 * canh2;
        System.out.println("Chieu dai: " + parse(Math.max(canh1, canh2)) + "-Chieu rong: " + parse(Math.min(canh1, canh2)));
        System.out.println("Chu vi hcn: " + parse(chuvi));
        System.out.println("Dien tich hcn: " + parse(dientich));
    }

    public static String parse(double num) {
        if (Math.round(num) == num) {
            return String.valueOf((int) num);
        }
        return String.valueOf(num);
    }

    //bai3 Tinh the tich khoi lap phuong
    public static void lapphuong() {
        System.err.println("Thinh the tich hinh lap phuong");
        double canh = nhapdouble("Nhap do dai canh hinh lap phuong: ", "Canh phai la so lon hon 0", true);
        double thetich = Math.pow(canh, 3);
        System.out.println("Hinh lap phuong-" + "Canh: " + parse(canh) + ", The tich: " + parse(thetich));
    }

    //bai4 tinh can delta
    public static void candelta() {
        System.err.println("Tinh can delta");
        System.out.println("Nhap he so cho phuong trinh bac 2: ax2 + bx + c");
        double a = nhapdouble("a: ", "a phai la so", false);
        double b = nhapdouble("b: ", "a phai la so", false);
        double c = nhapdouble("c: ", "a phai la so", false);
        double delta = Math.pow(b, 2) - 4 * a * c;
        double candelta = Math.sqrt(delta);
        System.out.println("Can delta: " + parse(delta));
    }

    public static double nhapdouble(String lenhnhap, String err, boolean checknhohon0) {
        double a = 0;
        while (true) {
            try {
                System.out.print(lenhnhap);
                a = Double.parseDouble(sc.nextLine());
                if (checknhohon0) {
                    if (a <= 0) {
                        System.out.println(5 / 0);
                    }
                }
                break;
            } catch (Exception e) {
                System.out.println(err);
            }
        }
        return a;
    }
}
