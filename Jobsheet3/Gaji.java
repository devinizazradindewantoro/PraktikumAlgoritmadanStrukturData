public class Gaji {
    public String namaGuru, jabatanGuru;
    public int nipGuru, golonganGuru, gajiPokokGuru;
    public double pajakGuru, potonganGajiGuru, gajiBersihGuru;

    public void tampilkanData() {
        System.out.println("\n=========================================");
        System.out.println("Nama : " + namaGuru);
        System.out.println("NIP : " + nipGuru);
        System.out.println("Jabatan : " + jabatanGuru);
        System.out.println("Golongan : " + golonganGuru);
        System.out.println("Gaji Pokok : " + gajiPokokGuru);
        System.out.println("Pajak : " + pajakGuru);
        System.out.println("Potongan Gaji : " + potonganGajiGuru);
        System.out.println("Gaji Bersih : " + gajiBersihGuru);
        System.out.println("=========================================");
    }
}
