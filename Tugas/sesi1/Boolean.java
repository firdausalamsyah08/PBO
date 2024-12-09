package Tugas.sesi1;

public class Boolean {
    // Fungsi untuk memeriksa apakah bilangan prima
    public static boolean isPrima(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int angka = 29;
        System.out.println("Apakah " + angka + " bilangan prima? " + isPrima(angka));
    }
}

