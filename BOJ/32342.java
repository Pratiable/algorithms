import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int t = 0; t < T; t++) {
            String str = br.readLine();
            int cnt = 0;
            for (int i = 0; i < str.length() - 2; i++) {
                if (str.charAt(i) == 'W' && str.charAt(i + 1) == 'O' && str.charAt(i + 2) == 'W') cnt++;
            }
            sb.append(cnt).append("\n");
        }

        System.out.println(sb);
    }
}
