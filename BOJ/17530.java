import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        for (int i = 1; i < n; i++) {
            if (Integer.parseInt(br.readLine()) > c) {
                System.out.println("N");
                return;
            }
        }

        System.out.println("S");
    }
}