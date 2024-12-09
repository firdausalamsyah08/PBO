package Tugas.sesi1;

public class Luaspersegi {
    // Fungsi untuk menghitung luas persegi
    public static int luasPersegi(int sisi) {
        return sisi * sisi;
    }

    public static void main(String[] args) {
        int sisi = 5;
        System.out.println("Luas persegi dengan sisi " + sisi + " adalah: " + luasPersegi(sisi));
    }
}
