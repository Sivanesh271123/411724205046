public class star {
    public static void main(String[] args) {
        int n = 5; // Number of rows for the star pattern
        int c = 65; // ASCII value for 'A'

        for (int i = 1; i <= n; i++) {
            // Print spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= 2 * i - 1; k++) {
               
                    System.out.print((char) c);
                  
                c++;

               
            }
            System.out.println();
            c-=i;// Move to the next line after each row
        }
    }
}
