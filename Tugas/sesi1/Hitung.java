package Tugas.sesi1;

public class Hitung {
    // Fungsi untuk menghitung jumlah digit dalam sebuah angka
    public static int hitungDigit(int n) {
        int jumlah = 0;
        while (n != 0) {
            n /= 10;
            jumlah++;
        }
        return jumlah;
    }

    public static void main(String[] args) {
        int angka = 12345;
        System.out.println("Jumlah digit dari " + angka + " adalah: " + hitungDigit(angka));
    }
}

