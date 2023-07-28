public class Program {
    public static void main(String[] args) {
        /*********************
        | Write a program that takes two positive integers as command-line arguments 
        | and prints true if either evenly divides the other.
        |
        *********************/ 

        int num1 = Integer.parseInt(args[0]);
        int num2 = Integer.parseInt(args[1]);

        boolean isNum1 = num2 % num1 == 0;
        boolean isNum2 = num1 % num2 == 0;
        boolean result = isNum1 || isNum2;

        System.out.println(result);
    }
}
