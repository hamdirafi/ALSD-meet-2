public class MataKuliahMain {
    public static void main(String[] args) {
        // Objek 1: Menggunakan konstruktor default
        MataKuliah mk1 = new MataKuliah();
        mk1.kodeMK = "MK001";
        mk1.nama = "Algoritma dan Struktur Data";
        mk1.sks = 3;
        mk1.jumlahJam = 4;

        // Objek 2: Menggunakan konstruktor berparameter
        MataKuliah mk2 = new MataKuliah("MK002", "Pemrograman Berorientasi Objek", 4, 6);

        // Memanggil method untuk objek 1
        System.out.println("Informasi Mata Kuliah 1:");
        mk1.tampilInformasi();
        mk1.ubahSKS(4);
        mk1.tambahJam(2);
        mk1.kurangiJam(3);
        mk1.tampilInformasi();

        // Memanggil method untuk objek 2
        System.out.println("\nInformasi Mata Kuliah 2:");
        mk2.tampilInformasi();
        mk2.ubahSKS(3);
        mk2.tambahJam(1);
        mk2.kurangiJam(5); // Pengurangan tidak valid
        mk2.tampilInformasi();
    }
}