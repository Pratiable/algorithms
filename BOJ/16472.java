import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();

        int max = 0;
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < str.length(); i++) {
            set.clear();
            int curLength = 1;

            if (i != 0) {
                if (str.charAt(i) == str.charAt(i - 1)) continue;
            }

            set.add(str.charAt(i));
            for (int j = i + 1; j < str.length(); j++) {
                Character next = str.charAt(j);

                if (!set.contains(next) && set.size() == n) break;
                set.add(next);
                curLength++;
            }

            max = Math.max(curLength, max);
        }

        System.out.println(max);
    }
}