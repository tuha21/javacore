package lesson2;

import java.util.Scanner;

public class Lesson2 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        while (true) {
            System.out.println("------------Menu-----------");
            System.out.println("\n1. Giải phương trình bậc 1");
            System.out.println("\n2. Giải phương trình bậc 2");
            System.out.println("\n3. Tính tiền điện");
            int a = 0;
            while (true) {
                try {
                    System.out.print("\n>>>>>Moi ban chon chuc nang: ");
                    a = Integer.parseInt(sc.nextLine());
                    if (a <= 0 || a > 3) {
                        System.out.println(0 / 0);
                    }
                    break;
                } catch (Exception e) {
                    System.out.println("Chỉ nhập từ 1 - 3");
                }
            }
            switch (a) {
                case 1:
                    ptbac1();
                    break;
                case 2:
                    ptbac2();
                    break;
                case 3:
                    tiendien();
                    break;
                default:
                    break;
            }
        }
    }

    //bai1 giai phuong trinh bac nhat
    public static void ptbac1() {
        double a = nhapdouble("Nhập a: ", "a phải là số", false);
        double b = nhapdouble("Nhập b: ", "b phải là số", false);
        if (a == 0) {
            if (b != 0) {
                System.out.println("Phương trình vô nghiệm");
            } else {
                System.out.println("Phương trình vô số nghiệm");
            }
        } else {
            System.out.println("Phuong trinh co nghiem: " + -b / a);
        }
    }
    
    //bai2 giai phuong trinh bac 2
    public static void ptbac2() {
        double a = nhapdouble("Nhập a: ", "a phải là số", false);
        double b = nhapdouble("Nhập b: ", "b phải là số", false);
        double c = nhapdouble("Nhập c: ", "c phải là số", false);
        if (a == 0) {
            if (b == 0) {
                if (c != 0) {
                    System.out.println("Phương trình vô nghiệm");
                } else {
                    System.out.println("Phương trình vô số nghiệm");
                }
            } else {
                System.out.println("Phương trình có nghiệm: " + -c / b);
            }
        } else {
            double delta = Math.pow(b, 2) - 4 * a * c;
            if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / 2 * a;
                double x2 = (-b - Math.sqrt(delta)) / 2 * a;
                System.out.println("Phương trình có 2 nghiệm: " + x1 + ", " + x2);
            } else if (delta == 0) {
                System.out.println("Phương trình có nghiêm kép: " + -b / 2 * a);
            } else {
                System.out.println("Phương trình vô nghiệm");
            }
        }
    }

    public static double nhapdouble(String content, String err, boolean checkvalue) {
        double a = 0;
        while (true) {
            try {
                System.out.print(content);
                a = Double.parseDouble(sc.nextLine());
                if (checkvalue) {
                    if (a <= 0) {
                        System.out.println(0 / 0);
                    }
                }
                break;
            } catch (Exception e) {
                System.out.println(err);
            }
        }
        return a;
    }

    //bai3 tinh tien dien
    public static void tiendien() {
        double soDien = nhapdouble("Nhập số điện: ", "Số điện phải >= 0", true);
        double tienDien = 0;
        if (soDien <= 50) {
            tienDien = soDien * 1000;
        } else if (soDien > 50) {
            tienDien = 50 * 1000 + (soDien - 50) * 1200;
        }
        System.out.println("Tiền điện của bạn là: " + tienDien);
    }
}
