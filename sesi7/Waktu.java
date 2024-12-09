package sesi7;

public class Waktu {
    private int jam;
    private int menit;

    public Waktu() {
        this.jam = 0;
        this.menit = 0;
    }

    public void setJam(int jam) {
        this.jam = jam;
    }

    public void setMenit(int menit) {
        this.menit = menit;
    }

    public int getJam() {
        return jam;
    }

    public int getMenit() {
        return menit;
    }

    public int getTotalMenit() {
        return jam * 60 + menit;
    }

    public void tampilWaktu() {
        System.out.println("Waktu saat ini: " + jam + " jam " + menit + " menit");
    }

    public void tampilJam(int jam) {
        System.out.println("Jam yang ditampilkan: " + jam);
    }

    public void tambahMenit(int tambahan) {
        menit += tambahan;
        while (menit >= 60) {
            menit -= 60;
            jam++;
        }
    }
}
