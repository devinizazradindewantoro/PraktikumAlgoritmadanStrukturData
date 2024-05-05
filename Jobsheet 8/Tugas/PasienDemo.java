package Klinik;

import java.util.Scanner;

public class PasienDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan kapasitas antrian pasien: ");
        int kapasitas = sc.nextInt();
        int menu;

        Queue myQueue = new Queue(kapasitas);
        do{
            System.out.println("Masukkan operasi yang diinginkan");
            System.out.println("--------------------------------------");
            System.out.println("1. Enqueue Pasien");
            System.out.println("2. Dequeue Pasien");
            System.out.println("3. Print");
            System.out.println("4. Cek antrian paling depan");
            System.out.println("5. Cek antrian paling belakang");
            System.out.println("6. Clear");
            System.out.println("7. Search antrian berdasarkan nama");
            System.out.println("8. Exit");
            System.out.println("--------------------------------------");
            menu = sc.nextInt();

            switch (menu) {
                case 1:
                    sc.nextLine();
                    System.out.print("Masukkan Nama Pasien: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan ID Pasien: ");
                    String noID = sc.nextLine();
                    System.out.print("Masukkan Jenis Kelamin Pasien: ");
                    String jenisKelamin = sc.nextLine();

                    Pasien pasien = new Pasien(nama, noID, jenisKelamin);
                    myQueue.enqueue(pasien);
                    break;
                case 2:
                    Pasien deletedData = myQueue.dequeue();
                    if (deletedData != null){
                        System.out.println("Data yang dikeluarkan: \n" + deletedData);
                    }
                    break;
                case 3:
                    myQueue.print();
                    break;
                case 4:
                    myQueue.peekFront();
                    break;
                case 6:
                    myQueue.clear();
                    break;
                case 5:
                    myQueue.peekRear();
                    break;
                case 7:
                    System.out.println("Masukkan nama yang akan di cari: ");
                    sc.nextLine();
                    String namaSearch = sc.nextLine();
                    myQueue.sequentialSearch(namaSearch);
                    
            }
        }while (menu >= 1 && menu <= 7);
        sc.close();
    }
}