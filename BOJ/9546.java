import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            int k = Integer.parseInt(br.readLine());
            int result = 0;
            for (int i = 0; i < k; i++) {
                result = 2 * result + 1;
            }
            sb.append(result).append("\n");
        }

        System.out.println(sb);
    }
}
