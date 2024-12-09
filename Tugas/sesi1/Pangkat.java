package Tugas.sesi1;

public class Pangkat {
    public static int hitungPangkat(int basis, int eksponen) {
        int hasil = 1;
        for (int i = 0; i < eksponen; i++) {
            hasil *= basis;
        }
        return hasil;
    }

    public static void main(String[] args) {
        int basis = 2;
        int eksponen = 3;
        System.out.println(basis + " pangkat " + eksponen + " adalah: " + hitungPangkat(basis, eksponen));
    }
}

