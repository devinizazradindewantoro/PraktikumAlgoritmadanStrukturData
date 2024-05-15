import java.util.Scanner;
public class ScavengerMain {
    public static void main(String[] args) {
        ScavengerHunt game = new ScavengerHunt();
        game.addPoint("Apa nama ibukota Indonesia?", "Jakarta");
        game.addPoint("Berapakah hasil 5 + 5?", "10");
        game.addPoint("Berapa tanggal Kemerdekaan Indonesia?", "17 Agustus");
        game.addPoint("Kepanjangan dari NKRI adalah?", "Negara Kesatuan Republik Indonesia");

        game.displayPoints();

        Scanner sc15 = new Scanner(System.in);
        while (game.head != null) {
            System.out.print("Jawab: ");
            String answer = sc15.nextLine();
            if (game.checkAnswer(answer)) {
                System.out.println("Jawaban benar! Lanjut ke point berikutnya.");
            } else {
                System.out.println("Jawaban salah. Coba lagi.");
            }
        }
        System.out.println("Selamat! Anda telah menyelesaikan game.");
        sc15.close();
        System.exit(0);
    }
}
