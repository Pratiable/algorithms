import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double n = Double.parseDouble(br.readLine());
        if (n <= 30) {
            System.out.printf("%.1f", n / 2);
            return;
        }

        System.out.printf("%.1f", 15 + ((n - 30) * ((double) 45 / 30)));
    }
}