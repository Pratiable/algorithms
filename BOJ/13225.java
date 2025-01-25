import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int c = Integer.parseInt(br.readLine());

        for (int i = 0; i < c; i++) {
            int n = Integer.parseInt(br.readLine());
            int cnt = 0;

            for (int j = 1; j * j <= n; j++) {
                if (n % j == 0) {
                    if (j * j == n) {
                        cnt++;
                    } else {
                        cnt += 2;
                    }
                }
            }

            sb.append(n).append(" ").append(cnt).append("\n");
        }

        System.out.println(sb);
    }
}