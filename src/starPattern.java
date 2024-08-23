public class starPattern {
    public static void main(String[] args) {
        int n = 6;
        // i values print rows
        for (int i = 0; i < n; i++) {
            // j values print columns
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
