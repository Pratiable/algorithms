import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        String str = br.readLine();
        StringBuilder sb = new StringBuilder();
        String[] nums = {"O", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X", "XI", "XII"};

        for (int i = 0; i < 12; i++) {
            if (str.contains(nums[i + 1])) {
                sb.append(i + 1).append(" ");
            }
        }

        System.out.println(sb);
    }
}