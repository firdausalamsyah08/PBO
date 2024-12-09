package sesi4;

import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class Kasir {
    enum KartuMember {YA, TIDAK}

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(new Locale("in", "ID"));

        KartuMember kartuMember = null;

        // Memastikan input kartu member valid
        while (kartuMember == null) {
            System.out.print("Apakah ada kartu member (ya/tidak)? ");
            String input = scanner.nextLine().toUpperCase();
            try {
                kartuMember = KartuMember.valueOf(input);
            } catch (IllegalArgumentException e) {
                System.out.println("Masukkan 'ya' atau 'tidak'.");
            }
        }

        // Memastikan input total belanjaan valid
        int belanjaan = 0;
        while (true) {
            System.out.print("Total belanjaan: Rp ");
            if (scanner.hasNextInt()) {
                belanjaan = scanner.nextInt();
                if (belanjaan < 0) {
                    System.out.println("Total belanjaan tidak bisa negatif. Silakan masukkan angka positif.");
                } else {
                    break;
                }
            } else {
                System.out.println("Masukkan angka untuk total belanjaan.");
                scanner.next(); // Clear invalid input
            }
        }

        int diskon = hitungDiskon(belanjaan, kartuMember);
        int totalBayar = belanjaan - diskon;

        System.out.println("Total Bayar: " + formatRupiah.format(totalBayar));
        scanner.close(); // Menutup Scanner
    }

    private static int hitungDiskon(int belanjaan, KartuMember kartuMember) {
        int diskon = 0;
        if (kartuMember == KartuMember.YA) {
            if (belanjaan > 500000) {
                diskon = 50000;
            } else if (belanjaan > 100000) {
                diskon = 15000;
            }
        } else {
            if (belanjaan > 100000) {
                diskon = 5000;
            }
        }
        return diskon;
    }
}
