import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            int a = 0;
            int b = 0;

            for (char c : str.toCharArray()) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    a++;
                } else {
                    b++;
                }
            }

            sb.append(str).append("\n");
            sb.append(a > b ? "1" : "0").append("\n");
        }

        System.out.println(sb);
    }
}