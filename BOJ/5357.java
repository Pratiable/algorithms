import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for (int t = 0; t < n; t++) {
            String str = br.readLine();

            for (int i = 0; i < str.length(); i++) {
                if (i == 0 || str.charAt(i) != str.charAt(i - 1)) {
                    sb.append(str.charAt(i));
                }
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}
