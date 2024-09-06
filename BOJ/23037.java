import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            int num = str.charAt(i) - '0';
            sum += (int) Math.pow(num, 5);
        }

        System.out.println(sum);
    }
}