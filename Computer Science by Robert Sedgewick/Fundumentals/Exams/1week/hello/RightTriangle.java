public class RightTriangle {
    public static void main(String[] args) {
        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);
        int num3 = Integer.parseInt(args[2]);

        int a = Math.min(Math.min(num1, num2), num3);
        int c = Math.max(Math.max(num1, num2), num3);
        int b = (num1 + num2 + num3) - (c + a);

        boolean isPositive = a > 0 && b > 0 && c > 0;
        boolean isRightTriangle = c*c == a*a + b*b;
        boolean result = isPositive && isRightTriangle;
        
        System.out.println(result);
    }
}
