import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String a = br.readLine();
        boolean isConnected = true;

        for (int i = 0; i < N * 2 - 1; i++) {
            if (a.charAt(i) == a.charAt(i + 1)) {
                isConnected = false;
                break;
            }
        }

        System.out.print(isConnected ? "Yes" : "No");
    }
}
