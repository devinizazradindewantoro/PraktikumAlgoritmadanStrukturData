public class Dragon {
    private int x; 
    private int y; 
    private int direction; 

    public Dragon(int x, int y, int direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    public void changeDirection(int newDirection) {
        if (newDirection >= 1 && newDirection <= 4) {
            direction = newDirection;
        } else {
            System.out.println("Arah baru tidak valid.");
        }
    }

    public void move(int steps) {
        switch (direction) {
            case 1: // atas
                y += steps;
                break;
            case 2: // kanan
                x += steps;
                break;
            case 3: // bawah
                y -= steps;
                break;
            case 4: // kiri
                x -= steps;
                break;
            default:
                System.out.println("Arah tidak valid.");
        }
    }

    public void printStatus() {
        System.out.println("Posisi dragon: (" + x + ", " + y + ")");
        System.out.println("Arah dragon: " + direction);
    }
}