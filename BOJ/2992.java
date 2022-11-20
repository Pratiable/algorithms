import java.io.*;
import java.util.Objects;

public class Main {
    public static int n;
    public static String[] nums;
    static boolean[] visited;
    static int target;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        n = Integer.parseInt(str);
        target = 1000000;
        nums = new String[str.length()];
        visited = new boolean[str.length()];
        for (int i = 0; i < str.length(); i++) {
            nums[i] = String.valueOf(str.charAt(i));
        }

        make("", 0);

        System.out.println(target == 1000000 ? 0 : target);
    }

    public static void make(String num, int depth) {
        if (depth == nums.length) {
            int parsedInt = Integer.parseInt(num);
            if (parsedInt <= n) return;
            target = Math.min(parsedInt, target);
            return;
        }

        for (int j = 0; j < nums.length; j++) {
            if (depth == 0 && Objects.equals(nums[j], "0")) continue;
            if (visited[j]) continue;
            visited[j] = true;
            make(num + nums[j], depth + 1);
            visited[j] = false;
        }
    }
}