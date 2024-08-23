public class Hpattern {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                //if(j == 0 || j == n-1 || i == (n-1)/2) // For "H" Pattern
                //if(i==0 || j == (n-1)/2)  // For "T" Pattern
                //if(i==0 || i == n-1 || j==0 || i == (n-1)/2)  // For "E" Pattern
                //if(i == 0 || i == n-1 || j == 0) // For "C" Pattern
                //if(i == 0 || i == n-1 || j == 0 || j==n-1) // For "o" Pattern
                //if((i == 0 && j > 0) || (i == n-1 && j > 0) || (j == 0 && i > 0 && i < n-1)) // for "c" pattern
                //if((j==0 && i > 0) || (j == n-1 && i > 0) || (i == (n-1)/2) || (i == 0 && j > 0 && j < n-1)) // for "A" pattern
                if((j == 0) || (i == 0 && j < n-1) || (i == (n-1)/2 && j < n-1) || (i == n-1 && j < n-1) ||
                        (j== n-1) && i > 0 && i < n-1 && i !=(n-1)/2) // For "B" Pattern
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
