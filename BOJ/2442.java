import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for(int i = 1; i <= n; i++) {
            sb.append(" ".repeat(n - i)).append("*".repeat((2 * i) - 1)).append("\n");
        }

        System.out.println(sb);
    }
}