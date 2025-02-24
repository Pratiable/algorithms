import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();

        long sum = 0;
        int tmp = 0;
        long now = 0;

        for (int i = 0; i < n; i++) {
            if (str.charAt(i) == '0') {
                sum += now;
                tmp = 0;
                now = 0;
                continue;
            }
            tmp++;
            now += tmp;
        }

        if (str.charAt(n - 1) == '1') {
            sum += now;
        }

        System.out.println(sum);
    }
}