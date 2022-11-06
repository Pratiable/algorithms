import java.io.*;
import java.util.*;

public class Main {
    public static String[] nums;
    public static HashSet<String> set = new HashSet<>();
    public static HashMap<Integer, Boolean> map = new HashMap<>();
    public static int n;
    public static int k;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(br.readLine());
        k = Integer.parseInt(br.readLine());
        nums = new String[n];
        for (int i = 0; i < n; i++) {
            nums[i] = br.readLine();
        }
        make("", 0);

        System.out.println(set.size());
    }

    public static void make(String num, int count) {
        if (count == k) {
            set.add(num);
            return;
        }
        for (int j = 0; j < nums.length; j++) {
            if (map.containsKey(j) && map.get(j)) continue;
            map.put(j, true);
            make(num + nums[j], count + 1);
            map.put(j, false);
        }
    }
}