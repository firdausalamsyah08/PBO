package sesi3;

import java.util.Scanner;

public class Aritmatika {
    public static void main(String[] args) {

        // membuat objek scanner untuk input dari pengguna
        Scanner input = new Scanner(System.in);

        // meminta input dari pengguna
        System.out.print("Masukkan angka pertama: ");
        double angka1 = input.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double angka2 = input.nextDouble();

        // melakukan operasi aritmatika
        double penjumlahan = angka1 + angka2;
        double pengurangan = angka1 - angka2;
        double perkalian = angka1 * angka2;
        double pembagian = angka1 / angka2;

        // menampilkan hasil
        System.out.println("Hasil penjumlahan: " + penjumlahan);
        System.out.println("Hasil pengurangan: " + pengurangan);
        System.out.println("Hasil perkalian: " + perkalian);
        System.out.println("Hasil pembagian: " + pembagian);

        // Menutup input
        input.close();
    }
}

