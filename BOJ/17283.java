import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        int r = Integer.parseInt(br.readLine());
        int sum = 0;
        int prev = l;
        int branches = 2;

        while (true) {
            int cur = (prev * r) / 100;
            if (cur < 6) break;
            sum += branches * cur;
            prev = cur;
            branches *= 2;
        }

        System.out.println(sum);
    }
}
