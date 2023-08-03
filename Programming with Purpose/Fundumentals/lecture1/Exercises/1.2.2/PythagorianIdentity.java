public class PythagorianIdentity {
    public static void main(String[] args) {
        double degrees = Double.parseDouble(args[0]);
        double radians = Math.toRadians(degrees);

        double result = Math.pow(Math.cos(radians), 2) + 
                         Math.pow(Math.sin(radians), 2);


        // Because computers not always calculates floating points correctly
        System.out.println(result);
    }
}