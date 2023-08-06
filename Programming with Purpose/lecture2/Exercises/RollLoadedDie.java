public class RollLoadedDie {
    public static void main(String[] args) {
        /*
         * prints the result of rolling a loaded die 
         * such that the probability of getting a 1, 2, 3, 4, or 5 is 1/8
         * and the probability of getting a 6 is 3/8.
        */

        double rand = Math.random() * 8 + 1;
        if (rand > 5) System.out.println(6);
        else System.out.println((int) rand);
    }
}
