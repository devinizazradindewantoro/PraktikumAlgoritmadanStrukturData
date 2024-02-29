import java.util.Scanner;

public class GajiMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Gaji gaji = new Gaji();

        System.out.println("Masukkan jumlah guru: ");
        int jumlahGuru = sc.nextInt();

        for (int i = 1; i < jumlahGuru; i++) {
        System.out.println("Masukkan data guru ke-" + i);
            sc.nextLine();
            System.out.print("Masukkan Nama Guru: ");
            gaji.namaGuru = sc.nextLine();
            System.out.print("Masukkan NIP: ");
            gaji.nipGuru = sc.nextInt();
            System.out.print("Masukkan Jabatan: ");
            gaji.jabatanGuru = sc.nextLine();

            sc.nextLine();
            System.out.print("Masukkan Golongan: ");
            gaji.golonganGuru = sc.nextInt();
            sc.nextLine();
            System.out.print("Masukkan Gaji Pokok: ");
            gaji.gajiPokokGuru = sc.nextInt();

            System.out.print("Masukkan Pajak: ");
            gaji.pajakGuru = sc.nextDouble();
            sc.nextLine();
            System.out.print("Masukkan Potongan Gaji: ");
            gaji.potonganGajiGuru = sc.nextDouble();
            System.out.print("Masukkan Gaji Bersih: ");
            gaji.gajiBersihGuru = sc.nextDouble();
        }

        for (int i = 0; i < jumlahGuru; i++) {
            gaji.tampilkanData();
        }

        sc.close();
    }
}