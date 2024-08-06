import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int t = 0; t < T; t++) {
            String id = br.readLine();
            int sum = 0;

            for (int i = 0; i < id.length(); i++) {
                sum += id.charAt(i) - '0';
            }
            int lastThree = Integer.parseInt(id.substring(10)) * 10;
            int ans = sum + lastThree < 1000 ? sum + lastThree + 1000 : sum + lastThree > 9999 ? sum + lastThree - 10000 : sum + lastThree;

            sb.append(String.format("%04d", ans)).append("\n");
        }
        System.out.println(sb);
    }
}