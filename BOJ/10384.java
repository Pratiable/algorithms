import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            String str = br.readLine().toLowerCase();
            int[] alpCnts = new int[26];
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) - 'a' < 0 || str.charAt(j) - 'a' > 26) continue;
                alpCnts[str.charAt(j) - 'a']++;
            }
            int min = Integer.MAX_VALUE;

            for (int j = 0; j < alpCnts.length; j++) {
                if (alpCnts[j] < min) {
                    min = alpCnts[j];
                }
            }

            sb.append("Case ").append(i + 1).append(": ");

            if (min >= 3) {
                sb.append("Triple pangram!!!");
            } else if (min == 2) {
                sb.append("Double pangram!!");
            } else if (min == 1) {
                sb.append("Pangram!");
            } else {
                sb.append("Not a pangram");
            }

            sb.append("\n");
        }

        System.out.println(sb);
    }
}
