import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int ans = 0;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            int cur = 1;

            for (int j = 0; j < num % 10; j++) cur *= num / 10;

            ans += cur;
        }

        System.out.println(ans);
    }
}
