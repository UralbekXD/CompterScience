public class TriangleInequality {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        boolean isSideA = (b + c) > a;
        boolean isSideB = (a + c) > b;
        boolean isSideC = (a + b) > c;
        boolean result = isSideA && isSideB && isSideC;
        
        System.out.println(result);
    }
}