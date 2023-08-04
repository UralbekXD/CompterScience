public class RandomWalkers {
    public static void main(String[] args) {
        int r = Integer.parseInt(args[0]);
        int trials = Integer.parseInt(args[1]);
        double totalSteps = 0;

        for (int i = 0; i < trials; i++) {
            int x = 0;
            int y = 0;
            int steps = 0;

            double east = 0.25;
            double south = 0.5;
            double west = 0.75;
            
            while ((Math.abs(x) + Math.abs(y)) != r) {
                steps++;
    
                double randomDirection = Math.random();
                if (randomDirection < east) y += 1;       // North
                else if (randomDirection >= east && randomDirection < south) x += 1;  // East
                else if (randomDirection >= south && randomDirection < west) y -= 1;  // South
                else if (randomDirection >= west) x -= 1;                             // West
            }

            totalSteps += steps;
        }
        
        double averageSteps = totalSteps / trials;
        System.out.println("average number of steps = " + averageSteps);
    }
}
