import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append("G".repeat(n)).append("...".repeat(n)).append("\n");
        }
        for (int i = 0; i < n; i++) {
            sb.append(".".repeat(n)).append("I".repeat(n)).append(".".repeat(n)).append("T".repeat(n)).append("\n");
        }
        for (int i = 0; i < n; i++) {
            sb.append("..".repeat(n)).append("S".repeat(n)).append(".".repeat(n)).append("\n");
        }

        System.out.println(sb);
    }
}
