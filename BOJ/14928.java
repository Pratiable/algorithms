import java.io.*;

public class Main {
    public static int MOD = 20000303;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();
        int result = 0;
        for (int i = 0; i < n.length(); i++) {
            result *= 10;
            result += n.charAt(i) - '0';
            result %= MOD;
        }
        System.out.println(result);
    }
}