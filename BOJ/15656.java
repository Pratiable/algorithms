import java.io.*;
import java.util.*;

public class Main {
    public static StringBuilder sb = new StringBuilder();
    public static boolean[] check;
    public static int n;
    public static int m;
    public static int[] nums;
    public static int[] result;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        nums = new int[n];
        result = new int[m];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            nums[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(nums);
        make(0);

        System.out.println(sb);
    }

    public static void make(int count) {
        if (count == m) {
            for (int j = 0; j < m; j++){
                sb.append(result[j]).append(" ");
            }
            sb.append("\n");
            return;
        }
        for (int k = 0; k < n; k++) {
            result[count] = nums[k];
            make(count + 1);
        }
    }
}