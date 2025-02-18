public class Mahasiswa01 {
    // Atribut
    String nim;
    String nama;
    String kelas;
    double ipk;

    // Konstruktor default
    public Mahasiswa01() {
        this.nim = "";
        this.nama = "";
        this.kelas = "";
        this.ipk = 0.0;
    }

    // Konstruktor berparameter
    public Mahasiswa01(String nim, String nama, String kelas, double ipk) {
        this.nim = nim;
        this.nama = nama;
        this.kelas = kelas;
        this.ipk = ipk;
    }

    // Method untuk menampilkan informasi mahasiswa
    public void tampilkanInformasi() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Kelas: " + kelas);
        System.out.println("IPK: " + ipk);
    }

    // Method untuk mengubah kelas mahasiswa
    public void ubahKelas(String kelasBaru) {
        this.kelas = kelasBaru;
        System.out.println("Kelas berhasil diubah menjadi: " + kelas);
    }

    // Method untuk memperbarui IPK mahasiswa
    public void updateIpk(double ipkBaru) {
        if (ipkBaru >= 0.0 && ipkBaru <= 4.0) {
            this.ipk = ipkBaru;
            System.out.println("IPK berhasil diperbarui menjadi: " + ipk);
        } else {
            System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0");
        }
    }

    // Method untuk menilai kinerja mahasiswa berdasarkan IPK
    public String nilaiKinerja() {
        if (ipk >= 3.5) {
            return "Sangat Baik";
        } else if (ipk >= 3.0) {
            return "Baik";
        } else if (ipk >= 2.5) {
            return "Cukup";
        } else {
            return "Kurang";
        }
    }
}
