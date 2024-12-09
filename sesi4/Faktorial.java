package sesi4;

import java.util.Scanner;

public class Faktorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan sebuah angka (bilangan bulat non-negatif): ");

        // Memeriksa apakah input adalah bilangan bulat
        if (!input.hasNextInt()) {
            System.out.println("Input tidak valid. Harap masukkan bilangan bulat.");
            input.close(); // Menutup Scanner
            return;
        }

        int angka = input.nextInt();

        // Memeriksa apakah angka negatif
        if (angka < 0) {
            System.out.println("Faktorial tidak terdefinisi untuk bilangan negatif.");
            input.close(); // Menutup Scanner
            return;
        }

        int faktorial = 1;
        int i = angka;

        // Looping while untuk menghitung faktorial
        while (i > 0) {
            faktorial *= i; // Kalikan faktorial dengan nilai saat ini
            i--;            // Kurangi nilai
        }

        System.out.println("Faktorial dari " + angka + " adalah " + faktorial);
        input.close(); // Menutup Scanner
    }
}
