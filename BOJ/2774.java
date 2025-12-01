import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        HashSet<Character> set = new HashSet<>();

        for (int t = 0; t < T; t++) {
            String X = br.readLine();

            for (int i = 0; i < X.length(); i++) {
                set.add(X.charAt(i));
            }

            sb.append(set.size()).append("\n");
            set.clear();
        }

        System.out.print(sb);
    }
}
