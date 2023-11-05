/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package luasbangunruang;
import java.util.Scanner;

/**
 *
 * @author chodi
 */
public class luas {

    /**
     * @param args the command line arguments
     */
    static int luaskubus(int s){
        int luas= 6*(s*s);
        return luas;
    }

    static float LuasBalok(float p, float t, float l){
        float luas = 2*(p*l+p*t+l*t);
        return luas;
    }
    
    static float LuasKerucut(float r, float s){
       float phi = (float) 3.14;
       float luas = (phi*r*s)+(phi*r*r);
       return luas;
    }
    static float LuasTabung(float r, float t){
        float phi = (float) 3.14;
        float luas = 2*phi*r*(r+t);
        return luas ;
    }
        static float LuasBola(float r){
        float phi = (float) 3.14;
        float luas = 4*phi*r*r;
        return luas;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Pilih Angka 1-5 : ");
        int angka = sc.nextInt();
        switch (angka) {
            case 1:
                System.out.println("--- MENGHITUNG LUAS PERMUKAAN KUBUS ---");
                System.out.print("Masukkan Sisi Kubus : ");
                int sisi = sc.nextInt();
                System.out.print("Luas Permukaan Kubus adalah " + luaskubus(sisi));
                break;
            case 2 :
                System.out.println("--- MENGHITUNG LUAS BALOK ---");
                System.out.print("Masukkan panjang balok :"); 
                float p = sc.nextFloat();
                System.out.print("Masukkan tinggi balok"); 
                float t = sc.nextFloat();
                System.out.print("Masukkan lebar balok"); 
                float l = sc.nextFloat();
                System.out.print("Luas permukaan balok adalah : " + LuasBalok(p,t,l));
                break;
            case 3 :
                System.out.println("--- MENGHITUNG LUAS KERUCUT ---");
                System.out.print("Masukkan jari-jari luas lingkaran :");
                float r = sc.nextFloat();
                System.out.print("Masukkan panjang garis apotema :");
                float s = sc.nextFloat();
                System.out.print("Luas Permukaan Kerucut Adalah : " + LuasKerucut(r,s));
                break;
            case 4:
                System.out.println("--- MENGHITUNG LUAS TABUNG ---");
                System.out.println("Masukkan jari-jari lingkaran Tabung : ");
                float jt = sc.nextFloat();
                System.out.println("Masukkan tinggi tabung : ");
                float tb = sc.nextFloat();
                System.out.print("Luas Permukaan Tabung adalah : " + LuasTabung(jt,tb));
                break;
            case 5:
                System.out.println("--- MENGHITUNG LUAS LINGKARAN ---");
                System.out.print("Masukkan jari jari alas lingkaran : ");
                float jb = sc.nextFloat();
                System.out.print("Luas Permukaan Bola adalah : " + LuasBola(jb));
                break;
            default:
                System.out.println("Angka yang dimasukkan salah ");
        }
    }
    
}
