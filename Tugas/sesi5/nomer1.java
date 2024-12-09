package Tugas.sesi5;

import java.util.Scanner;

public class nomer1 {
    public static void main(String[] args) {
        // Membuat scanner untuk membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan angka
        System.out.print("Masukkan sebuah angka: ");
        double angka = scanner.nextDouble();

        // Memeriksa apakah angka positif, negatif, atau nol
        if (angka > 0) {
            System.out.println("Angka tersebut adalah angka positif.");
        } else if (angka < 0) {
            System.out.println("Angka tersebut adalah angka negatif.");
        } else {
            System.out.println("Angka tersebut adalah nol.");
        }

        // Menutup scanner
        scanner.close();
    }
}

