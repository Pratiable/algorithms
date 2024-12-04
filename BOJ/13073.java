import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int t = 0; t < T; t++) {
            int n = Integer.parseInt(br.readLine());
            int a = n * (n + 1) / 2;
            int b = n * n;
            int c = n * (n + 1);
            sb.append(a).append(" ").append(b).append(" ").append(c).append("\n");
        }

        System.out.println(sb);
    }
}
