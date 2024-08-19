import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String std = br.readLine();
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            boolean isMatch = true;
            for (int j = 0; j < 9; j++) {
                if (std.charAt(j) != '*' && std.charAt(j) != str.charAt(j)) {
                    isMatch = false;
                    break;
                }
            }

            if (isMatch) {
                cnt++;
                sb.append(str).append("\n");
            }
        }

        System.out.println(cnt);
        System.out.println(sb);
    }
}