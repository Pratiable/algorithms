import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        Set<String> set = new HashSet<>();

        while (st.hasMoreTokens()) {
            set.add(st.nextToken());
        }

        for (int i = 0; i < str.length(); i++) {
            char now = str.charAt(i);
            if (Character.isUpperCase(now) && set.contains(String.valueOf(now))) {
                sb.append(Character.toLowerCase(now));
            } else {
                sb.append(now);
            }
        }

        System.out.println(sb);
    }
}