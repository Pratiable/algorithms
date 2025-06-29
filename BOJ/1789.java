import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long s = Long.parseLong(br.readLine());
        long sum = 0;
        int n = 0;

        while (true) {
            n++;
            sum += n;
            if (sum > s) {
                System.out.println(--n);
                return;
            }
        }
    }
}
