import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        long N = Long.parseLong(br.readLine());
        long sum = N * (N + 1) / 2;

        sb.append(sum).append("\n");
        sb.append(sum * sum).append("\n");
        sb.append(sum * sum);

        System.out.println(sb);
    }
}