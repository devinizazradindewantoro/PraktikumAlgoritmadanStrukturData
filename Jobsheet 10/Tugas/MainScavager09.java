public class MainScavager09 {
    public static void main(String[] args) {
        // Membuat objek untuk permainan scavenger hunt
        ScavengerHunt09 game = new ScavengerHunt09();

        // Menambahkan titik-titik dan pertanyaan serta jawaban
        game.addPoint("Siswa newSiswa = new Siswa(); , Tunjukkan yang disebut tipe data?", "Siswa");
        game.addPoint("Apa tipe data untuk kumpulan karakter?", "String");
        game.addPoint("Construktor juga dimaksud dengan method apa ?", "Istimewa");
        game.addPoint("Class digunakan untuk membentuk apa?", "Objek");
        game.addPoint("Kata kunci new digunakan untuk ?", "Instansiasi");

        // Memulai permainan
        game.play();
       
    }
}
