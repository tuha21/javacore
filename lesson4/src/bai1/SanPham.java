
package bai1;

import java.util.Scanner;

public class SanPham {
    private String ten;
    private double gia;
    private double giamGia;
    
    public SanPham(String ten, double gia, double giamGia){
        this.ten = ten;
        this.gia = gia;
        this.giamGia = giamGia;
    }
    
    public SanPham(String ten, double gia){
        this.ten = ten;
        this.gia = gia;
        this.giamGia = 0;
    }
    
    public String getTen (){
        return this.ten;
    }
    
    public void setTen(String ten){
        this.ten = ten;
    }
    
    public double getGia(){
        return this.gia;
    }
    
    public void setGia(double gia){
        this.gia = gia;
    }
    
    public double getGiamGia() {
        return this.giamGia;
    }
    
    public void setGiamGia(double giamGia){
        this.giamGia = giamGia;
    }
    
    private double getThueThuNhap() {
        return (this.gia*10)/100;
    }
    
    public String toString(){
        return "San pham: " + this.ten + ">>Gia " + this.gia + ">>Giam gia: " + this.giamGia + ">>Thue: " + this.getThueThuNhap();
    }
    
    public void xuat() {
        System.out.println(this.toString());
    }
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten san pham: ");
        this.ten = sc.nextLine();
        System.out.print("Nhap gia san pham: ");
        this.gia = sc.nextDouble();
        sc.nextLine();
        System.out.print("Nhap giam gia: ");
        this.giamGia = sc.nextDouble();
    }
    
    
}
