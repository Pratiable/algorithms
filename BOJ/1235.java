import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] strs = new String[n];

        for (int i = 0; i < n; i++) {
            strs[i] = br.readLine();
        }

        int len = strs[0].length();

        for (int i = 0; i < len; i++) {
            Set<String> set = new HashSet<>();

            for (int j = 0; j < strs.length; j++) {
                set.add(strs[j].substring(len - i - 1));
            }

            if (set.size() == strs.length) {
                System.out.println(i + 1);
                return;
            }
        }
    }
}