import java.io.*;
import java.util.*;

public class Main {
    public static StringBuilder sb = new StringBuilder();
    public static int n;
    public static int k;
    public static int max = 0;
    public static int[] result;
    public static int currentCount = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        result = new int[12];
        make(0, 0);
        if (sb.length() == 0) {
            System.out.println(-1);
            return;
        }
        System.out.println(sb);
    }

    public static void make(int count, int sum) {
        if (sum > n) return;
        if (sum == n) {
            currentCount++;
            if (currentCount == k) {
                sb.append(result[0]);
                for (int i = 1; i < result.length; i++) {
                    if (result[i] == 0) continue;
                    sb.append("+").append(result[i]);
                }
            }
            return;
        }
        for (int k = 1; k <= 3; k++) {
            result[count] = k;
            make(count + 1, sum + k);
            result[count] = 0;
        }
    }
}