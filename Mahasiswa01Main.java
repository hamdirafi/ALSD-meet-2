public class Mahasiswa01Main {
    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa(); // Membuat objek Mahasiswa
        mhs1.nama = "Andi";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI-1A";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("TI-2A");
        mhs1.updateIpk(3.9);
        mhs1.updateIpk(4.5);
    }
}