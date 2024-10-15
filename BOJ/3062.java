import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int t = 0; t < T; t++) {
            StringBuilder rsb = new StringBuilder();
            int n = Integer.parseInt(br.readLine());
            rsb.append(n);
            int reversed = Integer.parseInt(rsb.reverse().toString());
            int sum = n + reversed;
            rsb = new StringBuilder();
            rsb.append(sum);

            sb.append(rsb.toString().contentEquals(rsb.reverse()) ? "YES\n" : "NO\n");
        }

        System.out.println(sb);
    }
}