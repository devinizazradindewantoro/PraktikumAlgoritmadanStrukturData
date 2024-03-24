public class SepedaMain {
    public static void main(String[] args) {
        Sepeda sepeda1 = new Sepeda(5,1);
        sepeda1.tambahKecepatan(3);
        sepeda1.kurangiKecepatan(6);
        sepeda1.cetakInfo1();

        Sepeda sepeda2 = new Sepeda();
        sepeda2.kecepatan = 7;
        sepeda2.gear = 2;
        sepeda2.cetakInfo2();

        Sepeda sepeda3 = new Sepeda();
        sepeda3.kecepatan = 7;
        sepeda3.gear = 9;
        sepeda3.cetakInfo2();

    }
}
