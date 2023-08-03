public class Program {
    public static void main(String[] args) {
        int min = Integer.parseInt(args[0]);
        int max = Integer.parseInt(args[1]) + 1;

        int result = (int) (Math.random() * (max - min) + min);
        System.out.println(result);
    }
}
