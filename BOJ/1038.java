import java.io.*;
import java.util.*;

public class Main {
    static ArrayList<Long> nums = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < 10; i++) {
            make(i);
        }
        Collections.sort(nums);

        System.out.println(n >= nums.size() ? -1 : nums.get(n));
    }

    static void make(long cur) {
        nums.add(cur);

        for (long i = 0; i < cur % 10; i++) {
            make(cur * 10 + i);
        }
    }
}