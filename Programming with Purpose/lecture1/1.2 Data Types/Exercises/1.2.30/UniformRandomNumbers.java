public class UniformRandomNumbers {
    public static void main(String[] args) {
        double num1 = Math.random();
        double num2 = Math.random();
        double num3 = Math.random();
        double num4 = Math.random();
        double num5 = Math.random();
        
        // Print 5 random numbers
        System.out.println("1: " + num1);
        System.out.println("2: " + num2);
        System.out.println("3: " + num3);
        System.out.println("4: " + num4);
        System.out.println("5: " + num5);
        
        double max;
        max = Math.max(num1, num2);
        max = Math.max(max, num3);
        max = Math.max(max, num4);
        max = Math.max(max, num5);

        double min;
        min = Math.min(num1, num2);
        min = Math.min(min, num3);
        min = Math.min(min, num4);
        min = Math.min(min, num5);
        
        // Separate random number output from calculation
        System.out.println();

        // Print AVG of these numbers
        System.out.println("AVG: " + (num1 + num2 + num3 + num4 + num5) / 5.0);

        // Print MAX number
        System.out.println("MAX: " + max);

        // Print MIN number
        System.out.println("MIN: " + min);
    }
}