import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        if (n == 0) {
            System.out.println(1);
        } else if (n == 1) {
            System.out.println(0);
        } else if (n % 2 == 0) {
            System.out.println("8".repeat(Math.max(0, n / 2)));
        } else {
            System.out.println("4" + "8".repeat(Math.max(0, (n - 1) / 2)));
        }
    }
}
