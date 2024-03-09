import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        double prev = Double.parseDouble(br.readLine());
        while (true) {
            double cur = Double.parseDouble(br.readLine());
            if (cur == 999) break;
            sb.append(String.format("%.2f\n", cur - prev));
            prev = cur;
        }

        System.out.println(sb);
    }
}