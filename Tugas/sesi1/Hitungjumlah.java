package Tugas.sesi1;

public class Hitungjumlah {
    public static int hitungJumlah(int[] arr) {
        int total = 0;
        for (int i = 0; i < arr.length; i++) {
            total += arr[i];
        }
        return total;
    }

    public static void main(String[] args) {
        int[] angka = {1, 2, 3, 4, 5};
        System.out.println("Jumlah elemen dalam array: " + hitungJumlah(angka));
    }
}

