
package com.mycompany.tugas_2_pbo;
import java.util.Scanner;

    public class Tugas_2_nomor1_PBO {
        public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Masukkan bilangan pertama: ");
        double a = input.nextDouble();
        System.out.print("Masukkan bilangan kedua: ");
        double b = input.nextDouble();
        System.out.print("Masukkan bilangan ketiga: ");
        double c = input.nextDouble();
        
        double tambah = a + b + c;
        double kurang = a - b - c;
        double kali = a * b * c;
        double bagi = a / b / c;
        
        System.out.println("Hasil Penjumlahan: " + tambah);
        System.out.println("Hasil Pengurangan: " + kurang);
        System.out.println("Hasil Perkalian: " + kali);
        System.out.println("Hasil Pembagian: " + bagi);

    }
}
