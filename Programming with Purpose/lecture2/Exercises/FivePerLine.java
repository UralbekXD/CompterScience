public class FivePerLine {
    public static void main(String[] args) {
        
        int START = 1000;
        int END = 2000;
        int INTERVAL = 5;

        for (int i = START; i < END; i += INTERVAL) {
            for (int j = i; j < i+5; j++) {
                System.out.print(j + " ");
            }

            System.out.println();
        }


    }
}
