package Tugas.sesi1;

public class Minimum {
    public static int temukanMinimum(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] angka = {3, 5, 1, 7, 9};
        System.out.println("Nilai minimum dalam array: " + temukanMinimum(angka));
    }
}

