public class SepedaMain {
    public static void main(String[] args) {
        Sepeda sepeda1 = new Sepeda(25, 1);
        sepeda1.tambahKecepatan(3);
        sepeda1.cetakInfo();

        Sepeda sepeda2 = new Sepeda();
        sepeda2.kecepatan = 25;
        sepeda2.gear = 1;
        sepeda2.cetakInfo();

    }
}
