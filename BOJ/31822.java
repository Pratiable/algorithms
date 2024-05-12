import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String code = br.readLine();
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            String now = br.readLine();
            boolean isFit = true;
            for (int j = 0; j < 5; j++) {
                if (now.charAt(j) != code.charAt(j)) isFit = false;
            }

            if (isFit) cnt++;
        }

        System.out.println(cnt);
    }
}
