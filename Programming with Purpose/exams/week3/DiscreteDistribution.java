public class DiscreteDistribution {
    public static void main(String[] args) {
        // Getting command line arguments
        int m = Integer.parseInt(args[0]);
        int[] a = new int[args.length-1];
        for (int i = 0; i < args.length-1; i++) {
            a[i] = Integer.parseInt(args[i+1]);
        }
        
        // Calculating the subintervals
        int[] sub = new int[a.length+1];
        for (int i = 1; i < sub.length; i++) 
        {   
            int sum = 0;
            for (int j = 0; j < i; j++) 
                sum += a[j];
            sub[i] = sum;
        }

        
        for (int i = 0; i < m; i++) 
        {
            int r = (int) (Math.random() * sub[sub.length-1]);
            
            for (int j = 0; j < sub.length-1; j++)
            {
                if (r >= sub[j] && r < sub[j+1])
                {
                    r = j+1;
                    break;
                }
            }

            System.out.print(r + " ");
        }
        System.out.println();
    }
}