package Tugas.sesi5;

import java.util.Scanner;

public class nomer3 {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner input = new Scanner(System.in);
        int number;

        // Perulangan do-while untuk terus meminta angka sampai pengguna memasukkan 0
        do {
            System.out.print("Masukkan sebuah angka (0 untuk berhenti): ");
            number = input.nextInt();
        } while (number != 0);

        // Menutup Scanner setelah selesai digunakan
        input.close();

        System.out.println("Program berhenti karena Anda memasukkan angka 0.");
    }
}
