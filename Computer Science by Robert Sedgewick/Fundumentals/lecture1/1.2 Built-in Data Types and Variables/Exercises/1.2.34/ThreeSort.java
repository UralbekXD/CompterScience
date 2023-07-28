public class ThreeSort {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);
        
        // MIN number
        int min = Math.min(num1, num2);
        min = Math.min(min, num3);

        // MAX number
        int max = Math.max(num1, num2);
        max = Math.max(max, num3);

        int sum = num1 + num2 + num3;
        int mid = sum - (min + max);

        System.out.println(min);
        System.out.println(mid);
        System.out.println(max);
    }
}
