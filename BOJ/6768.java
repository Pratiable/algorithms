import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()) - 1;
        if (n < 3) {
            System.out.println(0);
            return;
        }

        System.out.println((n * (n - 1) * (n - 2)) / 6);
    }
}