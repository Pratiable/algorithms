import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] nums = new int[10];
        int[] counts = new int[1001];
        int sum = 0;

        for (int i = 0; i < 10; i++) {
            nums[i] = Integer.parseInt(br.readLine());
            sum += nums[i];
            counts[nums[i]]++;
        }

        int avg = sum / 10;
        int maxNum = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 10; i < counts.length; i ++) {
            if (counts[i] > max) {
                max = counts[i];
                maxNum = i;
            }
        }

        System.out.println(avg);
        System.out.println(maxNum);
    }
}