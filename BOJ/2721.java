import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int t = 0; t < T; t++) {
            int n = Integer.parseInt(br.readLine());
            int sum = 0;
            int now = 1;
            for (int i = 1; i <= n; i++) {
                now += i + 1;
                sum += (i * now);
            }
            sb.append(sum).append("\n");
        }

        System.out.println(sb);
    }
}
