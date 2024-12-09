package sesi6;

class Mobil {
    String aktifitas;
    String warna;
    int kecepatan;

    public Mobil(String aktifitas, String warna, int kecepatan){
        this.aktifitas = aktifitas;
        this.warna = warna;
        this.kecepatan = kecepatan;
    }

    void cekKecepatan() {
        if (kecepatan == 0)
            aktifitas = "parkir";
    }

    void cetakAtribut() {
        System.out.println("Aktifitas = " + aktifitas);
        System.out.println("Warna = " + warna);
        System.out.println("Kecepatan = " + kecepatan);
    }

    
    public static class ClassMobil {

        public static void main(String[] args) {
            
            Mobil mobilku = new Mobil("Parkir", "Merah", 0);
            mobilku.kecepatan = 0;
            mobilku.warna = "merah";
            mobilku.cekKecepatan();
            mobilku.cetakAtribut();
        }
    }
}