import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String str = br.readLine();
        int[] nums = new int[10];
        for (int i = 0; i < str.length(); i++) nums[str.charAt(i) - '0']++;

        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String now = br.readLine();
            int a = 0;
            int b = 0;
            int[] check = new int[10];

            for (int j = 0; j < 4; j++) {
                char c = now.charAt(j);
                int d = c - '0';
                check[d]++;
                if (c == str.charAt(j)) {
                    b++;
                }
            }

            for (int j = 0; j < 10; j++) a += Math.min(nums[j], check[j]);
            sb.append(a).append(" ").append(b).append("\n");
        }

        System.out.println(sb);
    }
}