import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int[] counts = new int[26];

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            counts[c - 'a']++;
        }

        boolean even = true;
        boolean odd = true;

        for (int i = 0; i < 26; i++) {
            if (counts[i] > 0) {
                if (counts[i] % 2 == 0) {
                    odd = false;
                } else {
                    even = false;
                }
            }
        }

        System.out.println(even ? 0 : odd ? 1 : 2);
    }
}
