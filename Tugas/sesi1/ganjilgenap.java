package Tugas.sesi1;

public class ganjilgenap {
    public static boolean isGenap(int n) {
        return n % 2 == 0;
    }

    public static void main(String[] args) {
        int angka = 4;
        System.out.println("Apakah " + angka + " bilangan genap? " + isGenap(angka));
    }
}
