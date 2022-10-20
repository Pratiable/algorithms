import java.io.*;
import java.util.Objects;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = br.readLine();
        String b = br.readLine();
        int[] first = new int[26];
        int[] second = new int[26];
        int result = 0;

        for (int i = 0; i < a.length(); i++) {
            first[a.charAt(i) - 97]++;
        }
        for (int j = 0; j < b.length(); j++) {
            second[b.charAt(j) - 97]++;
        }

        for (int k = 0; k < first.length; k++) {
            if (first[k] != second[k]) {
                result += Math.max(first[k], second[k]) - Math.min(first[k], second[k]);
            }
        }

        System.out.println(result);
    }
}
