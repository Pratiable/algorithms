import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for(int t = 0; t < T; t++) {
            int n = Integer.parseInt(br.readLine().trim());
            sb.append((long) n * (n + 1) * (2L * n + 1) / 6).append("\n");
        }

        System.out.println(sb);
    }
}
