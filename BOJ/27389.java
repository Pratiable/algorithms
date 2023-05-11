import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        double result = n / 4.0;

        if (result == Math.floor(result)) {
            System.out.printf("%.1f", result);
        } else {
            System.out.printf("%.2f", result);
        }
    }
}
