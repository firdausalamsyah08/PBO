package Tugas.sesi1;

public class segitiga {
    public static double hitungLuasSegitiga(double alas, double tinggi) {
        return 0.5 * alas * tinggi;
    }

    public static void main(String[] args) {
        double alas = 10.0;
        double tinggi = 5.0;
        System.out.println("Luas segitiga adalah: " + hitungLuasSegitiga(alas, tinggi));
    }
}

