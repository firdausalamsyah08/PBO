package Tugas.sesi1;

public class Setering {
    // Fungsi untuk membalik string
    public static String balikString(String s) {
        StringBuilder sb = new StringBuilder(s);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String kata = "Java";
        System.out.println("Balik dari '" + kata + "' adalah: " + balikString(kata));
    }
}

