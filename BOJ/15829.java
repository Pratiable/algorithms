import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String str = br.readLine();
        long result = 0;
        long v = 1;

        for (int i = 0; i < n; i++) {
            if (i != 0) {
                v *= 31;
                v %= 1234567891;
            }
            long now = (long) str.charAt(i) - 96;
            result += (now * v) % 1234567891;
        }

        System.out.println(result % 1234567891);
    }
}