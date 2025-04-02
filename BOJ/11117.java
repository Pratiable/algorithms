import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for (int t = 0; t < n; t++) {
            int[] alphabets = new int[26];
            String cookieBox = br.readLine();
            for (int j = 0; j < cookieBox.length(); j++) {
                alphabets[cookieBox.charAt(j) - 'A']++;
            }

            int w = Integer.parseInt(br.readLine());

            for (int i = 0; i < w; i++) {
                String next = br.readLine();
                int[] alphaChecks = new int[26];
                for (int j = 0; j < next.length(); j++) {
                    alphaChecks[next.charAt(j) - 'A']++;
                }

                boolean canMake = true;
                for (int j = 0; j < 26; j++) {
                    if (alphaChecks[j] > alphabets[j]) {
                        canMake = false;
                        break;
                    }
                }

                sb.append(canMake ? "YES\n" : "NO\n");
            }
        }

        System.out.println(sb);
    }
}