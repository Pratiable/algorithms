import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int k = Integer.parseInt(br.readLine());
        double r = Math.min(Math.max(25 + 0.01 * k, 100), 2000);

        System.out.printf("%.2f%n", r);
    }
}
