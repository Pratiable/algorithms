import java.io.*;
import java.util.*;

public class Main {
    public static StringBuilder sb = new StringBuilder();
    public static int n;
    public static int max = 0;
    public static int[] nums;
    public static int[] result;
    public static boolean[] check;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        check = new boolean[n];
        nums = new int[n];
        result = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        make(0);

        System.out.println(max);
    }

    public static void make(int count) {
        if (count == n) {
            int sum = 0;
            for (int j = 0; j < n - 1; j++){
                sum += Math.abs(result[j] - result[j + 1]);
            }
            max = Math.max(sum, max);
            return;
        }
        for (int k = 0; k < n; k++) {
            if(check[k]) continue;
            result[count] = nums[k];
            check[k] = true;
            make(count + 1);
            check[k] = false;
        }
    }
}