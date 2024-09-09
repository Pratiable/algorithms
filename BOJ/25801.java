import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int[] cnt = new int[26];

        for (int i = 0; i < str.length(); i++) {
            cnt[str.charAt(i) - 'a']++;
        }

        boolean even = true, odd = true;

        for (int i = 0; i < cnt.length; i++) {
            int now = cnt[i];
            if (now == 0) continue;
            if (now % 2 == 0) {
                odd = false;
            } else {
                even = false;
            }
        }

        System.out.println(even ? "0" : odd ? "1" : "0/1");
    }
}