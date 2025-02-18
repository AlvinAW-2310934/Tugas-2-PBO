
package com.mycompany.tugas_2_pbo;
import java.util.Scanner;

    public class Tugas_2_nomor2_PBO {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Masukkan rangking Anda: ");
            int rangking = input.nextInt();

            System.out.print("Apakah Anda naik kelas? (true/false): ");
            boolean naikKelas = input.nextBoolean();

            if (rangking == 1 && naikKelas) {
                System.out.println("Selamat anda mendapat hadiah karena anda juara 1");
            } else {
                System.out.println("Anda tidak mendapatkan hadiah karena anda bukan juara 1, Coba lagi tahun depan.");       
            }
            
    }
}
