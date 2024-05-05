public class SnakeMain {
    public static void main(String[] args) {
        
        Snake snake1 = new Snake(0, 0);
        
        Snake snake2 = new Snake(3, 5);

        snake1.moveRight(); 
        snake1.moveUp();    

        snake2.moveLeft();  
        snake2.moveDown();  

        System.out.println("Posisi Snake 1:");
        snake1.printPosition();
        System.out.println("Posisi Snake 2:");
        snake2.printPosition();
    }
}