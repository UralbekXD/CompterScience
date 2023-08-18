public class Hellos {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);

        for (int i = 1; i <= n; i++) {
            int remainder = i;
            while (remainder > 10) {
                remainder = remainder % 10;
            }
            
            switch (remainder) {
                case 1: System.out.println(i + "st Hello"); break;
                case 2: System.out.println(i + "nd Hello"); break;
                case 3: System.out.println(i + "rd Hello"); break;
                default: System.out.println(i + "th Hello"); break;
            }
        }
    }
}
