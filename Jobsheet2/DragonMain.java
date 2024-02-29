public class DragonMain {
    public static void main(String[] args) {
        
        Dragon dragon1 = new Dragon(0, 0, 1);
        
        Dragon dragon2 = new Dragon(2, 5, 2);

        dragon1.changeDirection(2);
        
        dragon1.move(3);

        
        dragon2.changeDirection(3);
        
        dragon2.move(2);

        System.out.println("Status Dragon 1:");
        dragon1.printStatus();
        System.out.println("Status Dragon 2:");
        dragon2.printStatus();
        
    }
}