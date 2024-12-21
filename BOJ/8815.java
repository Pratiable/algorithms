import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine().trim());

        String pattern = "ABCBCDCDADAB";

        for (int t = 0; t < T; t++) {
            int n = Integer.parseInt(br.readLine().trim());
            int idx = (n - 1) % 12;
            sb.append(pattern.charAt(idx)).append("\n");
        }

        System.out.println(sb);
    }
}