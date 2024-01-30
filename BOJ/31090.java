import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int t = 0; t < T; t++) {
            int n = Integer.parseInt(br.readLine());
            int num = n % 100;
            if ((n + 1) % num == 0) {
                sb.append("Good\n");
            } else {
                sb.append("Bye\n");
            }
        }

        System.out.println(sb);
    }
}
