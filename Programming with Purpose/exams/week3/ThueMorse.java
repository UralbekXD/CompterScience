public class ThueMorse {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] thuemorse = new int[n];

        for (int i = 0; i < n; i++) {
            if (i == 0) {
                thuemorse[i] = 0;
            } else if (i % 2 != 0) {
                thuemorse[i] = 1 - thuemorse[i - 1];
            } else {
                thuemorse[i] = thuemorse[i / 2];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (thuemorse[i] == thuemorse[j]) {
                    System.out.print("+" + "  ");
                } else {
                    System.out.print("-" + "  ");
                }
            }
            System.out.println();
        }
    }
}