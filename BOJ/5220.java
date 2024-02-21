import java.util.Scanner;

public class Main {

    /* Given a value and a checkbit, return "true" if the check bit matches
     * up with the "value", and "false" otherwise. */
    private static boolean solveErrorDetection(int value, int checkbit) {
        /* ------------------- INSERT CODE HERE ---------------------*/
            String binaryValue = Integer.toBinaryString(value);
            int count = 0;
        
            for (int i = 0; i < binaryValue.length(); i++) {
                if (binaryValue.charAt(i) == '1') count++;
            }
        
        /* -------------------- END OF INSERTION --------------------*/

        return count % 2 == checkbit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numCases = sc.nextInt();

        for(int i = 0; i < numCases; i++) 
        {

            int value = sc.nextInt();

            int checkbit = sc.nextInt();

            if (solveErrorDetection(value, checkbit)) {
                System.out.println("Valid");
            }
            else {
                System.out.println("Corrupt");
            }
        }
    }
}
