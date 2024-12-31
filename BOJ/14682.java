import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());
        int sum = 0;
        int temp = n;

        for (int i = 0; i <= k; i++) {
            sum += temp;
            temp *= 10;
        }

        System.out.println(sum);
    }
}