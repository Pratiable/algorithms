import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int[] cnt = new int[26];
        for (int i = 0; i < n; i++) {
            char now = str.charAt(i);
            cnt[now - 'a']++;
        }

        int max = Integer.MIN_VALUE;
        int maxIdx = -1;

        for (int i = 0; i < 26; i++) {
            if (cnt[i] > max) {
                max = cnt[i];
                maxIdx = i;
            }
        }

        System.out.println((char) (maxIdx + 97) + " " + max);
    }
}
