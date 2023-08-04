public class RandomWalker {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);

        int x = 0;
        int y = 0;
        int steps = 0;
        
        System.out.println("(" + x + ", " + y + ")");
        while (true) {
            steps++;

            int randomDirection = (int) (Math.random() * 4 + 1);
            
            if (randomDirection == 1) y += 1;       // North
            else if (randomDirection == 2) x += 1;  // East
            else if (randomDirection == 3) y -= 1;  // South
            else x -= 1;                            // West

            int manhattanDistance = Math.abs(x) + Math.abs(y);
            if (manhattanDistance == r) {
                System.out.println("(" + x + ", " + y + ")");
                System.out.println("steps = " + steps);
                break;
            } else {
                System.out.println("(" + x + ", " + y + ")");
            }
        }
    }
}
