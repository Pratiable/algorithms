import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        long[] f = new long[46];
        f[0] = 1;
        f[1] = 1;

        for (int i = 2; i < 46; i++) {
            f[i] = f[i - 1] + f[i - 2];
        }

        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(br.readLine());
            sb.append(f[x]).append("\n");
        }

        System.out.println(sb);
    }
}
