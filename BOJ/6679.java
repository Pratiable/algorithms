import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = new StringBuilder();

        for (int i = 2992; i < 10000; i++) {
            if (sumDigits(i, 10) == sumDigits(i, 12) && sumDigits(i, 12) == sumDigits(i, 16)) {
                sb.append(i).append("\n");
            }
        }

        System.out.println(sb);
    }

    static int sumDigits(int n, int baseN) {
        int sum = 0;
        
        while (n > 0) {
            sum += n % baseN;
            n /= baseN;
        }
        
        return sum;
    }
}
