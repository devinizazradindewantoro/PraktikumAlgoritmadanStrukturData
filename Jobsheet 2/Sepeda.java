public class Sepeda {
    float kecepatan;
    int gear;

    public Sepeda(){

    }

    public Sepeda(float newKecepatan, int newGear){
        kecepatan = newKecepatan;
        gear = newGear;
    }
    
    public void tambahKecepatan(float increment){
        kecepatan += increment;
    }

    public void kurangiKecepatan(float decrement){
        kecepatan -= decrement;
    }

    public void cetakInfo1(){
        System.out.println("Kecepatan: " + kecepatan);
        System.out.println("Gear: " + gear);
        System.out.println("=====================");
    }

    public void cetakInfo2(){
        System.out.println("Kecepatan: " + kecepatan);
        System.out.println("Gear: " + gear);
        System.out.println("=====================");
    }

    public void cetakInfo3(){
        System.out.println("Kecepatan: " + kecepatan);
        System.out.println("Gear: " + gear);
        System.out.println("=====================");
    }

    public void cetakInfo4(){
        System.out.println("Kecepatan: " + kecepatan);
        System.out.println("Gear: " + gear);
        System.out.println("=====================");
    }

    public void cetakInfo5(){
        System.out.println("Kecepatan: " + kecepatan);
        System.out.println("Gear: " + gear);
        System.out.println("=====================");
    }
}
