import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] nums = new int[n + 1];
        for (int i = 0; i < n; i++) {
            nums[Integer.parseInt(br.readLine())] = i;
        }
        int claps = 0;

        for (int i = 2; i < n + 1; i++) {
            if (nums[i - 1] > nums[i]) claps++;
        }

        System.out.println(claps);


    }
}