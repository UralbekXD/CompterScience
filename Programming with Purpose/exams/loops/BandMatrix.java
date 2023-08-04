public class  BandMatrix {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int width = Integer.parseInt(args[1]);
        char star = '*';
        char zero = '0';
        String twoSpace = "  ";

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                double distance = Math.sqrt(Math.pow(j - i, 2) + Math.pow(i - i, 2));
                boolean isDistanceGreater = distance > width;

                if (isDistanceGreater) {
                    System.out.print(zero + twoSpace);
                } else {
                    System.out.print(star + twoSpace);
                }
            }
            System.out.println();
        }
    }
}
