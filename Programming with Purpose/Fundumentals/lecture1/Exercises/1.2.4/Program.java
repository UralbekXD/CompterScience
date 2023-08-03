public class Program {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        boolean original = (!(a < b) && !(a > b));
        boolean simplified = a == b;

        System.out.println("Original: " + original);
        System.out.println("Simplified: " + simplified);
    }
}
