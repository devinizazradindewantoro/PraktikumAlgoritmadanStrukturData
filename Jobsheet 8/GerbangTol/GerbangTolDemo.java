package GerbangTol;

import java.util.Scanner;

public class GerbangTolDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasitas queue: ");
        int kapasitas = sc.nextInt();
        int menu;

        Kendaraan myKendaraan = new Kendaraan(kapasitas);

        do {
            System.out.println("\nMasukkan operasi yang diinginkan");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Print");
            System.out.println("4. Peek");
            System.out.println("5. Clear");
            System.out.println("6. Exit");
            System.out.println("------------------------------------");

            menu = sc.nextInt();
            sc.nextLine(); // Membersihkan karakter newline

            switch (menu) {
                case 1:
                    System.out.println("Masukkan no plat: ");
                    String noPlat = sc.nextLine();
                    System.out.println("Masukkan no kartu: ");
                    String noKartu = sc.nextLine();
                    System.out.println("Masukkan saldo: ");
                    double saldo = sc.nextDouble();

                    Kendaraan newKendaraan = new Kendaraan(noPlat, noKartu, saldo);
                    myKendaraan.enqueue(newKendaraan);
                    break;
                case 2:
                    Kendaraan deletedData = myKendaraan.dequeue();

                    if (deletedData != null) {
                        System.out.println("Data yang dikeluarkan: ");
                        System.out.println(deletedData);
                    }
                    break;
                case 3:
                    myKendaraan.print();
                    break;
                case 4:
                    myKendaraan.peek();
                    break;
                case 5:
                    myKendaraan.clear();
                    break;
            }
        } while (menu != 6); // Ubah kondisi untuk keluar dari loop
        sc.close();
    }
}
