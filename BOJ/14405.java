import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int idx = 0;

        while (idx < str.length()) {
            if (idx + 2 <= str.length() && str.startsWith("pi", idx)) {
                idx += 2;
            } else if (idx + 2 <= str.length() && str.startsWith("ka", idx)) {
                idx += 2;
            } else if (idx + 3 <= str.length() && str.startsWith("chu", idx)) {
                idx += 3;
            } else {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
    }
}