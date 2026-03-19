import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        String str;

        for (int t = 0; t < n; t++) {
            str = br.readLine();
            int g = 0;
            int b = 0;

            for (int i = 0; i < str.length(); i++) {
                char cur = Character.toLowerCase(str.charAt(i));
                if (cur == 'g') g++;
                else if (cur == 'b') b++;
            }

            sb.append(str).append(" is ").append(g > b ? "GOOD" : g < b ? "A BADDY" : "NEUTRAL").append("\n");
        }

        System.out.print(sb);
    }
}
