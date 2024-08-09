import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine().toLowerCase();
        int[] counts = new int[26];

        for (int i = 0; i < n; i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                counts[c - 'a']++;
            }
        }

        int max = 0;
        for (int i = 0; i < 26; i++) {
            if (counts[i] > max) {
                max = counts[i];
            }
        }

        System.out.println(max);
    }
}