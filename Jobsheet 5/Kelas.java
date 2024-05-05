package Jobsheet5;

public class Kelas {
    Mahasiswa [] daftarMahsiswa;
    int index;

    public Kelas (int kuota){
        daftarMahsiswa = new Mahasiswa[kuota];
    }

    public void add (Mahasiswa mahasiswa){
        if (index < daftarMahsiswa.length){
            daftarMahsiswa [index] = mahasiswa;
            index++;
        }else {
            System.out.println("!!! Kelas Sudah Penuh !!!");
        }
    }

    public void displayInfo (){
        for (Mahasiswa mahasiswa : daftarMahsiswa) {
            mahasiswa.displayInfo();
        }
    }

    public void bubbleSortByIpk (){
        int n = daftarMahsiswa.length;

        for (int i = 0; i < n -1 ; i++ ){
            for (int j = 0 ; j < n - i - 1; j++){
                if (daftarMahsiswa[j].ipk > daftarMahsiswa [j+1].ipk ){
                    Mahasiswa temp = daftarMahsiswa[j];
                    daftarMahsiswa [j] = daftarMahsiswa [j+1];
                    daftarMahsiswa [j+1] = temp;    
                }
            }
        }
    }
    
    public void insertionSortByIpkDesc (){
        int n = daftarMahsiswa.length;

        for (int i = 1; i < n; ++i){
            Mahasiswa key = daftarMahsiswa[i];
            int j = i - 1;

            while (j >= 0 && daftarMahsiswa[j].ipk < key.ipk){  
                daftarMahsiswa[j+1] = daftarMahsiswa[j];
                j--;
            }
            
            daftarMahsiswa[j + 1] = key;
        }
    }

    public void selectionSortByUmur (){
        int n = daftarMahsiswa.length;

        for (int i = 0; i < n - 1; i++){
            int minIndex = i;

            for (int j = i + 1; j < n; j++){
                if (daftarMahsiswa[j].umur < daftarMahsiswa[minIndex].umur){
                    minIndex = j;
                }
            }
            Mahasiswa temp = daftarMahsiswa[minIndex];
            daftarMahsiswa[minIndex] = daftarMahsiswa[i];
            daftarMahsiswa[i] = temp;
        }
    }

}