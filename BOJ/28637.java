import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String str = br.readLine();
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < str.length(); j++) {
                char c = str.charAt(j);
                if (Character.isUpperCase(c)) {
                    if (j == 0) {
                        sb.append(Character.toLowerCase(c));
                    } else {
                        sb.append('_').append(Character.toLowerCase(c));
                    }
                } else {
                    sb.append(c);
                }
            }

            System.out.println(sb);
        }
    }
}
