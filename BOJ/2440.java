import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()) + 1;
        StringBuilder sb = new StringBuilder();

        while (n-- > 0) {
            sb.append("*".repeat(n)).append("\n");
        }

        System.out.println(sb);
    }
}