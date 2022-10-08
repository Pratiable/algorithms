import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        int min = (int) Math.ceil(Math.sqrt(m));
        int max = (int) Math.sqrt(n);
        int sum = 0;

        for (int i = min; i <= max; i++) {
            sum += Math.pow(i, 2);
        }
        if (sum == 0) {
            System.out.println(-1);
            return;
        }

        System.out.println(sum);
        System.out.println((int) Math.pow(min, 2));
    }
}