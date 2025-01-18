import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        while (true) {
            int sum = 0;
            int tmp = n;
            while (tmp > 0) {
                sum += (tmp % 10);
                tmp /= 10;
            }

            if (n % sum == 0) {
                System.out.println(n);
                return;
            }
            n++;
        }
    }
}
