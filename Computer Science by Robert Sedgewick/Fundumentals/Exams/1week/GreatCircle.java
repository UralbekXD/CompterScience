public class GreatCircle {
    public static void main(String[] args) {
        // lattitude and longtitude (in degrees)
        double x1 = Math.toRadians(Double.parseDouble(args[0]));
        double y1 = Math.toRadians(Double.parseDouble(args[1]));
        double x2 = Math.toRadians(Double.parseDouble(args[2]));
        double y2 = Math.toRadians(Double.parseDouble(args[3]));
        
        double EARTH_RADIUS = 6371.0;
        
        double distance = 2*EARTH_RADIUS * Math.asin(Math.sqrt(
            Math.pow(Math.sin((x2-x1)/2), 2) + Math.cos(x1) * Math.cos(x2) * Math.pow(Math.sin((y2-y1)/2), 2)
        ));
        
        System.out.println(distance + " kilometers");
    }
}
