public class CMYKtoRGB {
    public static void main(String[] args) {
        // Get arguments
        double cyan = Double.parseDouble(args[0]);
        double magenta = Double.parseDouble(args[1]);
        double yellow = Double.parseDouble(args[2]);
        double black = Double.parseDouble(args[3]);
        
        // Formula
        double white = 1 - black;
        double red = Math.round(255 * white * (1 - cyan));
        double green = Math.round(255 * white * (1 - magenta));
        double blue = Math.round(255 * white * (1 - yellow));

        // Print results
        System.out.println("red   = " + (int) red);
        System.out.println("green = " + (int) green);
        System.out.println("blue  = " + (int) blue);
    }
}
