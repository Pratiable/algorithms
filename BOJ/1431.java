import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        String[] serials = new String[N];

        for (int i = 0; i < N; i++) {
            serials[i] = br.readLine();
        }

        Arrays.sort(serials, (a, b) -> {
            if (a.length() != b.length()) {
                return a.length() - b.length();
            }

            int compare = 0;
            for (int i = 0; i < a.length(); i++) {
                char ca = a.charAt(i);
                char cb = b.charAt(i);
                if (ca >= '0' && ca <= '9') {
                    compare += ca - '0';
                }

                if (cb >= '0' && cb <= '9') {
                    compare -= cb - '0';
                }
            }

            if (compare != 0) {
                return compare > 0 ? 1 : -1;
            }

            return a.compareTo(b);
        });

        for (String serial: serials) {
            sb.append(serial).append("\n");
        }

        System.out.println(sb);
    }
}
