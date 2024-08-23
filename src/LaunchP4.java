public class LaunchP4 {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < n; j++)
            {
                //if(j == 0 || i == 0 || i == n-1) // C
                if(j == 0 || i == 0 || i == n-1 || i == (n-1)/2)// E
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
