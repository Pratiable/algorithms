import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 1;
        String prev = "";

        for (int i = 0; i < n; i++) {
            String now = br.readLine();
            if (!now.equals(prev)) {
                cnt++;
                prev = now;
            }
        }

        System.out.println(cnt);
    }
}
