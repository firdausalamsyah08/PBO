package Tugas.sesi6;

class Pesawat {
    String status;
    String warna;
    int ketinggian;

    public Pesawat(String status, String warna, int ketinggian) {
        this.status = status;
        this.warna = warna;
        this.ketinggian = ketinggian;
    }

    void cekKetinggian() {
        if (ketinggian == 0)
            status = "di darat";
        else
            status = "di udara";
    }

    void cetakAtribut() {
        System.out.println("Status = " + status);
        System.out.println("Warna = " + warna);
        System.out.println("Ketinggian = " + ketinggian);
    }

    public static class ClassPesawat {
        public static void main(String[] args) {
            Pesawat pesawatku = new Pesawat("di darat", "Putih", 0);
            pesawatku.ketinggian = 10000;
            pesawatku.cekKetinggian();
            pesawatku.cetakAtribut();
        }
    }
}
