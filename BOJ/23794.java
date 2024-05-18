import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        sb.append("@@").append("@".repeat(n)).append("\n");

        for (int i = 0; i < n; i++) {
            sb.append("@").append(" ".repeat(n)).append("@\n");
        }

        sb.append("@@").append("@".repeat(n)).append("\n");

        System.out.println(sb);
    }
}