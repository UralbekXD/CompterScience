public class Program {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = true;
        boolean expression = (!(a && b) && (a || b)) || ((a && b) || !(a || b));

        System.out.println(expression);
    }
}
