import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String target = br.readLine();
        int limit = (int) Math.pow(2, n);
        String[] binaryNums = new String[limit];

        for (int i = 0; i < limit; i++) {
            binaryNums[i] = String.format("%10s", Integer.toBinaryString(i)).replace(" ", "0").substring(10 - n);
        }

        Arrays.sort(binaryNums, (p1, p2) -> {
            if (countOne(p1) > countOne(p2)) {
                return 1;
            } else if (countOne(p1) == countOne(p2)) {
                String p1s = new StringBuilder(p1).reverse().toString();
                String p2s = new StringBuilder(p2).reverse().toString();
                return Integer.parseInt(p1s, 2) > Integer.parseInt(p2s, 2) ? 1 : -1;
            }
            return -1;
        });

        for (int i = 0; i < limit; i++) {
            if (target.equals(binaryNums[i])) {
                System.out.println(i);
                return;
            }
        }
    }

    static int countOne(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '1') count++;
        }
        return count;
    }
}
