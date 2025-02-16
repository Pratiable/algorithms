import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            String str = br.readLine();
            int errCnt = 0;
            for (int i = 0; i < str.length(); i += 8) {
                int cnt = 0;
                for (int j = i; j < i + 7; j++) {
                    if (str.charAt(j) == '1') cnt++;
                }
                char now = (cnt % 2 == 1) ? '1' : '0';
                if (str.charAt(i + 7) != now) errCnt++;
            }
            
            sb.append(errCnt).append("\n");
        }

        System.out.println(sb);
    }
}