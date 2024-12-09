package sesi4;
import java.util.Scanner;

// Program IF dengan dua kondisi
public class CekKelulusan {
    public static void main(String[] args) {
        // Membuat variabel dan scanner
        int nilai;
        String nama;
        Scanner scan = new Scanner(System.in);

        // Mengambil input nama
        System.out.print("Nama : "); 
        nama = scan.nextLine();

        // Mengambil input nilai
        System.out.print("Nilai : "); 
        while (!scan.hasNextInt()) { // Validasi input agar hanya menerima angka
            System.out.println("Masukkan nilai dalam bentuk angka!");
            scan.next(); // Membersihkan input yang salah
            System.out.print("Nilai : ");
        }
        nilai = scan.nextInt();

        // Cek apakah dia lulus atau tidak
        if (nilai >= 70) {
            System.out.println("Selamat " + nama + ", Anda Lulus");
        } else {
            System.out.println("Maaf " + nama + ", Anda Gagal");
        }

        // Menutup scanner untuk mencegah kebocoran sumber daya
        scan.close();
    }
}
