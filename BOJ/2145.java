import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) {
            String N = br.readLine();
            if (N.equals("0")) break;
            int n = Integer.parseInt(N);

            while (n >= 10) {
                int sum = 0;

                while (n > 0) {
                    sum += n % 10;
                    n /= 10;
                }

                n = sum;
            }

            sb.append(n).append("\n");
        }

        System.out.print(sb);
    }
}
