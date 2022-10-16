import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            int n = Integer.parseInt(br.readLine());
            sum += n;
            if (sum == 100) {
                System.out.println(100);
                return;
            } else if (sum > 100) {
                System.out.println(sum - 100 <= 100 - (sum - n) ? sum : sum - n);
                return;
            }
        }

        System.out.println(sum);

        bw.flush();
        bw.close();
    }
}