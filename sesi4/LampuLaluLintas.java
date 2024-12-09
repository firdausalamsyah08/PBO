package sesi4;

import java.util.Scanner;

// Program SWITCH
public class LampuLaluLintas {
    public static void main(String[] args) {
        // Membuat Variabel dan Scanner
        String lampu;
        Scanner scan = new Scanner(System.in);

        // Mengambil Input
        System.out.print("Inputkan Nama Warna: ");
        lampu = scan.nextLine().trim(); // Menghapus spasi di awal dan akhir

        switch (lampu.toLowerCase()) { // Menggunakan toLowerCase untuk menghindari masalah kapitalisasi
            case "merah":
                System.out.println("Lampu merah, berhenti!");
                break;
            case "kuning":
                System.out.println("Lampu kuning, harap hati-hati!");
                break;
            case "hijau":
                System.out.println("Lampu hijau, silakan jalan!");
                break;
            default:
                System.out.println("Warna lampu salah");
        }

        scan.close(); // Menutup Scanner
    }
}
