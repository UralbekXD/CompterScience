public class Program {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double v = Double.parseDouble(args[1]);
        double t = Double.parseDouble(args[2]);

        double g = 9.80665;

        double result = x + v*t - (g*(t*t)) / 2;
        System.out.println(result);
    }
}
