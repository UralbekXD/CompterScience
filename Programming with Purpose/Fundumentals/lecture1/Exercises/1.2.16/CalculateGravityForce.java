public class CalculateGravityForce {
    public static void main(String[] args) {
        double G = 6.674e-11;  // N*m^2/kg^2
        
        double m1 = 5.972e24;
        double m2 = 1.989e30;
        double r = 149_600_000;

        double F = (G * m1 * m2) / (r*r);
        System.out.println(F);
    }
}
