import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < N; i++) {
            String str = br.readLine();

            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ' ') continue;
                map.put(str.charAt(j), map.getOrDefault(str.charAt(j), 0) + 1);
            }
        }

        List<Character> keys = new ArrayList<>(map.keySet());

        for (char cur: keys) {
            sb.append(cur).append(" ").append(map.get(cur)).append("\n");
        }

        System.out.print(sb);
    }
}
