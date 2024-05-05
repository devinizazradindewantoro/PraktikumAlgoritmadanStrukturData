public class Guru {
    public String namaGuru, jabatanGuru, mataPelajaranGuru, alamatGuru, pendidikanGuru;
    public int nipGuru, golonganGuru;
    public double gajiUtamaGuru;
    
    public void tampilkanData() {
        System.out.println("\n=========================================");
        System.out.println("Nama : " + namaGuru);
        System.out.println("NIP : " + nipGuru);
        System.out.println("Jabatan : " + jabatanGuru);
        System.out.println("Golongan : " + golonganGuru);
        System.out.println("Mata Pelajaran : " + mataPelajaranGuru);
        System.out.println("Gaji Utama : " + gajiUtamaGuru);
        System.out.println("Alamat : " + alamatGuru);
        System.out.println("Pendidikan Terakhir : " + pendidikanGuru);
        System.out.println("=========================================");
    }
}