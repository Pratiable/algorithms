import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        String pattern = br.readLine();

        int asterisk = pattern.indexOf('*');
        String before = pattern.substring(0, asterisk);
        String after = pattern.substring(asterisk + 1);

        for (int i = 0; i < N; i++) {
            String str = br.readLine();

            if (str.length() < before.length() + after.length()) {
                sb.append("NE").append("\n");
            } else if (str.startsWith(before) && str.endsWith(after)) {
                sb.append("DA").append("\n");
            } else {
                sb.append("NE").append("\n");
            }
        }

        System.out.println(sb);
    }
}
