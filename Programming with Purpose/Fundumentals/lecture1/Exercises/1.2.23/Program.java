public class Program {
    public static void main(String[] args) {
        int m = Integer.parseInt(args[0]);
        int d = Integer.parseInt(args[1]);
        
        boolean isEven = m % 2 == 0;
        boolean isOdd = m % 2 != 0;
        boolean isValidDay = (d >= 1 && isEven && d <= 30) || (d >= 1 && isOdd && d <= 31);
        boolean isValidMonth = m >= 3 && m <= 6;

        boolean isValidInput = isValidDay && isValidMonth;


        boolean isMarch = m == 3;
        boolean isJune = m == 6;
        boolean isStart = isMarch && d < 20;
        boolean isEnd = isJune && d > 20;
        
        System.out.println(isValidInput && !(isStart ^ isEnd));
    }
}