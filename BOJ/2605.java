import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> nums = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            int num = Integer.parseInt(st.nextToken());
            nums.add(nums.size() - num, i);
        }

        for (int i = 0; i < n; i++) {
            sb.append(nums.get(i)).append(" ");
        }

        System.out.print(sb);
    }
}
