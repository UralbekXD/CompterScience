public class Program {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);

        double result = Math.sqrt(
            Math.pow((0 - x), 2) + Math.pow((0 - y), 2)
        );

        System.out.println(result);
    }
}