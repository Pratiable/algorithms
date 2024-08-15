import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine());
        long num = 1;
        boolean isRight = false;

        while (num <= n) {
            if (num == n) {
                isRight = true;
                break;
            }
            num *= 2;
        }

        System.out.println(isRight ? 1 : 0);
    }
}