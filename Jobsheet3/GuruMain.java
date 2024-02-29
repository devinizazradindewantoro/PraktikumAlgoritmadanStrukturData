import java.util.Scanner;

public class GuruMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Guru guru = new Guru();

        System.out.println("Masukkan jumlah guru: ");
        int jumlahGuru = sc.nextInt();

        for (int i = 1; i < jumlahGuru; i++) {
            System.out.println("Masukkan data guru ke-" + i);
            sc.nextLine();
            System.out.print("Masukkan Nama Guru: ");
            guru.namaGuru = sc.nextLine();
            System.out.print("Masukkan NIP: ");
            guru.nipGuru = sc.nextInt();
            System.out.print("Masukkan Jabatan: ");
            guru.jabatanGuru = sc.nextLine();

            sc.nextLine();
            System.out.print("Masukkan Golongan: ");
            guru.golonganGuru = sc.nextInt();
            sc.nextLine();
            System.out.print("Masukkan Mata Pelajaran: ");
            guru.mataPelajaranGuru = sc.nextLine();

            System.out.print("Masukkan Gaji Utama: ");
            guru.gajiUtamaGuru = sc.nextDouble();
            sc.nextLine();
            System.out.print("Masukkan Alamat: ");
            guru.alamatGuru = sc.nextLine();
            System.out.print("Masukkan Pendidikan Terakhir: ");
            guru.pendidikanGuru = sc.nextLine();
        }
    for (int i = 0; i < jumlahGuru; i++) {
        guru.tampilkanData();
    }

        sc.close();
    }
}